package com.xingyun.mvpdemo.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.ViewGroup;

import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseActivity;
import com.xingyun.mvpdemo.ui.fragment.BookFragment;
import com.xingyun.mvpdemo.ui.fragment.MoviesFragment;
import com.xingyun.slimvan.view.lazyviewpager.LazyFragmentPagerAdapter;
import com.xingyun.slimvan.view.lazyviewpager.LazyViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 图书
 */
public class BookActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.view_pager)
    LazyViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        ButterKnife.bind(this);

        initViews();
    }

    private void initViews() {
        initToolBar(toolbar);
        setSupportActionBar(toolbar);
        initViewPager();
    }

    private void initViewPager() {
        final String[] titles = getResources().getStringArray(R.array.book_sort_list);
        LazyFragmentPagerAdapter adapter = new LazyFragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            protected Fragment getItem(ViewGroup container, int position) {
                return BookFragment.getInstance(titles[position]);
            }

            @Override
            public int getCount() {
                return titles.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return titles[position];
            }
        };
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(titles.length);

        for (int i = 0; i < titles.length; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(titles[i]));
        }
        tabLayout.setupWithViewPager(viewPager);
    }
}
