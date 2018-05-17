package com.xingyun.mvpdemo.base;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.gyf.barlibrary.ImmersionBar;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.interf.LoadingCancelListener;

import java.lang.ref.WeakReference;

/**
 * Created by lin on 2016/8/2.
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected WeakReference<Activity> mContext = null;//弱引用
    private AlertDialog mLoadingDialog = null;
    protected boolean statusBarSwitch = true;

    public void setStatusBarSwitch(boolean statusBarSwitch) {
        this.statusBarSwitch = statusBarSwitch;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = new WeakReference<Activity>(this);
    }

    public void initLoadingDialog(final LoadingCancelListener listener) {
        mLoadingDialog = new AlertDialog.Builder(this)
                .setView(R.layout.loading_view)
                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog) {
                        listener.onCancel();
                    }
                })
                .create();
    }

    public void showLoadingDialog() {
        if (mLoadingDialog != null) {
            mLoadingDialog.show();
        }
    }

    public void hideLoadingDialog() {
        if (mLoadingDialog != null && mLoadingDialog.isShowing()) {
            mLoadingDialog.dismiss();
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @TargetApi(19)
    protected void setTranslucentStatus(boolean on) {
        Window win = getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (statusBarSwitch) {
            ImmersionBar.with(this).statusBarColor(R.color.colorPrimary).fitsSystemWindows(true).init();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    protected Activity getContext() {
        if (null != mContext)
            return mContext.get();
        else
            return null;
    }


    public void initToolBar(Toolbar mToolBar) {
        if (null != mToolBar) {
            setSupportActionBar(mToolBar);
            getSupportActionBar().setDisplayShowHomeEnabled(false);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
