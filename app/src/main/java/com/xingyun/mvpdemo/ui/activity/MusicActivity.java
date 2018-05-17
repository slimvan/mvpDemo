package com.xingyun.mvpdemo.ui.activity;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.gyf.barlibrary.ImmersionBar;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseActivity;
import com.xingyun.mvpdemo.contract.MusicContract;
import com.xingyun.mvpdemo.model.MusicDetailBean;
import com.xingyun.mvpdemo.model.MusicListBean;
import com.xingyun.mvpdemo.presenter.MusicPresenter;
import com.xingyun.mvpdemo.ui.fragment.MusicFragment;
import com.xingyun.mvpdemo.views.AppBarStateChangeListener;
import com.xingyun.slimvan.view.lazyviewpager.LazyFragmentPagerAdapter;
import com.xingyun.slimvan.view.lazyviewpager.LazyViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;
import jp.wasabeef.glide.transformations.BlurTransformation;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class MusicActivity extends BaseActivity implements MusicContract.View {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.view_pager)
    LazyViewPager viewPager;
    @BindView(R.id.iv_icon)
    ImageView ivIcon;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_description)
    TextView tvDescription;
    @BindView(R.id.tv_last_update)
    TextView tvLastUpdate;
    @BindView(R.id.iv_bg)
    ImageView ivBg;
    @BindView(R.id.app_bar_layout)
    AppBarLayout appBarLayout;

    private IjkMediaPlayer mIjkMediaPlayer;
    private MusicPresenter mPresenter;
    private String[] types;

    public IjkMediaPlayer getIjkMediaPlayer() {
        return mIjkMediaPlayer;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        ButterKnife.bind(this);

        ImmersionBar.with(this).titleBar(toolbar).init();
        setStatusBarSwitch(false); //屏蔽基类的状态栏处理

        mIjkMediaPlayer = new IjkMediaPlayer();
        mPresenter = new MusicPresenter(getContext());
        mPresenter.attachView(this);

        initViews();
        mPresenter.refresh(types[viewPager.getCurrentItem()]);
    }

    private void initViews() {
        initToolBar(toolbar);
        setSupportActionBar(toolbar);
        initViewPager();

        appBarLayout.addOnOffsetChangedListener(new AppBarStateChangeListener() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, State state) {
                Log.d("STATE", state.name());
                if (state == State.EXPANDED) {
                    //展开状态
                    tabLayout.setFitsSystemWindows(false);
                } else if (state == State.COLLAPSED) {
                    //折叠状态
                    tabLayout.setFitsSystemWindows(true);
                } else {
                    //中间状态
                    tabLayout.setFitsSystemWindows(false);
                }
                tabLayout.invalidate();
            }
        });
    }


    private void initViewPager() {
        final String[] titles = getResources().getStringArray(R.array.music_sort_list);
        types = getResources().getStringArray(R.array.music_sort_type_list);

        LazyFragmentPagerAdapter adapter = new LazyFragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            protected Fragment getItem(ViewGroup container, int position) {
                return MusicFragment.getInstance(types[position]);
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

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mPresenter.refresh(types[viewPager.getCurrentItem()]);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        if (mIjkMediaPlayer != null) {
            mIjkMediaPlayer.stop();
            mIjkMediaPlayer.release(); //停止并释放
        }
        super.onDestroy();
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
    public void onLoadSuccess(MusicListBean musicListBean) {
        if (musicListBean != null) {
            MusicListBean.BillboardBean billboard = musicListBean.getBillboard();
            if (billboard != null) {
                tvTitle.setText(billboard.getName());
                tvDescription.setText(billboard.getComment());
                tvLastUpdate.setText(billboard.getUpdate_date());
                Glide.with(getContext()).load(billboard.getPic_s192()).into(ivIcon);
                Glide.with(getContext()).load(billboard.getPic_s192())
                        .crossFade()
                        .bitmapTransform(new BlurTransformation(getContext(), 23, 4))
                        .placeholder(R.mipmap.stackblur_default)
                        .error(R.mipmap.stackblur_default)
                        .into(ivBg);
            }
        }
    }

    @Override
    public void onLoadFail() {

    }

    @Override
    public void onLoadMoreSuccess(MusicListBean musicListBean) {

    }

    @Override
    public void onLoadMoreFail() {

    }

    @Override
    public void onPlaySuccess(MusicDetailBean musicDetailBean, int position) {

    }
}
