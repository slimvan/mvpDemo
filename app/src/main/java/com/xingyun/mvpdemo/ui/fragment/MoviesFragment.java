package com.xingyun.mvpdemo.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xingyun.mvpdemo.Constants;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseFragment;
import com.xingyun.mvpdemo.contract.MoviesContract;
import com.xingyun.mvpdemo.model.HotMovieList;
import com.xingyun.mvpdemo.presenter.MoviesPresenter;
import com.xingyun.mvpdemo.ui.activity.MovieDetailActivity;
import com.xingyun.mvpdemo.ui.adapter.MoviesListAdapter;
import com.xingyun.mvpdemo.views.DividerItemDecoration;
import com.xingyun.slimvan.util.DeviceUtils;
import com.xingyun.slimvan.view.lazyviewpager.LazyFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends BaseFragment implements MoviesContract.View, LazyFragmentPagerAdapter.Laziable {


    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    SwipeRefreshLayout refreshLayout;
    Unbinder unbinder;

    public static Fragment getInstance(String mTag) {
        MoviesFragment instance = new MoviesFragment();
        Bundle args = new Bundle();
        args.putString("tag", mTag);
        instance.setArguments(args);
        return instance;
    }

    MoviesPresenter mPresenter;

    private MoviesListAdapter mMoviesListAdapter;
    private String mTag;

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_movies;
    }

    @Override
    protected void initView(View view) {
        mPresenter = new MoviesPresenter(getContext());
        mPresenter.attachView(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPresenter.refresh(mTag);
        initRefreshLayout();
        initRecyclerView();
    }

    private void initRecyclerView() {
        List<HotMovieList.SubjectsBean> datas = new ArrayList<>();
        mMoviesListAdapter = new MoviesListAdapter(datas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayout.VERTICAL));
        recyclerView.setAdapter(mMoviesListAdapter);
        mMoviesListAdapter.openLoadAnimation(BaseQuickAdapter.ALPHAIN);

        mMoviesListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                List<HotMovieList.SubjectsBean> data = mMoviesListAdapter.getData();
                if (data != null) {
                    HotMovieList.SubjectsBean subjectsBean = data.get(position);
                    if (subjectsBean != null) {
                        String id = subjectsBean.getId();
                        Intent intent = new Intent(getContext(), MovieDetailActivity.class);
                        intent.putExtra(Constants.EXTRA_ID, id);
                        intent.putExtra(Constants.EXTRA_MOVIE_BEAN, subjectsBean);
                        if (DeviceUtils.isMoreThanLOLLIPOP()) {
                            Bundle options = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),
                                    view.findViewById(R.id.iv_icon),
                                    "movieIcon").toBundle();
                            ActivityCompat.startActivity(getContext(), intent, options);
                        } else {
                            startActivity(intent);
                        }
                    }
                }
            }
        });

        //加载更多
        String[] titles = getContext().getResources().getStringArray(R.array.movie_sort_list);
        if (titles[2].equals(mTag) || titles[1].equals(mTag)) {
            mMoviesListAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
                @Override
                public void onLoadMoreRequested() {
                    mPresenter.loadMore(mTag);
                }
            }, recyclerView);
        }
    }

    private void initRefreshLayout() {
        refreshLayout.setColorSchemeColors(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mPresenter.refresh(mTag);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        if (getArguments() != null) {
            this.mTag = getArguments().getString("tag");
        }
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (unbinder != null) {
            unbinder.unbind();
        }
        mPresenter.detachView();
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
    public void onLoadSuccess(HotMovieList hotMovieList) {
        refreshLayout.setRefreshing(false);
        if (hotMovieList != null) {
            List<HotMovieList.SubjectsBean> subjects = hotMovieList.getSubjects();
            mMoviesListAdapter.setNewData(subjects);
            mMoviesListAdapter.disableLoadMoreIfNotFullPage();
        }
    }

    @Override
    public void onLoadMoreSuccess(HotMovieList hotMovieList) {
        if (hotMovieList != null) {
            List<HotMovieList.SubjectsBean> subjects = hotMovieList.getSubjects();
            if (subjects != null) {
                mMoviesListAdapter.addData(subjects);
                mMoviesListAdapter.loadMoreComplete();
            }
        }
    }

    @Override
    public void onLoadMoreFail() {
        mMoviesListAdapter.loadMoreFail();
    }

    @Override
    public void onLoadFail() {
        refreshLayout.setRefreshing(false);
    }
}
