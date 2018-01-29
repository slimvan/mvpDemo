package com.xingyun.mvpdemo.presenter;

import android.content.Context;

import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.MovieDetailContract;
import com.xingyun.mvpdemo.http.DoubanApi;
import com.xingyun.mvpdemo.model.MovieDetailBean;
import com.xingyun.slimvan.http.MSubscriber;
import com.xingyun.slimvan.http.RetrofitBuilder;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/24.
 * desc:
 */

public class MovieDetailPresenter extends BasePresenter<MovieDetailContract.View> implements MovieDetailContract.Presenter {
    private Context mContext;

    public MovieDetailPresenter(Context context) {
        mContext = context;
    }

    @Override
    public void initData(String id) {
        RetrofitBuilder.build(DoubanApi.class)
                .movieDetail(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<MovieDetailBean>(mContext, false, true) {
                    @Override
                    public void onSuccess(MovieDetailBean movieDetailBean) {
                        getView().onLoadSuccess(movieDetailBean);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {

                    }
                });
    }
}
