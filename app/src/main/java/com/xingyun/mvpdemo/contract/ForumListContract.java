package com.xingyun.mvpdemo.contract;

import com.xingyun.mvpdemo.base.BaseView;
import com.xingyun.mvpdemo.model.ForumListBean;

import java.io.UnsupportedEncodingException;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/30.
 * desc:
 */

public class ForumListContract {
    public interface View extends BaseView{
        void onLoadSuccess(ForumListBean forumListBean);
        void onLoadFail();
    }

    public interface Presenter{
        void initData() throws UnsupportedEncodingException;
    }
}
