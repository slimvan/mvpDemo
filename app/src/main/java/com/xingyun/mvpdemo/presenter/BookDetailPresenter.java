package com.xingyun.mvpdemo.presenter;

import android.content.Context;

import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.BookDetailContract;
import com.xingyun.mvpdemo.http.DoubanApi;
import com.xingyun.mvpdemo.model.BookDetailBean;
import com.xingyun.mvpdemo.model.MovieDetailBean;
import com.xingyun.slimvan.http.MSubscriber;
import com.xingyun.slimvan.http.RetrofitBuilder;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/29.
 * desc:
 */

public class BookDetailPresenter extends BasePresenter<BookDetailContract.View> implements BookDetailContract.Presenter {
    private Context mContext;

    public BookDetailPresenter(Context context) {
        mContext = context;
    }

    @Override
    public void initData(String id) {
        RetrofitBuilder.build(DoubanApi.class)
                .bookDetail(id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<BookDetailBean>(mContext, false, true) {
                    @Override
                    public void onSuccess(BookDetailBean bookDetailBean) {
                        getView().onLoadSuccess(bookDetailBean);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {

                    }
                });
    }
}
