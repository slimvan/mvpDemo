package com.xingyun.mvpdemo.presenter;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;

import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.LoginContract;
import com.xingyun.slimvan.util.SPUtils;

/**
 * Created by xingyun on 2018/1/3.
 */

public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {
    private Context mContext;
    private Handler mHandler;
    private Runnable runnable;

    public LoginPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void login(String username, String password) {
        if (TextUtils.isEmpty(username)) {
            getView().onLoginFail(0);
        } else if (TextUtils.isEmpty(password)) {
            getView().onLoginFail(1);
        }else{
            getView().showLoading();
            mHandler = new Handler();
            runnable = new Runnable() {
                @Override
                public void run() {
                    getView().onLoginSuccess();
                }
            };
            mHandler.postDelayed(runnable, 2000);
        }
    }

    @Override
    public void cancelRequest() {
        if (mHandler != null && runnable != null) {
            mHandler.removeCallbacks(runnable);
        }
    }
}
