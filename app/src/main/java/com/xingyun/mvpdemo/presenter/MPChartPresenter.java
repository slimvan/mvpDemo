package com.xingyun.mvpdemo.presenter;

import android.app.Activity;
import android.content.Context;

import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.MPChartContract;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/13.
 * desc:
 */

public class MPChartPresenter extends BasePresenter<MPChartContract.View> implements MPChartContract.Presenter {
    private  Context mContext;

    public MPChartPresenter(Context mContext) {
        this.mContext = mContext;
    }
}
