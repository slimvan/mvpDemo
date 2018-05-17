package com.xingyun.mvpdemo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.gyf.barlibrary.ImmersionBar;
import com.xingyun.mvpdemo.Constants;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseActivity;
import com.xingyun.mvpdemo.contract.ForumDetailContract;
import com.xingyun.mvpdemo.model.AttendForumBean;
import com.xingyun.mvpdemo.model.BBSListBean;
import com.xingyun.mvpdemo.model.ForumContentBean;
import com.xingyun.mvpdemo.model.ForumListBean;
import com.xingyun.mvpdemo.model.ForumSectionBean;
import com.xingyun.mvpdemo.presenter.ForumDetailPresenter;
import com.xingyun.mvpdemo.ui.adapter.ForumDetailAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ForumDetailActivity extends BaseActivity implements ForumDetailContract.View {

    @BindView(R.id.iv_bg)
    ImageView ivBg;
    @BindView(R.id.tv_content)
    TextView tvContent;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.app_bar_scrolling)
    AppBarLayout appBarScrolling;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    SwipeRefreshLayout refreshLayout;

    private ForumDetailPresenter mPresenter;
    private ForumDetailAdapter mAdapter;
    private ForumSectionBean mForumBean;

    private String lastTid = "";
    private String lastTamp = "";
    private String fid;
    private String type = Constants.HUPU_BBS_SORT_TYPE_HOT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum_detail_list);
        ButterKnife.bind(this);

        ImmersionBar.with(this).titleBar(toolbar).init();
        setStatusBarSwitch(false); //屏蔽基类的状态栏处理

        mForumBean = (ForumSectionBean) getIntent().getSerializableExtra(Constants.EXTRA_FORUM_BEAN);

        initViews();
        getData();
    }

    private void getData() {
        if (mForumBean != null) {
            ForumListBean.DataBeanX.SubBean.DataBean dataBean = mForumBean.getDataBean();
            if (dataBean != null) {
                fid = dataBean.getFid();
                mPresenter.loadData(fid, lastTid, lastTamp, type); //列表数据
                mPresenter.getAttendStatus(fid, ""); //关注信息  为了拿背景图...
            }
        }
    }

    private void initViews() {
        mPresenter = new ForumDetailPresenter(getContext());
        mPresenter.attachView(this);

        initToolBar(toolbar);
        setSupportActionBar(toolbar);
        initBasicData();
        initRefreshLayout();
        initRecyclerView();
    }

    private void initBasicData() {
        if (mForumBean != null) {
            ForumListBean.DataBeanX.SubBean.DataBean dataBean = mForumBean.getDataBean();
            if (dataBean != null) {
                toolbar.setTitle(dataBean.getName());
                tvContent.setText(dataBean.getDescription());
                if (!TextUtils.isEmpty(dataBean.getBackimg())) {
                    Glide.with(getContext()).load(dataBean.getBack_img_url()).asBitmap().into(ivBg);
                }
            }
        }
    }

    private void initRefreshLayout() {
        refreshLayout.setColorSchemeColors(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getData();
            }
        });
    }

    private void initRecyclerView() {
        List<BBSListBean.ResultBean.DataBean> data = new ArrayList<>();
        mAdapter = new ForumDetailAdapter(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(mAdapter);
        mAdapter.openLoadAnimation(BaseQuickAdapter.SCALEIN);

        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                List<BBSListBean.ResultBean.DataBean> data = mAdapter.getData();
                if (data != null) {
                    BBSListBean.ResultBean.DataBean dataBean = data.get(position);
                    if (dataBean != null) {
                        String fid = dataBean.getFid();
                        String tid = dataBean.getTid();
                        String pid = "";
                        String page = "1";
                        mPresenter.skip2Content(fid, tid, pid, page);
                    }
                }
            }
        });

        mAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                mPresenter.loadMore(fid, lastTid, lastTamp, type);
            }
        }, recyclerView);
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
    public void onLoadSuccess(BBSListBean bbsListBean) {
        if (refreshLayout != null && refreshLayout.isRefreshing()) {
            refreshLayout.setRefreshing(false);
        }

        if (bbsListBean != null) {
            BBSListBean.ResultBean result = bbsListBean.getResult();
            if (result != null) {
                lastTamp = result.getStamp();
                List<BBSListBean.ResultBean.DataBean> data = result.getData();
                if (data != null) {
                    BBSListBean.ResultBean.DataBean lastBean = data.get(data.size() - 1);
                    if (lastBean != null) {
                        lastTid = lastBean.getTid();
                    }
                    mAdapter.setNewData(data);
                    mAdapter.disableLoadMoreIfNotFullPage();
                }
            }
        }
    }

    @Override
    public void onLoadContent(ForumContentBean forumContentBean) {
        if (forumContentBean != null) {
            ForumContentBean.ShareBean share = forumContentBean.getShare();
            if (share != null) {
                String url = share.getUrl();
                Intent intent = new Intent(getContext(), WebViewActivity.class);
                intent.putExtra(Constants.EXTRA_URL, url);
                startActivity(intent);
            }
        }
    }

    @Override
    public void onLoadAttendInfo(AttendForumBean attendForumBean) {
        if (attendForumBean != null) {
            AttendForumBean.ForumInfoBean forumInfo = attendForumBean.getForumInfo();
            if (forumInfo != null) {
                String backImg = forumInfo.getBackImg();
                if (!TextUtils.isEmpty(backImg)) {
                    Glide.with(getContext()).load(backImg).asBitmap().placeholder(R.mipmap.stackblur_default).into(ivBg);
                }
            }
        }
    }

    @Override
    public void onLoadMoreSuccess(BBSListBean bbsListBean) {
        if (bbsListBean != null) {
            BBSListBean.ResultBean result = bbsListBean.getResult();
            if (result != null) {
                List<BBSListBean.ResultBean.DataBean> data = result.getData();
                if (data != null) {
                    BBSListBean.ResultBean.DataBean lastBean = data.get(data.size() - 1);
                    if (lastBean != null) {
                        lastTid = lastBean.getTid();
                    }
                    mAdapter.addData(data);
                    mAdapter.loadMoreComplete();
                }
            }
        }
    }

    @Override
    public void onLoadMoreFail() {
        mAdapter.loadMoreFail();
    }

    @Override
    public void onLoadFail() {
        if (refreshLayout != null && refreshLayout.isRefreshing()) {
            refreshLayout.setRefreshing(false);
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}
