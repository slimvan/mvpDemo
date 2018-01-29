package com.xingyun.mvpdemo.ui.adapter;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.model.BookList;

import java.util.List;

/**
 * author xingyun
 * email: slimvan@163.com
 * date 2018/1/24.
 * desc:
 */

public class BookListAdapter extends BaseQuickAdapter<BookList.BooksBean, BaseViewHolder> {
    public BookListAdapter(@Nullable List<BookList.BooksBean> data) {
        super(R.layout.item_book_gridview, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, BookList.BooksBean item) {
        if (item != null) {
            BookList.BooksBean.ImagesBean images = item.getImages();
            if (images != null) {
                String large = images.getLarge();
                if (!TextUtils.isEmpty(large)) {
                    Glide.with(mContext).load(large).asBitmap().placeholder(R.mipmap.ic_loading).error(R.mipmap.ic_loading).centerCrop().into((ImageView) holder.getView(R.id.iv_icon));
                }
            }

            String title = item.getTitle();
            holder.setText(R.id.tv_title, title);

            BookList.BooksBean.RatingBean rating = item.getRating();
            if (rating != null) {
                String average = rating.getAverage();
                holder.setText(R.id.tv_stars, average);
            }


        }
    }
}
