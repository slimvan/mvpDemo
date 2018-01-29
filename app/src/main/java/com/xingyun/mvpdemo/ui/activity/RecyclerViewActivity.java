package com.xingyun.mvpdemo.ui.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseActivity;
import com.xingyun.mvpdemo.contract.RecyclerViewContract;
import com.xingyun.mvpdemo.presenter.RecyclerViewPresenter;
import com.xingyun.mvpdemo.ui.adapter.RecyclerViewAdapter;
import com.xingyun.mvpdemo.views.ItemTouchHelperCallback;
import com.xingyun.slimvan.util.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewActivity extends BaseActivity implements RecyclerViewContract.View {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    SwipeRefreshLayout refreshLayout;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.fab_add)
    FloatingActionButton fabAdd;

    private RecyclerViewAdapter mAdapter;
    private RecyclerViewPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        presenter = new RecyclerViewPresenter(getContext());
        presenter.attachView(this);
        initToolBar(toolbar);
        initRefreshLayout();
        initRecyclerView();
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
        for (int i = 0; i < 1; i++) {
            datas.add("");
        }
        mAdapter = new RecyclerViewAdapter(datas);
        mAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(mAdapter);

        //侧滑删除 拖拽
        ItemTouchHelper.Callback callback = new ItemTouchHelperCallback(mAdapter);
        ItemTouchHelper mItemTouchHelper = new ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(recyclerView);

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

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition() + 1;
                mAdapter.addData(position, "");
                mAdapter.disableLoadMoreIfNotFullPage(recyclerView);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
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
        mAdapter.disableLoadMoreIfNotFullPage(recyclerView);
    }

    @Override
    public void onLoadMoreSuccess(List<String> data) {
        mAdapter.addData(data);
        mAdapter.loadMoreComplete();
    }
}
