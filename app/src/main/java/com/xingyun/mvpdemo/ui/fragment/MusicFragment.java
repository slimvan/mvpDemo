package com.xingyun.mvpdemo.ui.fragment;


import android.media.AudioManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseFragment;
import com.xingyun.mvpdemo.contract.MusicContract;
import com.xingyun.mvpdemo.model.MusicDetailBean;
import com.xingyun.mvpdemo.model.MusicListBean;
import com.xingyun.mvpdemo.presenter.MusicPresenter;
import com.xingyun.mvpdemo.ui.activity.MusicActivity;
import com.xingyun.mvpdemo.ui.adapter.MusicListAdapter;
import com.xingyun.slimvan.view.lazyviewpager.LazyFragmentPagerAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/**
 * A simple {@link Fragment} subclass.
 */
public class MusicFragment extends BaseFragment implements MusicContract.View, LazyFragmentPagerAdapter.Laziable {


    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    SwipeRefreshLayout refreshLayout;
    Unbinder unbinder;

    public static Fragment getInstance(String mType) {
        MusicFragment instance = new MusicFragment();
        Bundle args = new Bundle();
        args.putString("type", mType);
        instance.setArguments(args);
        return instance;
    }

    MusicPresenter mPresenter;
    private MusicListAdapter mMusicListAdapter;
    private String mType;

    private IjkMediaPlayer ijkMediaPlayer;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, view);
        if (getArguments() != null) {
            this.mType = getArguments().getString("type");
        }
        return view;
    }

    @Override
    protected int getLayoutResource() {
        return R.layout.fragment_music;
    }

    @Override
    protected void initView(View view) {
        mPresenter = new MusicPresenter(getContext());
        mPresenter.attachView(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mPresenter.refresh(mType);
        initRefreshLayout();
        initRecyclerView();
        ijkMediaPlayer = ((MusicActivity) getActivity()).getIjkMediaPlayer();
    }

    private void initRefreshLayout() {
        refreshLayout.setColorSchemeColors(ContextCompat.getColor(getContext(), R.color.colorPrimary));
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mPresenter.refresh(mType);
            }
        });
    }

    private void initRecyclerView() {
        List<MusicListBean.SongListBean> datas = new ArrayList<>();
        mMusicListAdapter = new MusicListAdapter(datas);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(mMusicListAdapter);
        mMusicListAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                try {
                    String song_id = mMusicListAdapter.getData().get(position).getSong_id();
                    mPresenter.play(song_id, position);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        mMusicListAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                mPresenter.loadMore(mType);
            }
        }, recyclerView);
    }

    public void playMusic(String path, int position) {
        try {
            if (ijkMediaPlayer.isPlaying()) {
                ijkMediaPlayer.stop();
            }
            ijkMediaPlayer.reset();
            ijkMediaPlayer.setDataSource(path);
            ijkMediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            ijkMediaPlayer.prepareAsync();
            ijkMediaPlayer.start();

            for (int i = 0; i < mMusicListAdapter.getData().size(); i++) {
                mMusicListAdapter.getData().get(i).setPlaying(i == position);
            }
            mMusicListAdapter.notifyDataSetChanged();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
            List<MusicListBean.SongListBean> song_list = musicListBean.getSong_list();
            if (song_list != null) {
                mMusicListAdapter.setNewData(song_list);
            }
        }
        refreshLayout.setRefreshing(false);
    }

    @Override
    public void onLoadFail() {

    }

    @Override
    public void onLoadMoreSuccess(MusicListBean musicListBean) {
        if (musicListBean != null) {
            List<MusicListBean.SongListBean> song_list = musicListBean.getSong_list();
            if (song_list != null) {
                mMusicListAdapter.addData(song_list);
                mMusicListAdapter.loadMoreComplete();
                return;
            }
        }
        mMusicListAdapter.loadMoreEnd();
    }

    @Override
    public void onLoadMoreFail() {
        mMusicListAdapter.loadMoreFail();
    }

    @Override
    public void onPlaySuccess(MusicDetailBean musicDetailBean, int position) {
        try {
            if (musicDetailBean != null) {
                MusicDetailBean.BitrateBean bitrate = musicDetailBean.getBitrate();
                if (bitrate != null) {
                    String file_link = bitrate.getFile_link();
                    playMusic(file_link, position);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
