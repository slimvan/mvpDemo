package com.xingyun.mvpdemo.ui.activity;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.transition.Explode;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.xingyun.mvpdemo.Constants;
import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseActivity;
import com.xingyun.mvpdemo.contract.MovieDetailContract;
import com.xingyun.mvpdemo.model.HotMovieList;
import com.xingyun.mvpdemo.model.MovieDetailBean;
import com.xingyun.mvpdemo.presenter.MovieDetailPresenter;
import com.xingyun.mvpdemo.util.StringFormatUtil;
import com.xingyun.mvpdemo.views.widget.FlowLikeView;
import com.xingyun.slimvan.util.DeviceUtils;
import com.xingyun.slimvan.util.ImageUtils;
import com.xingyun.slimvan.util.SnackbarUtils;
import com.xingyun.slimvan.util.ToastUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.wasabeef.glide.transformations.BlurTransformation;

/**
 * 电影详情
 */
public class MovieDetailActivity extends BaseActivity implements MovieDetailContract.View {

    @BindView(R.id.image_scrolling_top)
    ImageView imageScrollingTop;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.collapsing_toolbar_layout)
    CollapsingToolbarLayout collapsingToolbarLayout;
    @BindView(R.id.app_bar_scrolling)
    AppBarLayout appBarScrolling;
    @BindView(R.id.tv_alias)
    TextView tvAlias;
    @BindView(R.id.tv_story_content)
    TextView tvStoryContent;
    @BindView(R.id.fab_scrolling)
    FloatingActionButton fabScrolling;
    @BindView(R.id.iv_icon)
    ImageView ivIcon;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_director)
    TextView tvDirector;
    @BindView(R.id.tv_starring)
    TextView tvStarring;
    @BindView(R.id.tv_type)
    TextView tvType;
    @BindView(R.id.tv_stars)
    TextView tvStars;

    MovieDetailPresenter mPresenter;
    private String movieId;
    private HotMovieList.SubjectsBean movieBean;
    private boolean like;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        ButterKnife.bind(this);

        if (DeviceUtils.isMoreThanLOLLIPOP()) {
            postponeEnterTransition();
        }

        movieId = getIntent().getStringExtra(Constants.EXTRA_ID);
        movieBean = (HotMovieList.SubjectsBean) getIntent().getSerializableExtra(Constants.EXTRA_MOVIE_BEAN);
        initViews();
    }

    private void initViews() {
        mPresenter = new MovieDetailPresenter(getContext());
        mPresenter.attachView(this);

        setBasicInfo();
        initToolBar(toolbar);
        setSupportActionBar(toolbar);
        mPresenter.initData(movieId);
    }

    /**
     * 设置基本信息  界面传值
     */
    private void setBasicInfo() {
        if (movieBean != null) {
            HotMovieList.SubjectsBean.ImagesBean images = movieBean.getImages();
            if (images != null) {
                if (!TextUtils.isEmpty(images.getLarge())) {
                    Glide.with(getContext()).load(movieBean.getImages().getLarge())
                            .dontAnimate()
                            .centerCrop()
                            .listener(new RequestListener<String, GlideDrawable>() {
                                @Override
                                public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                                    return false;
                                }

                                @Override
                                public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                                    if (DeviceUtils.isMoreThanLOLLIPOP()) {
                                        startPostponedEnterTransition();
                                    }
                                    return false;
                                }
                            })
                            .into(ivIcon);

                    Glide.with(getContext()).load(movieBean.getImages().getLarge())
                            .crossFade()
                            .bitmapTransform(new BlurTransformation(getContext(), 23, 4))
                            .placeholder(R.mipmap.stackblur_default)
                            .error(R.mipmap.stackblur_default)
                            .into(imageScrollingTop);
                }
            }
            tvTitle.setText(movieBean.getTitle());
            String directors = StringFormatUtil.formatDirectors(movieBean.getDirectors());
            tvDirector.setText(directors);
            String casts = StringFormatUtil.formatStarrings(movieBean.getCasts());
            tvStarring.setText(casts);
            String genres = StringFormatUtil.formatStringList(movieBean.getGenres());
            tvType.setText(genres);
            HotMovieList.SubjectsBean.RatingBean rating = movieBean.getRating();
            double average = rating.getAverage();
            tvStars.setText(String.valueOf(average));
        }
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
    public void onLoadSuccess(MovieDetailBean movieDetailBean) {
        if (movieDetailBean != null) {
            List<String> aka = movieDetailBean.getAka();
            StringBuilder sbaka = new StringBuilder();
            if (aka != null && aka.size() > 0) {
                for (int i = 0; i < aka.size(); i++) {
                    String str = aka.get(i);
                    sbaka.append(str);
                    if (i < aka.size() - 1) {
                        sbaka.append("/");
                    }
                }
                tvAlias.setText(sbaka);
            }

            String summary = movieDetailBean.getSummary();
            tvStoryContent.setText(summary);
        }
    }

    @OnClick(R.id.fab_scrolling)
    public void onViewClicked() {
        like = !like;
        if (like) {
            YoYo.with(Techniques.Pulse)
                    .duration(300)
                    .repeat(1)
                    .playOn(fabScrolling);
            fabScrolling.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.red_primary)));
        } else {
            fabScrolling.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.colorAccent)));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }
}
