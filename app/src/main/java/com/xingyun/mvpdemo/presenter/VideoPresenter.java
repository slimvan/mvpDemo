package com.xingyun.mvpdemo.presenter;

import android.content.Context;

import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.VideoContract;
import com.xingyun.mvpdemo.http.YamahaApi;
import com.xingyun.mvpdemo.model.VideoListBean;
import com.xingyun.slimvan.http.HttpConfig;
import com.xingyun.slimvan.http.MSubscriber;
import com.xingyun.slimvan.http.RetrofitBuilder;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/11.
 * desc:
 */

public class VideoPresenter extends BasePresenter<VideoContract.View> implements VideoContract.Presenter {
    private Context mContext;

    public VideoPresenter(Context context) {
        mContext = context;
    }

    @Override
    public void refresh(String sort_id) {
        RetrofitBuilder.build(YamahaApi.class, HttpConfig.YAMAHA_URL)
                .videoList(sort_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<VideoListBean>(mContext, true, true){
                    @Override
                    public void onSuccess(VideoListBean videoListBean) {
                        List<VideoListBean.ArticleListBean> article_list = videoListBean.getArticle_list();
                        if (article_list != null) {
                            getView().onLoadSuccess(article_list);
                        }
                    }

                    @Override
                    public void errorCallBack(Throwable e) {

                    }
                });
    }

    @Override
    public void loadMore() {

    }
}
