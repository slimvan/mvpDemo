package com.xingyun.mvpdemo.ui.adapter;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.model.HotMovieList;
import com.xingyun.mvpdemo.util.StringFormatUtil;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/23.
 * desc:
 */

public class MoviesListAdapter extends BaseQuickAdapter<HotMovieList.SubjectsBean, BaseViewHolder> {
    public MoviesListAdapter(@Nullable List<HotMovieList.SubjectsBean> data) {
        super(R.layout.item_movies_listview, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, HotMovieList.SubjectsBean item) {
        if (item != null) {
            HotMovieList.SubjectsBean.ImagesBean images = item.getImages();
            if (images != null) {
                if (!TextUtils.isEmpty(images.getLarge())) {
                    Glide.with(mContext).load(item.getImages().getLarge())
                            .diskCacheStrategy(DiskCacheStrategy.ALL)
//                            .placeholder(R.mipmap.ic_loading)
//                            .error(R.mipmap.ic_loading)
                            .dontAnimate()
                            .centerCrop()
                            .into((ImageView) holder.getView(R.id.iv_icon));
                }
            }

            holder.setText(R.id.tv_title, item.getTitle());

            String directors = StringFormatUtil.formatDirectors(item.getDirectors());
            holder.setText(R.id.tv_director, directors);

            String casts = StringFormatUtil.formatStarrings(item.getCasts());
            holder.setText(R.id.tv_starring, casts);

            String strings = StringFormatUtil.formatStringList(item.getGenres());
            holder.setText(R.id.tv_type, strings);

            HotMovieList.SubjectsBean.RatingBean rating = item.getRating();
            if (rating != null) {
                double max = rating.getAverage();
                holder.setText(R.id.tv_stars, String.valueOf(max));
            }
        }
    }
}
