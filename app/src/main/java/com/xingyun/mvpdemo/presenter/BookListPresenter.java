package com.xingyun.mvpdemo.presenter;

import android.content.Context;

import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.BookListContract;
import com.xingyun.mvpdemo.http.DoubanApi;
import com.xingyun.mvpdemo.model.BookList;
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

public class BookListPresenter extends BasePresenter<BookListContract.View> implements BookListContract.Presenter {
    private Context mContext;
    private int currentPage = 1;
    private int pageSize = 21;

    public BookListPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void refresh(String tag) {
        RetrofitBuilder.build(DoubanApi.class)
                .bookList(tag, 0, 21)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<BookList>(mContext, true, true) {
                    @Override
                    public void onSuccess(BookList bookList) {
                        getView().onLoadSuccess(bookList);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {
                        getView().onLoadFail();
                    }
                });
    }

    @Override
    public void loadMore(String tag) {
        RetrofitBuilder.build(DoubanApi.class)
                .bookList(tag, (currentPage + 1) * pageSize - pageSize, pageSize)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<BookList>(mContext, false, true) {
                    @Override
                    public void onSuccess(BookList bookList) {
                        currentPage++;
                        getView().onLoadMoreSuccess(bookList);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {
                        getView().onLoadMoreFail();
                    }
                });
    }
}
