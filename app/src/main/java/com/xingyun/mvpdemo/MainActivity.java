package com.xingyun.mvpdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xingyun.mvpdemo.base.BaseActivity;
import com.xingyun.mvpdemo.contract.WeatherContract;
import com.xingyun.mvpdemo.model.WeatherBean;
import com.xingyun.mvpdemo.presenter.WeatherPresenter;
import com.xingyun.mvpdemo.ui.activity.BookActivity;
import com.xingyun.mvpdemo.ui.activity.ForumActivity;
import com.xingyun.mvpdemo.ui.activity.LoginActivity;
import com.xingyun.mvpdemo.ui.activity.MPChartActivity;
import com.xingyun.mvpdemo.ui.activity.MovieActivity;
import com.xingyun.mvpdemo.ui.activity.MusicActivity;
import com.xingyun.mvpdemo.ui.activity.RewardActivity;
import com.xingyun.mvpdemo.ui.fragment.VideoFragment;
import com.xingyun.slimvan.util.IntentUtils;
import com.xingyun.slimvan.util.SPUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements WeatherContract.View {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tab_layout)
    TabLayout tabLayout;
    @BindView(R.id.view_pager)
    ViewPager viewPager;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    private ImageView ivWeatherIcon;
    private TextView tvWeatherText;
    private TextView tvLocation;

    private WeatherPresenter mWeatherPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        setSupportActionBar(toolbar);
        initToggleIcon();
        initNavigationView();
        initViewPager();

        mWeatherPresenter = new WeatherPresenter(getContext());
        mWeatherPresenter.attachView(this);
        mWeatherPresenter.requestWeatherNow();
    }


    private void initToggleIcon() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }


    private void initNavigationView() {
        navView.getMenu().getItem(0).setChecked(true); //默认第一项选中效果
        navView.setItemIconTintList(null);//防止侧滑菜单图片变灰
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                final int itemId = item.getItemId();
                navView.setCheckedItem(itemId);
                drawerLayout.closeDrawer(GravityCompat.START);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent;
                        switch (itemId) {
                            case R.id.menu_item_1:
                                intent = new Intent(getContext(), MPChartActivity.class);
//                                intent = new Intent(getContext(), RecyclerViewActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.menu_item_2:
                                intent = new Intent(getContext(), MovieActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.menu_item_3:
                                intent = new Intent(getContext(), BookActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.menu_item_4:
                                intent = new Intent(getContext(), ForumActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.menu_item_5:
                                intent = new Intent(getContext(), MusicActivity.class);
                                startActivity(intent);
                                break;
                            case R.id.menu_share_app:
                                intent = IntentUtils.getBrowserIntent(Constants.APP_SHARE_URL);
                                startActivity(intent);
                                break;
                            case R.id.menu_logout:
                                new SPUtils(Constants.SP_BASE_NAME).put(Constants.SP_USER_NAME, "");
                                intent = new Intent(getContext(), LoginActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
                                break;
                        }
                    }
                }, 300);
                return true;
            }
        });

        View headerView = navView.getHeaderView(0);
        tvWeatherText = headerView.findViewById(R.id.tv_weather_text);
        ivWeatherIcon = headerView.findViewById(R.id.iv_weather_icon);
        tvLocation = headerView.findViewById(R.id.tv_location);
    }

    private void initViewPager() {
        final List<String> sortIds = new ArrayList<>();
        final List<String> titles = new ArrayList<>();
        titles.add("数字调音台");
        titles.add("模拟调音台");
        titles.add("快速上手");
        sortIds.add("13");
        sortIds.add("15");
        sortIds.add("14");
        FragmentStatePagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return VideoFragment.getInstance(sortIds.get(position));
            }

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return titles.get(position);
            }
        };
        viewPager.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText(titles.get(0)));
        tabLayout.addTab(tabLayout.newTab().setText(titles.get(1)));
        tabLayout.addTab(tabLayout.newTab().setText(titles.get(2)));
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
//            case R.id.menu_item_more:
//                Toast.makeText(this, "淡定...", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.menu_item_search:
//                Toast.makeText(this, "淡定...", Toast.LENGTH_SHORT).show();
//                break;
            case R.id.menu_item_reward:
                Intent intent = new Intent(getContext(), RewardActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onDestroy() {
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
    public void onLoadSuccess(WeatherBean weatherBean) {
        try {
            if (weatherBean != null) {
                String location = weatherBean.getHeWeather6().get(0).getBasic().getLocation();
                tvLocation.setText(location);
                WeatherBean.HeWeather6Bean.NowBean now = weatherBean.getHeWeather6().get(0).getNow();
                tvWeatherText.setText(now.getCond_txt());
                String cond_code = now.getCond_code();
                switch (cond_code) {
                    case "100": //晴
                        ivWeatherIcon.setImageResource(R.mipmap.weather_sun);
                        break;
                    case "101": //多云
                    case "102":
                    case "104":
                        ivWeatherIcon.setImageResource(R.mipmap.weather_cloud);
                        break;
                    case "103"://晴转多云
                        ivWeatherIcon.setImageResource(R.mipmap.weather_cloud2sun);
                        break;
                    case "300": //雨
                    case "301":
                    case "302":
                    case "303":
                    case "304":
                    case "305":
                    case "306":
                    case "307":
                    case "308":
                    case "309":
                    case "310":
                    case "311":
                    case "312":
                    case "313":
                        ivWeatherIcon.setImageResource(R.mipmap.weather_rain);
                        break;
                    case "501": //沙雾
                    case "502":
                    case "503":
                    case "504":
                    case "507":
                    case "508":
                        ivWeatherIcon.setImageResource(R.mipmap.weather_sand);
                        break;
                    case "400"://雪
                    case "401":
                    case "402":
                    case "403":
                    case "404":
                    case "405":
                    case "406":
                    case "407":
                        ivWeatherIcon.setImageResource(R.mipmap.weather_snow);
                        break;
                    default:
                        ivWeatherIcon.setImageResource(R.mipmap.weather_unknow);
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onLoadFail() {

    }
}
