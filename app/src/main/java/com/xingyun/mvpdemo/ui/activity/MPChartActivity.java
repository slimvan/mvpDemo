package com.xingyun.mvpdemo.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.Toolbar;

import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseActivity;
import com.xingyun.mvpdemo.contract.MPChartContract;
import com.xingyun.mvpdemo.presenter.MPChartPresenter;
import com.xingyun.mvpdemo.ui.fragment.BarChartFragment;
import com.xingyun.mvpdemo.ui.fragment.LineChartFragment;
import com.xingyun.mvpdemo.ui.fragment.PieChartFragment;
import com.xingyun.mvpdemo.views.widget.VerticalViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MPChartActivity extends BaseActivity implements MPChartContract.View {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.view_pager)
    VerticalViewPager viewPager;

    private MPChartPresenter presenter;
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpchart);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        presenter = new MPChartPresenter(getContext());
        presenter.attachView(this);
        initToolBar(toolbar);
        initViewPager();
    }

    private void initViewPager() {
        mPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new PieChartFragment();
                    case 1:
                        return new BarChartFragment();
                    case 2:
                        return new LineChartFragment();
                }
                return null;
            }

            @Override
            public int getCount() {
                return 3;
            }

        };
        viewPager.setAdapter(mPagerAdapter);
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
}
