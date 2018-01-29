package com.xingyun.mvpdemo.presenter;

import android.content.Context;
import android.os.Handler;

import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.RecyclerViewContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xingyun on 2018/1/6.
 */

public class RecyclerViewPresenter extends BasePresenter<RecyclerViewContract.View> implements RecyclerViewContract.Presenter {
    private Context mContext;

    public RecyclerViewPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void refresh() {
        getView().showLoading();
        final List<String> data = new ArrayList<>();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1; i++) {
                    data.add("");
                }
                getView().onLoadSuccess(data);
            }
        }, 1000);
    }

    @Override
    public void loadMore() {
        final List<String> data = new ArrayList<>();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    data.add("");
                }
                getView().onLoadMoreSuccess(data);
            }
        }, 1000);
    }
}
