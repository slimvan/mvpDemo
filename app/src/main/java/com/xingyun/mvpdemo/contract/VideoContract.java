package com.xingyun.mvpdemo.contract;

import com.xingyun.mvpdemo.base.BaseView;
import com.xingyun.mvpdemo.model.VideoListBean;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/11.
 * desc:
 */

public class VideoContract {

    public interface View extends BaseView {
        void onLoadSuccess(List<VideoListBean.ArticleListBean> data);
        void onLoadMoreSuccess(List<VideoListBean.ArticleListBean> data);
    }

    public interface Presenter{
        void refresh(String sort_id,boolean loadingFlag);
        void loadMore();
    }

}
