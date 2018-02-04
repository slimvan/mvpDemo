package com.xingyun.mvpdemo.model;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.io.Serializable;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/30.
 * desc:
 */

public class ForumSectionBean implements MultiItemEntity,Serializable {

    public static final int TYPE_DATA = 0;
    public static final int TYPE_HEADER = 1;

    private int itemType;

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    private String headerName;

    private ForumListBean.DataBeanX.SubBean.DataBean dataBean;

    public ForumListBean.DataBeanX.SubBean.DataBean getDataBean() {
        return dataBean;
    }

    public void setDataBean(ForumListBean.DataBeanX.SubBean.DataBean dataBean) {
        this.dataBean = dataBean;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }


    @Override
    public int getItemType() {
        return itemType;
    }
}
