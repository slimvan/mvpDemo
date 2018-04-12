package com.xingyun.mvpdemo.presenter;

import android.content.Context;

import com.xingyun.mvpdemo.Constants;
import com.xingyun.mvpdemo.base.BasePresenter;
import com.xingyun.mvpdemo.contract.MusicContract;
import com.xingyun.mvpdemo.http.BaiduMusicApi;
import com.xingyun.mvpdemo.model.MusicDetailBean;
import com.xingyun.mvpdemo.model.MusicListBean;
import com.xingyun.slimvan.http.HttpConfig;
import com.xingyun.slimvan.http.MSubscriber;
import com.xingyun.slimvan.http.RetrofitBuilder;
import com.xingyun.slimvan.util.ToastUtils;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/12.
 * desc:
 */

public class MusicPresenter extends BasePresenter<MusicContract.View> implements MusicContract.Presenter {

    private Context mContext;
    private int offset = 0;

    public MusicPresenter(Context context) {
        mContext = context;
    }

    @Override
    public void refresh(String type) {
        RetrofitBuilder.build(BaiduMusicApi.class, HttpConfig.BAIDU_MUSIC_URL)
                .musicList(Constants.BAIDU_API_METHOD_MUSIC_LIST, type, "0", "20")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<MusicListBean>(mContext, false, false) {
                    @Override
                    public void onSuccess(MusicListBean musicListBean) {
                        getView().onLoadSuccess(musicListBean);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {
                        getView().onLoadFail();
                    }
                });
    }

    @Override
    public void loadMore(String type) {
        try {
            RetrofitBuilder.build(BaiduMusicApi.class, HttpConfig.BAIDU_MUSIC_URL)
                    .musicList(Constants.BAIDU_API_METHOD_MUSIC_LIST, type, String.valueOf(offset + 20), "20")
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new MSubscriber<MusicListBean>(mContext, false, false) {
                        @Override
                        public void onSuccess(MusicListBean musicListBean) {
                            if (musicListBean.getSong_list() != null) {
                                offset += 20;
                            }
                            getView().onLoadMoreSuccess(musicListBean);
                        }

                        @Override
                        public void errorCallBack(Throwable e) {
                            getView().onLoadMoreFail();
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void play(String songid, final int position) {
        RetrofitBuilder.build(BaiduMusicApi.class, HttpConfig.BAIDU_MUSIC_URL)
                .musicDetail(Constants.BAIDU_API_METHOD_MUSIC_DETAIL, songid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MSubscriber<MusicDetailBean>(mContext, true, true) {
                    @Override
                    public void onSuccess(MusicDetailBean musicDetailBean) {
                        getView().onPlaySuccess(musicDetailBean, position);
                    }

                    @Override
                    public void errorCallBack(Throwable e) {
                        ToastUtils.showShort("出错了(╯﹏╰)");
                    }
                });
    }
}
