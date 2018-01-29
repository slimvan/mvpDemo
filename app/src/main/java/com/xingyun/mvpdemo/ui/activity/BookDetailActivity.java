package com.xingyun.mvpdemo.ui.activity;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
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
import com.xingyun.mvpdemo.contract.BookDetailContract;
import com.xingyun.mvpdemo.model.BookDetailBean;
import com.xingyun.mvpdemo.model.BookList;
import com.xingyun.mvpdemo.presenter.BookDetailPresenter;
import com.xingyun.mvpdemo.util.StringFormatUtil;
import com.xingyun.slimvan.util.DeviceUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import jp.wasabeef.glide.transformations.BlurTransformation;

public class BookDetailActivity extends BaseActivity implements BookDetailContract.View {

    @BindView(R.id.image_scrolling_top)
    ImageView imageScrollingTop;
    @BindView(R.id.iv_icon)
    ImageView ivIcon;
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.tv_writer)
    TextView tvWriter;
    @BindView(R.id.tv_publish_time)
    TextView tvPublishTime;
    @BindView(R.id.tv_publish_house)
    TextView tvPublishHouse;
    @BindView(R.id.tv_rating)
    TextView tvRating;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.app_bar_scrolling)
    AppBarLayout appBarScrolling;
    @BindView(R.id.tv_summary)
    TextView tvSummary;
    @BindView(R.id.tv_writer_intro)
    TextView tvWriterIntro;
    @BindView(R.id.fab_scrolling)
    FloatingActionButton fabScrolling;

    private BookDetailPresenter mPresenter;
    private String bookId;
    private BookList.BooksBean bookBean;
    private boolean like;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        ButterKnife.bind(this);

        if (DeviceUtils.isMoreThanLOLLIPOP()) {
            postponeEnterTransition();
        }

        bookId = getIntent().getStringExtra(Constants.EXTRA_ID);
        bookBean = (BookList.BooksBean) getIntent().getSerializableExtra(Constants.EXTRA_BOOK_BEAN);

        initViews();
    }

    private void initViews() {
        mPresenter = new BookDetailPresenter(getContext());
        mPresenter.attachView(this);

        setBasicInfo();
        initToolBar(toolbar);
        setSupportActionBar(toolbar);
        mPresenter.initData(bookId);
    }

    private void setBasicInfo() {
        if (bookBean != null) {
            BookList.BooksBean.ImagesBean images = bookBean.getImages();
            if (images != null) {
                Glide.with(getContext()).load(images.getLarge())
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

                Glide.with(getContext()).load(images.getLarge())
                        .crossFade()
                        .bitmapTransform(new BlurTransformation(getContext(), 23, 4))
                        .placeholder(R.mipmap.stackblur_default)
                        .error(R.mipmap.stackblur_default)
                        .into(imageScrollingTop);
            }

            tvTitle.setText(bookBean.getTitle());
            List<String> author = bookBean.getAuthor();
            String authors = StringFormatUtil.formatStringList(author);
            tvWriter.setText(authors);
            tvPublishTime.setText(bookBean.getPubdate());
            tvPublishHouse.setText(bookBean.getPublisher());
            BookList.BooksBean.RatingBean rating = bookBean.getRating();
            if (rating != null) {
                String average = rating.getAverage();
                tvRating.setText(average);
            }
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
    public void onLoadSuccess(BookDetailBean bookDetailBean) {
        if (bookDetailBean != null) {
            tvSummary.setText(bookDetailBean.getSummary());
            tvWriterIntro.setText(bookDetailBean.getAuthor_intro());
        }
    }

    @Override
    public void onLoadFail() {

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
