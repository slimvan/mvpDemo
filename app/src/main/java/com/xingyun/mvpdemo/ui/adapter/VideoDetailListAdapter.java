package com.xingyun.mvpdemo.ui.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.model.VideoListBean;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/11.
 * desc:
 */

public class VideoDetailListAdapter extends BaseQuickAdapter<VideoListBean.ArticleListBean, BaseViewHolder> {
    public VideoDetailListAdapter(@Nullable List<VideoListBean.ArticleListBean> data) {
        super(R.layout.item_video_detail_listview, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, VideoListBean.ArticleListBean item) {
        Glide.with(mContext).load(item.getImg()).into((ImageView) holder.getView(R.id.iv_icon));
        holder.setText(R.id.tv_title, item.getTitle());
    }
}
