package com.xingyun.mvpdemo.contract;

import com.xingyun.mvpdemo.base.BaseView;

import java.util.List;

/**
 * Created by xingyun on 2018/1/4.
 */

public class FirstContract  {

    public interface View extends BaseView{
        void onLoadSuccess(List<String> data);
        void onLoadMoreSuccess(List<String> data);
    }

    public interface Presenter{
        void refresh();
        void loadMore();
    }
}
