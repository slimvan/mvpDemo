package com.xingyun.mvpdemo.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xingyun.mvpdemo.Constants;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseFragment;
import com.xingyun.mvpdemo.contract.BookListContract;
import com.xingyun.mvpdemo.model.BookList;
import com.xingyun.mvpdemo.presenter.BookListPresenter;
import com.xingyun.mvpdemo.ui.activity.BookDetailActivity;
import com.xingyun.mvpdemo.ui.activity.MovieDetailActivity;
import com.xingyun.mvpdemo.ui.adapter.BookListAdapter;
import com.xingyun.slimvan.util.DeviceUtils;
import com.xingyun.slimvan.view.lazyviewpager.LazyFragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookFragment extends BaseFragment implements BookListContract.View ,LazyFragmentPagerAdapter.Laziable{

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    SwipeRefreshLayout refreshLayout;
    Unbinder unbinder;

    private String mTag;
    private BookListPresenter mPresenter;
    private BookListAdapter mBookListAdapter;

    public static Fragment getInstance(String mTag) {
        BookFragment instance = new BookFragment();
        Bundle args = new Bundle();
        args.putString("tag", mTag);
        instance.setArguments(args);
        return instance;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        if (getArguments() != null) {
            this.mTag = getArguments().getString("tag");
        }
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_book;
    }

    @Override
    protected void initView(View view) {
        mPresenter = new BookListPresenter(getContext());
        mPresenter.attachView(this);
        initRecyclerView();
        initRefreshLayout();

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPresenter.refresh(mTag);
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

    private void initRecyclerView() {
        List<BookList.BooksBean> datas = new ArrayList<>();
        mBookListAdapter = new BookListAdapter(datas);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        recyclerView.setAdapter(mBookListAdapter);

        mBookListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                List<BookList.BooksBean> data = mBookListAdapter.getData();
                if (data != null) {
                    BookList.BooksBean booksBean = data.get(position);
                    if (booksBean != null) {
                        String bookId = booksBean.getId();
                        Intent intent = new Intent(getContext(), BookDetailActivity.class);
                        intent.putExtra(Constants.EXTRA_ID, bookId);
                        intent.putExtra(Constants.EXTRA_BOOK_BEAN,booksBean);
                        if (DeviceUtils.isMoreThanLOLLIPOP()) {
                            Bundle options = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(),
                                    view.findViewById(R.id.iv_icon),
                                    "bookIcon").toBundle();
                            ActivityCompat.startActivity(getContext(), intent, options);
                        } else {
                            startActivity(intent);
                        }
                    }
                }
            }
        });
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
    public void onLoadSuccess(BookList bookList) {
        if (refreshLayout != null) {
            refreshLayout.setRefreshing(false);
        }
        List<BookList.BooksBean> books = bookList.getBooks();
        mBookListAdapter.setNewData(books);
    }

    @Override
    public void onLoadFail() {

    }

    @Override
    public void onLoadMoreSuccess() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (unbinder != null) {
            unbinder.unbind();
        }
        mPresenter.detachView();
    }
}
