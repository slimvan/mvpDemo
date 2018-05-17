package com.xingyun.mvpdemo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.dueeeke.videoplayer.controller.StandardVideoController;
import com.dueeeke.videoplayer.player.IjkVideoView;
import com.dueeeke.videoplayer.player.PlayerConfig;
import com.gyf.barlibrary.BarHide;
import com.gyf.barlibrary.ImmersionBar;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseActivity;
import com.xingyun.mvpdemo.contract.VideoContract;
import com.xingyun.mvpdemo.model.VideoListBean;
import com.xingyun.mvpdemo.presenter.VideoPresenter;
import com.xingyun.mvpdemo.ui.adapter.VideoDetailListAdapter;
import com.xingyun.mvpdemo.ui.adapter.VideoListAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 播放器
 */
public class IJKPlayerActivity extends BaseActivity implements VideoContract.View {

    @BindView(R.id.player)
    IjkVideoView player;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    private VideoPresenter mPresenter;
    private VideoDetailListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ijkplayer);
        ButterKnife.bind(this);

        setStatusBarSwitch(false);

        String url = getIntent().getStringExtra("url");
        String sort_id = getIntent().getStringExtra("sort_id");

        mPresenter = new VideoPresenter(getContext());
        mPresenter.attachView(this);
        initRecyclerView();
        initPlayer(url);
        mPresenter.refresh(sort_id, false);
    }

    /**
     * 初始化列表
     */
    private void initRecyclerView() {
        List<VideoListBean.ArticleListBean> datas = new ArrayList<>();
        mAdapter = new VideoDetailListAdapter(datas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                try {
                    String video_url = mAdapter.getData().get(position).getVideo_url();
                    player.pause();
                    player.release();
                    player.setUrl(video_url);
                    player.start(); //切换视频源
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * 初始化
     *
     * @param url
     */
    private void initPlayer(String url) {
        StandardVideoController controller = new StandardVideoController(this);
        player.setPlayerConfig(new PlayerConfig.Builder()
//                .autoRotate()//自动旋转屏幕
//                    .enableCache()//启用边播边存
//                .enableMediaCodec()//启动硬解码
//                .usingAndroidMediaPlayer()//使用AndroidMediaPlayer
//                .usingSurfaceView()//使用SurfaceView
                .build());
//        player.setUrl("http://mov.bn.netease.com/open-movie/nos/flv/2017/01/03/SC8U8K7BC_hd.flv");
//        player.setUrl("https://yamaha-pa-video.oss-cn-shenzhen.aliyuncs.com/m3u8/eec619e2c3df4085a367c6e0ab8cd327/1.2.Rio%E6%A6%82%E8%A7%88_H264%E9%AB%98%E6%B8%85_1280x720.m3u8");
        player.setUrl(url);
        player.setVideoController(controller);
        player.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        player.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        player.resume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        player.release();
    }


    @Override
    public void onBackPressed() {
        if (!player.onBackPressed()) {
            super.onBackPressed();
        }
    }

    public void screenScaleDefault(View view) {
        player.setScreenScale(IjkVideoView.SCREEN_SCALE_DEFAULT);
    }

    public void screenScale169(View view) {
        player.setScreenScale(IjkVideoView.SCREEN_SCALE_16_9);
    }

    public void screenScale43(View view) {
        player.setScreenScale(IjkVideoView.SCREEN_SCALE_4_3);
    }

    public void screenScaleOriginal(View view) {
        player.setScreenScale(IjkVideoView.SCREEN_SCALE_ORIGINAL);
    }

    public void screenScaleMatch(View view) {
        player.setScreenScale(IjkVideoView.SCREEN_SCALE_MATCH_PARENT);
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
    public void onLoadSuccess(List<VideoListBean.ArticleListBean> data) {
        mAdapter.setNewData(data);
    }

    @Override
    public void onLoadMoreSuccess(List<VideoListBean.ArticleListBean> data) {

    }
}
