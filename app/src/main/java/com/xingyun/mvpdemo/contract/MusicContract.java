package com.xingyun.mvpdemo.contract;

import com.xingyun.mvpdemo.base.BaseView;
import com.xingyun.mvpdemo.model.MusicDetailBean;
import com.xingyun.mvpdemo.model.MusicListBean;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/12.
 * desc:
 */

public class MusicContract {

    public interface View extends BaseView {
        void onLoadSuccess(MusicListBean musicListBean);

        void onLoadFail();

        void onLoadMoreSuccess(MusicListBean musicListBean);

        void onLoadMoreFail();

        void onPlaySuccess(MusicDetailBean musicDetailBean, int position);
    }

    public interface Presenter{
        void refresh(String type);
        void loadMore(String type);
        void play(String songid, int position);
    }
}
