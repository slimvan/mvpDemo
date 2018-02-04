package com.xingyun.mvpdemo.contract;

import com.xingyun.mvpdemo.base.BaseView;
import com.xingyun.mvpdemo.model.BookList;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/24.
 * desc:
 */

public class BookListContract {
    public interface View extends BaseView{
        void onLoadSuccess(BookList bookList);
        void onLoadFail();
        void onLoadMoreSuccess(BookList bookList);
        void onLoadMoreFail();
    }

    public interface Presenter{
        void refresh(String tag);
        void loadMore(String tag);
    }
}
