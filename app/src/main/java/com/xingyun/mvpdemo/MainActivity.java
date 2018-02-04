package com.xingyun.mvpdemo;

import android.content.Intent;
import android.net.Uri;
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
import android.widget.Toast;

import com.xingyun.mvpdemo.base.BaseActivity;
import com.xingyun.mvpdemo.ui.activity.BookActivity;
import com.xingyun.mvpdemo.ui.activity.ForumActivity;
import com.xingyun.mvpdemo.ui.activity.LoginActivity;
import com.xingyun.mvpdemo.ui.activity.MovieActivity;
import com.xingyun.mvpdemo.ui.activity.RecyclerViewActivity;
import com.xingyun.mvpdemo.ui.fragment.FirstFragment;
import com.xingyun.slimvan.util.IntentUtils;
import com.xingyun.slimvan.util.SPUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

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
    }


    private void initToggleIcon() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }


    private void initNavigationView() {
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
                                intent = new Intent(getContext(), RecyclerViewActivity.class);
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
    }

    private void initViewPager() {
        final List<String> titles = new ArrayList<>();
        titles.add("页签1");
        titles.add("页签2");
        titles.add("页签3");

        FragmentStatePagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return FirstFragment.getInstance();
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
            case R.id.menu_item_more:
                Toast.makeText(this, "淡定...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item_search:
                Toast.makeText(this, "淡定...", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu_item_reward:
                Toast.makeText(this, "淡定...", Toast.LENGTH_SHORT).show();
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
}
