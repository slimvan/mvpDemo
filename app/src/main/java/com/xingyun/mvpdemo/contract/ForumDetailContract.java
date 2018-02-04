package com.xingyun.mvpdemo.contract;

import com.xingyun.mvpdemo.base.BaseView;
import com.xingyun.mvpdemo.model.AttendForumBean;
import com.xingyun.mvpdemo.model.BBSListBean;
import com.xingyun.mvpdemo.model.ForumContentBean;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/2/2.
 * desc:
 */

public class ForumDetailContract {
    public interface View extends BaseView {
        void onLoadSuccess(BBSListBean bbsListBean);

        void onLoadFail();

        void onLoadContent(ForumContentBean forumContentBean);

        void onLoadAttendInfo(AttendForumBean attendForumBean);

        void onLoadMoreSuccess(BBSListBean bbsListBean);

        void onLoadMoreFail();
    }

    public interface Presenter {
        void loadData(String fid, String lastTid, String lastTamp,
                      String type);

        void loadMore(String fid, String lastTid, String lastTamp, String type);
    }
}
