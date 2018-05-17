package com.xingyun.mvpdemo.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseFragment;
import com.xingyun.mvpdemo.contract.VideoContract;
import com.xingyun.mvpdemo.model.VideoListBean;
import com.xingyun.mvpdemo.presenter.VideoPresenter;
import com.xingyun.mvpdemo.ui.activity.IJKPlayerActivity;
import com.xingyun.mvpdemo.ui.adapter.VideoListAdapter;
import com.xingyun.slimvan.view.lazyviewpager.LazyFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideoFragment extends BaseFragment implements VideoContract.View, LazyFragmentPagerAdapter.Laziable {


    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    SwipeRefreshLayout refreshLayout;
    Unbinder unbinder;

    private VideoPresenter mPresenter;
    private VideoListAdapter mAdapter;

    private String sort_id;

    public static VideoFragment getInstance(String sort_id) {
        VideoFragment instance = new VideoFragment();
        Bundle args = new Bundle();
        args.putString("sort_id", sort_id);
        instance.setArguments(args);
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, view);
        if (getArguments() != null) {
            this.sort_id = getArguments().getString("sort_id");
        }
        return view;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_video;
    }

    @Override
    protected void initView(View view) {
        initRefreshLayout();
        initRecyclerView();
        mPresenter = new VideoPresenter(getContext());
        mPresenter.attachView(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPresenter.refresh(sort_id, true);
    }


    /**
     * 初始化列表
     */
    private void initRecyclerView() {
        List<VideoListBean.ArticleListBean> datas = new ArrayList<>();
        mAdapter = new VideoListAdapter(datas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                try {
                    String video_url = mAdapter.getData().get(position).getVideo_url();
                    Intent intent = new Intent(getContext(), IJKPlayerActivity.class);
                    intent.putExtra("url", video_url);
                    intent.putExtra("sort_id", sort_id);
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * 初始化刷新控件
     */
    private void initRefreshLayout() {
        refreshLayout.setColorSchemeColors(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mPresenter.refresh(sort_id, false);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void onLoadSuccess(List<VideoListBean.ArticleListBean> data) {
        mAdapter.setNewData(data);
        refreshLayout.setRefreshing(false);
    }

    @Override
    public void onLoadMoreSuccess(List<VideoListBean.ArticleListBean> data) {

    }
}
