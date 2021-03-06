package com.xingyun.mvpdemo.contract;

import com.xingyun.mvpdemo.base.BaseView;
import com.xingyun.mvpdemo.model.HotMovieList;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/23.
 * desc: 电影契约类
 */

public class MoviesContract {

    public interface View extends BaseView {
        void onLoadSuccess(HotMovieList bookList);

        void onLoadFail();

        void onLoadMoreSuccess(HotMovieList hotMovieList);

        void onLoadMoreFail();

    }

    public interface Presenter {
        void refresh(String tag,boolean loadingFlag);

        void loadMore(String tag);
    }
}
