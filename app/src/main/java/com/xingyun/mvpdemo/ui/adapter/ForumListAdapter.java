package com.xingyun.mvpdemo.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.oushangfeng.pinnedsectionitemdecoration.utils.FullSpanUtil;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.model.ForumListBean;
import com.xingyun.mvpdemo.model.ForumSectionBean;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/30.
 * desc:
 */

public class ForumListAdapter extends BaseMultiItemQuickAdapter<ForumSectionBean, BaseViewHolder> {

    /**
     * Same as QuickAdapter#QuickAdapter(Context,int) but with
     * some initialization data.
     *
     * @param data A new list is created out of this one to avoid mutable list
     */
    public ForumListAdapter(List<ForumSectionBean> data) {
        super(data);
        addItemType(ForumSectionBean.TYPE_DATA, R.layout.item_forum_listview);
        addItemType(ForumSectionBean.TYPE_HEADER, R.layout.forum_header_listview);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        FullSpanUtil.onAttachedToRecyclerView(recyclerView, this, ForumSectionBean.TYPE_HEADER);
    }

    @Override
    public void onViewAttachedToWindow(BaseViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        FullSpanUtil.onViewAttachedToWindow(holder, this, ForumSectionBean.TYPE_HEADER);
    }

    @Override
    protected void convert(BaseViewHolder holder, ForumSectionBean item) {
        try {
            switch (holder.getItemViewType()) {
                case ForumSectionBean.TYPE_HEADER:
                    if (item != null) {
                        ForumListBean.DataBeanX.SubBean.DataBean data = item.getDataBean();
                        holder.setText(R.id.tv_header_title, item.getHeaderName());
                    }
                    break;
                case ForumSectionBean.TYPE_DATA:
                    if (item != null) {
                        ForumListBean.DataBeanX.SubBean.DataBean data = item.getDataBean();
                        if (data != null) {
                            holder.setText(R.id.tv_title, data.getName());
                            Glide.with(mContext).load(data.getLogo()).centerCrop().into((ImageView) holder.getView(R.id.iv_icon));
                        }
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
