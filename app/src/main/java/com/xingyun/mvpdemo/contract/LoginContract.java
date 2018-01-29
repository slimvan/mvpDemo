package com.xingyun.mvpdemo.contract;

import com.xingyun.mvpdemo.base.BaseView;

/**
 * Created by xingyun on 2018/1/3.
 */

public class LoginContract {

    public interface View extends BaseView {
        void onLoginSuccess();
        void onLoginFail(int errorType); //0 账号 1 密码
    }

    public interface Presenter {
        void login(String username, String password);
        void cancelRequest();
    }
}
