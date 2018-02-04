package com.xingyun.mvpdemo.ui.adapter;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.model.BBSListBean;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/2/2.
 * desc:
 */

public class ForumDetailAdapter extends BaseQuickAdapter<BBSListBean.ResultBean.DataBean, BaseViewHolder> {
    public ForumDetailAdapter(@Nullable List<BBSListBean.ResultBean.DataBean> data) {
        super(R.layout.item_forun_detail_listview, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, BBSListBean.ResultBean.DataBean item) {
        if (item != null) {
            holder.setText(R.id.tv_title, item.getTitle());
            holder.setText(R.id.tv_time, item.getTime());
            holder.setText(R.id.tv_report, item.getReplies() + " 回复");
            List<String> imgs = item.getImgs();
            if (imgs != null && imgs.size() > 0) {
                String image = imgs.get(0);
                if (!TextUtils.isEmpty(image)) {
                    holder.setVisible(R.id.iv_icon, true);
                    Glide.with(mContext).load(image).centerCrop().into((ImageView) holder.getView(R.id.iv_icon));
                } else {
                    holder.setVisible(R.id.iv_icon, false);
                }
            } else {
                holder.setVisible(R.id.iv_icon, false);
            }
        }
    }
}
