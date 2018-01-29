package com.xingyun.mvpdemo.contract;

import com.xingyun.mvpdemo.base.BaseView;
import com.xingyun.mvpdemo.model.MovieDetailBean;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/24.
 * desc:
 */

public class MovieDetailContract {
    public interface View extends BaseView {
        void onLoadSuccess(MovieDetailBean movieDetailBean);
    }

    public interface Presenter {
        void initData(String id);
    }
}
