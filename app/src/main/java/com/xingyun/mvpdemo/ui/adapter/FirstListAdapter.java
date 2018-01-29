package com.xingyun.mvpdemo.ui.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.xingyun.mvpdemo.R;

import java.util.List;

/**
 * 列表适配器
 * Created by xingyun on 2018/1/4.
 */

public class FirstListAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public FirstListAdapter(@Nullable List<String> data) {
        super(R.layout.item_first_listview, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

    }
}
