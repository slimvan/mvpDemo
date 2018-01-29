package com.xingyun.mvpdemo.contract;

import com.xingyun.mvpdemo.base.BaseView;
import com.xingyun.mvpdemo.model.BookDetailBean;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/29.
 * desc: 书籍详情契约类
 */

public class BookDetailContract {
    public interface View extends BaseView{
        void onLoadSuccess(BookDetailBean bookDetailBean);
        void onLoadFail();
    }

    public interface Presenter{
        void initData(String id);
    }
}
