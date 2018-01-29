package com.xingyun.mvpdemo.base;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.interf.LoadingCancelListener;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by lin on 2016/8/2.
 */
public abstract class BaseFragment extends Fragment {
    private View mRootvView;
    Unbinder unbinder;
    private AlertDialog mLoadingDialog = null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootvView = inflater.inflate(getLayoutResource(), container, false);
        unbinder = ButterKnife.bind(this, mRootvView);
        initView(mRootvView);
        
        return mRootvView;
    }

    protected abstract int getLayoutResource();

    protected abstract void initView(View view);

    public void initLoadingDialog(final LoadingCancelListener listener) {
        mLoadingDialog = new AlertDialog.Builder(getContext())
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
    public void onDestroyView() {
        super.onDestroyView();
        if (unbinder != null) {
            unbinder.unbind();
        }
    }
}
