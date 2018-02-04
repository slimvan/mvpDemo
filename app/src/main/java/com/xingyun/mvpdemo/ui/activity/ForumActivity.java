package com.xingyun.mvpdemo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.oushangfeng.pinnedsectionitemdecoration.PinnedHeaderItemDecoration;
import com.oushangfeng.pinnedsectionitemdecoration.callback.OnHeaderClickListener;
import com.xingyun.mvpdemo.Constants;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseActivity;
import com.xingyun.mvpdemo.contract.ForumListContract;
import com.xingyun.mvpdemo.model.ForumListBean;
import com.xingyun.mvpdemo.model.ForumSectionBean;
import com.xingyun.mvpdemo.presenter.ForumListPresenter;
import com.xingyun.mvpdemo.ui.adapter.ForumListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 论坛
 */
public class ForumActivity extends BaseActivity implements ForumListContract.View {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.fab_add)
    FloatingActionButton fabAdd;

    private ForumListPresenter mPresenter;
    private ForumListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        ButterKnife.bind(this);

        initViews();
        try {
            mPresenter.initData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initViews() {
        mPresenter = new ForumListPresenter(getContext());
        mPresenter.attachView(this);

        initToolBar(toolbar);
        setSupportActionBar(toolbar);
        initRecyclerView();
    }

    private void initRecyclerView() {
        List<ForumSectionBean> data = new ArrayList<>();
        mAdapter = new ForumListAdapter(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new PinnedHeaderItemDecoration.Builder(ForumSectionBean.TYPE_HEADER).create());
        recyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                List<ForumSectionBean> datas = mAdapter.getData();
                if (datas != null) {
                    ForumSectionBean forumSectionBean = datas.get(position);
                    if (forumSectionBean != null) {
                        Intent intent = new Intent(getContext(), ForumDetailActivity.class);
                        intent.putExtra(Constants.EXTRA_FORUM_BEAN,forumSectionBean);
                        startActivity(intent);
                    }
                }
            }
        });
    }


    @OnClick(R.id.fab_add)
    public void onViewClicked() {

    }

    @Override
    public void showLoading() {
        showLoadingDialog();
    }

    @Override
    public void showEmpty() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void onLoadSuccess(ForumListBean forumListBean) {
        if (forumListBean != null) {
            List<ForumSectionBean> sections = new ArrayList<>();
            List<ForumListBean.DataBeanX> data = forumListBean.getData();
            if (data != null && data.size() > 0) {
                ForumListBean.DataBeanX dataBeanX = data.get(0);
                if (dataBeanX != null) {
                    List<ForumListBean.DataBeanX.SubBean> subBeans = dataBeanX.getSub();
                    if (subBeans != null) {
                        for (int i = 0; i < subBeans.size(); i++) {
                            ForumListBean.DataBeanX.SubBean subBean = subBeans.get(i);
                            if (subBean != null) {
                                String subBeanName = subBean.getName();
                                ForumSectionBean forumSectionBean = new ForumSectionBean();
                                forumSectionBean.setHeaderName(subBeanName);
                                forumSectionBean.setItemType(ForumSectionBean.TYPE_HEADER);
                                sections.add(forumSectionBean); //标题头
                                List<ForumListBean.DataBeanX.SubBean.DataBean> subBeanData = subBean.getData();
                                if (subBeanData != null) {
                                    for (int k = 0; k < subBeanData.size(); k++) {
                                        ForumListBean.DataBeanX.SubBean.DataBean dataBean = subBeanData.get(k);
                                        if (dataBean != null) {
                                            ForumSectionBean childSectionBean = new ForumSectionBean();
                                            childSectionBean.setDataBean(dataBean);
                                            childSectionBean.setItemType(ForumSectionBean.TYPE_DATA);
                                            sections.add(childSectionBean);//子布局
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            mAdapter.setNewData(sections);
        }
    }

    @Override
    public void onLoadFail() {

    }
}
