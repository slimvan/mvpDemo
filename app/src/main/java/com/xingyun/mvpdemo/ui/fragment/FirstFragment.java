package com.xingyun.mvpdemo.ui.fragment;


import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.animation.BaseAnimation;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseFragment;
import com.xingyun.mvpdemo.contract.FirstContract;
import com.xingyun.mvpdemo.presenter.FirstPresenter;
import com.xingyun.mvpdemo.ui.adapter.FirstListAdapter;
import com.xingyun.slimvan.util.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 *
 */
public class FirstFragment extends BaseFragment implements FirstContract.View {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    SwipeRefreshLayout refreshLayout;
    Unbinder unbinder;

    private FirstListAdapter mAdapter;
    private FirstPresenter presenter;

    public static FirstFragment getInstance() {
        return new FirstFragment();
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_first;
    }

    @Override
    protected void initView(View view) {
        initRefreshLayout();
        initRecyclerView();
        presenter = new FirstPresenter(getContext());
        presenter.attachView(this);
    }

    private void initRefreshLayout() {
        refreshLayout.setColorSchemeColors(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                presenter.refresh();
            }
        });
    }

    private void initRecyclerView() {
        List<String> datas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            datas.add("");
        }
        mAdapter = new FirstListAdapter(datas);
        mAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                ToastUtils.showShort("" + position);
            }
        });
        mAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                presenter.loadMore();
            }
        }, recyclerView);
        mAdapter.disableLoadMoreIfNotFullPage(recyclerView);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
        presenter.detachView();
    }

    @Override
    public void showLoading() {
        showLoadingDialog();
    }

    @Override
    public void showEmpty() {
        hideLoadingDialog();
    }

    @Override
    public void showError() {
        hideLoadingDialog();
    }

    @Override
    public void onLoadSuccess(List<String> data) {
        refreshLayout.setRefreshing(false);
        mAdapter.setNewData(data);
    }

    @Override
    public void onLoadMoreSuccess(List<String> data) {
        mAdapter.addData(data);
        mAdapter.loadMoreComplete();
    }
}
