package com.xingyun.slimvan.base;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;

import com.bigkoo.svprogresshud.SVProgressHUD;
import com.xingyun.slimvan.R;
import com.xingyun.slimvan.bean.MessageEvent;
import com.xingyun.slimvan.listener.PermissionsResultListener;
import com.xingyun.slimvan.util.LogUtils;
import com.xingyun.slimvan.util.SPUtils;
import com.xingyun.slimvan.util.SkinHelper;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Activity基类
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected final String TAG = this.getClass().getSimpleName();

    protected Context mContext;

    /**
     * 加载提示框
     */
    private ProgressDialog mProgressDialog;
    private SVProgressHUD mSVProgress;


    protected Context getContext() {
        return mContext;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.d(TAG, "onCreate...");
        mContext = this;
        super.setContentView(R.layout.activity_base);

        initIntentParams(getIntent());
        //Activity竖屏
        setActivityOrientation(this);
        //注册EventBus
        EventBus.getDefault().register(this);

    }

    /**
     * 获取传参
     *
     * @param intent
     */
    protected void initIntentParams(Intent intent) {

    }

    /**
     * 设置屏幕只能竖屏
     *
     * @param activity activity
     */
    public void setActivityOrientation(Activity activity) {
        activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    /**
     * 设置控件不可见
     *
     * @param v
     */
    public void gone(@NonNull View... v) {
        for (int i = 0; i < v.length; i++) {
            v[i].setVisibility(View.GONE);
        }
    }

    /**
     * 设置控件可见
     *
     * @param v
     */
    public void visible(@NonNull View... v) {
        for (int i = 0; i < v.length; i++) {
            v[i].setVisibility(View.VISIBLE);
        }
    }

    /**
     * 设置控件不可见
     *
     * @param v
     */
    public void invisible(@NonNull View... v) {
        for (int i = 0; i < v.length; i++) {
            v[i].setVisibility(View.INVISIBLE);
        }
    }

    /**
     * 显示提示框
     *
     * @param message
     */
    public void showProgressDialog(String message) {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(BaseActivity.this, ProgressDialog.STYLE_SPINNER);
            mProgressDialog.setCancelable(true);
        }
        mProgressDialog.setMessage(!TextUtils.isEmpty(message) ? message : "加载中");
        mProgressDialog.show();
    }

    /**
     * 隐藏提示框
     */
    public void hideProgressDialog() {
        if (mProgressDialog != null) {
            mProgressDialog.dismiss();
        }
    }

    /**
     * 仿IOS加载提示框
     */
    public void showSVProgressHUD() {
        if (mSVProgress == null) {
            mSVProgress = new SVProgressHUD(this);
        }
        mSVProgress.showWithStatus("加载中", SVProgressHUD.SVProgressHUDMaskType.BlackCancel);
        mSVProgress.show();
    }

    /**
     * 隐藏仿IOS加载提示框
     */
    public void hideSVProgressHUD() {
        if (mSVProgress != null && mSVProgress.isShowing()) {
            mSVProgress.dismiss();
        }
    }

    private PermissionsResultListener mListener;

    private int mRequestCode;

    /**
     * 其他 Activity 继承 BaseActivity 调用 requestPermissions 方法
     *
     * @param desc        首次申请权限被拒绝后再次申请给用户的描述提示
     * @param permissions 要申请的权限数组
     * @param requestCode 申请标记值
     * @param listener    实现的接口
     */

    protected void requestPermissions(String desc, String[] permissions, int requestCode, PermissionsResultListener listener) {
        if (permissions == null || permissions.length == 0) {
            return;
        }
        mRequestCode = requestCode;
        mListener = listener;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkEachSelfPermission(permissions)) {// 检查是否声明了权限
                requestEachPermissions(desc, permissions, requestCode);
            } else {// 已经申请权限
                if (mListener != null) {
                    mListener.onPermissionGranted();
                }
            }
        } else {
            if (mListener != null) {
                mListener.onPermissionGranted();
            }
        }
    }

    /**
     * 申请权限前判断是否需要声明
     *
     * @param desc
     * @param permissions
     * @param requestCode
     */
    private void requestEachPermissions(String desc, String[] permissions, int requestCode) {
        if (shouldShowRequestPermissionRationale(permissions)) {// 需要再次声明
            showRationaleDialog(desc, permissions, requestCode);
        } else {
            ActivityCompat.requestPermissions(BaseActivity.this, permissions, requestCode);
        }
    }

    /**
     * 弹出声明的 Dialog
     *
     * @param desc
     * @param permissions
     * @param requestCode
     */
    private void showRationaleDialog(String desc, final String[] permissions, final int requestCode) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.tips))
                .setMessage(desc)
                .setPositiveButton(getResources().getString(R.string.confirm), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ActivityCompat.requestPermissions(BaseActivity.this, permissions, requestCode);
                    }
                })
                .setNegativeButton(getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setCancelable(false)
                .show();
    }


    /**
     * 再次申请权限时，是否需要声明
     *
     * @param permissions
     * @return
     */
    private boolean shouldShowRequestPermissionRationale(String[] permissions) {
        for (String permission : permissions) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, permission)) {
                return true;
            }
        }
        return false;
    }


    /**
     * 检察每个权限是否申请
     *
     * @param permissions
     * @return true 需要申请权限,false 已申请权限
     */
    private boolean checkEachSelfPermission(String[] permissions) {
        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
                return true;
            }
        }
        return false;
    }

    /**
     * 申请权限结果的回调
     *
     * @param requestCode
     * @param permissions
     * @param grantResults
     */
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == mRequestCode) {
            if (checkEachPermissionsGranted(grantResults)) {
                if (mListener != null) {
                    mListener.onPermissionGranted();
                }
            } else {// 用户拒绝申请权限
                if (mListener != null) {
                    mListener.onPermissionDenied();
                }
            }
        }
    }

    /**
     * 检查回调结果
     *
     * @param grantResults
     * @return
     */
    private boolean checkEachPermissionsGranted(int[] grantResults) {
        for (int result : grantResults) {
            if (result != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    @Subscribe(sticky = true, threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {
        /* Do something */
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtils.d(TAG, "onResume...");
        //判断界面主题颜色
        initActivityTheme();
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.d(TAG, "onStart..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtils.d(TAG, "onReStart...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtils.d(TAG, "onPause...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtils.d(TAG, "onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtils.d(TAG, "onDestroy...");
        //解绑EventBus
        EventBus.getDefault().unregister(this);
    }

    /*需要实现换肤 可以将BaseActivity继承自ATEActivity 重写此方法 否则继承AppcompatActivity即可*/
//    @Nullable
//    @Override
//    protected final String getATEKey() {
//        return PreferenceManager.getDefaultSharedPreferences(this).getBoolean("dark_theme", false) ?
//                "dark_theme" : "light_theme";
//    }

    /**
     * 判断界面主题颜色
     */
    private void initActivityTheme() {
        SPUtils sp = new SPUtils(SkinHelper.DEF_SHARE_NAME);
        int skin_type = sp.getInt(SkinHelper.SKIN_TYPE);
        switch (skin_type) {
            case 0:
                setTheme(R.style.AppTheme_red);
                break;
            case 1:
                setTheme(R.style.AppTheme_orange);
                break;
            case 2:
                setTheme(R.style.AppTheme_black);
                break;
            case 3:
                setTheme(R.style.AppTheme_green);
                break;
            case 4:
                setTheme(R.style.AppTheme_blue);
                break;
            case 5:
                setTheme(R.style.AppTheme_cyan);
                break;
            case 6:
                setTheme(R.style.AppTheme_purple);
                break;
        }
    }
}
