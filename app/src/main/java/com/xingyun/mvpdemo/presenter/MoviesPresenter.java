package com.xingyun.mvpdemo.presenter;

import android.content.Context;

import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.MoviesContract;
import com.xingyun.mvpdemo.http.DoubanApi;
import com.xingyun.mvpdemo.model.HotMovieList;
import com.xingyun.slimvan.http.MSubscriber;
import com.xingyun.slimvan.http.RetrofitBuilder;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/23.
 * desc:
 */

public class MoviesPresenter extends BasePresenter<MoviesContract.View> implements MoviesContract.Presenter {
    private Context mContext;

    public MoviesPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void refresh(String tag) {
        DoubanApi doubanApi = RetrofitBuilder.build(DoubanApi.class);
        String[] titles = mContext.getResources().getStringArray(R.array.movie_sort_list);
        Observable observable = null;
        if (titles[0].equals(tag)) {
            observable = doubanApi.movieListHot(tag);
        } else if (titles[1].equals(tag)) {
            observable = doubanApi.movieListCommingSoon(0, 20);
        } else if (titles[2].equals(tag)) {
            observable = doubanApi.movieListTop250(0, 20);
        }

        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<HotMovieList>(mContext, true, true) {
                    @Override
                    public void onSuccess(HotMovieList hotMovieList) {
                        getView().onLoadSuccess(hotMovieList);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {
                        getView().onLoadFail();
                        e.printStackTrace();
                    }
                });
    }

    @Override
    public void loadMore() {

    }
}
