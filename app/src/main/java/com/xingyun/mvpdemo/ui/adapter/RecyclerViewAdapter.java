package com.xingyun.mvpdemo.ui.adapter;

import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.interf.OnMoveAndSwipedListener;
import com.xingyun.slimvan.util.SnackbarUtils;

import java.util.Collections;
import java.util.List;

/**
 * Created by xingyun on 2018/1/6.
 */

public class RecyclerViewAdapter extends BaseQuickAdapter<String, BaseViewHolder> implements OnMoveAndSwipedListener {

    public RecyclerViewAdapter(@Nullable List<String> data) {
        super(R.layout.item_first_listview, data);
    }

    @Override
    protected void convert(BaseViewHolder holder, String item) {

    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        Collections.swap(getData(), fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
        return true;
    }

    @Override
    public void onItemDismiss(final int position) {
        getData().remove(position);
        notifyItemRemoved(position);

        SnackbarUtils.showShort(getRecyclerView(), "移除Item",
                ContextCompat.getColor(mContext, R.color.colorPrimary),
                ContextCompat.getColor(mContext, R.color.black),
                "撤回", ContextCompat.getColor(mContext, R.color.colorAccent),
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        addData(position, getData().get(position));
                    }
                });
    }

}
