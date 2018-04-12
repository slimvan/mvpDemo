package com.xingyun.mvpdemo.ui.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.model.MusicListBean;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/4/12.
 * desc:
 */

public class MusicListAdapter extends BaseQuickAdapter<MusicListBean.SongListBean, BaseViewHolder> {
    public MusicListAdapter(@Nullable List<MusicListBean.SongListBean> data) {
        super(R.layout.item_music_listview, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, MusicListBean.SongListBean item) {
        if (item != null) {

            if (item.isPlaying()) {
                ((ImageView) holder.getView(R.id.iv_play)).setImageResource(R.mipmap.ic_music_stop);
            } else {
                ((ImageView) holder.getView(R.id.iv_play)).setImageResource(R.mipmap.ic_music_play);
            }

            holder.setText(R.id.tv_title, item.getTitle());
            holder.setText(R.id.tv_artist, item.getAuthor());
            Glide.with(mContext).load(item.getPic_big()).error(R.mipmap.ic_music_default).into((ImageView) holder.getView(R.id.iv_icon));
        }
    }
}
