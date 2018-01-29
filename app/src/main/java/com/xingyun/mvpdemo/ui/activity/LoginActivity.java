package com.xingyun.mvpdemo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.Toast;

import com.xingyun.mvpdemo.Constants;
import com.xingyun.mvpdemo.MainActivity;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseActivity;
import com.xingyun.mvpdemo.contract.LoginContract;
import com.xingyun.mvpdemo.interf.LoadingCancelListener;
import com.xingyun.mvpdemo.presenter.LoginPresenter;
import com.xingyun.slimvan.util.SPUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginContract.View {

    @BindView(R.id.et_name)
    AppCompatEditText etName;
    @BindView(R.id.et_password)
    AppCompatEditText etPassword;
    @BindView(R.id.btn_submit)
    Button btnSubmit;
    @BindView(R.id.input_username)
    TextInputLayout inputUsername;
    @BindView(R.id.input_password)
    TextInputLayout inputPassword;

    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String userName = new SPUtils(Constants.SP_BASE_NAME).getString(Constants.SP_USER_NAME);
        if (TextUtils.isEmpty(userName)) {
            startActivity(new Intent(getContext(), MainActivity.class));
            finish();
        }

        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        setPresenter();
        initLoadingDialog(new LoadingCancelListener() {
            @Override
            public void onCancel() {
                Toast.makeText(getContext(), "用户取消", Toast.LENGTH_SHORT).show();
                presenter.cancelRequest();
            }
        });
    }

    private void setPresenter() {
        presenter = new LoginPresenter(getContext());
        presenter.attachView(this);
    }

    @Override
    public void showLoading() {
        showLoadingDialog();
    }

    @Override
    public void showEmpty() {
        hideLoadingDialog();
    }

    @Override
    public void showError() {
        hideLoadingDialog();
    }

    @Override
    public void onLoginSuccess() {
        hideLoadingDialog();
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
        new SPUtils(Constants.SP_BASE_NAME).put(Constants.SP_USER_NAME, "slimvan");
        startActivity(new Intent(getContext(), MainActivity.class));
    }

    @Override
    public void onLoginFail(int errorType) {
        hideLoadingDialog();
        switch (errorType) {
            case 0:
                inputUsername.setError("请输入您的账号");
                break;
            case 1:
                inputPassword.setError("请输入您的密码");
                break;
        }

    }

    @OnClick(R.id.btn_submit)
    public void onViewClicked() {
        inputUsername.setError(null);
        inputPassword.setError(null);
        presenter.login(etName.getText().toString().trim(), etPassword.getText().toString().trim());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
