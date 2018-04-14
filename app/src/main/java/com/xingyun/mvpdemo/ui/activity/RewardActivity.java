package com.xingyun.mvpdemo.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.xingyun.mvpdemo.R;
import com.xingyun.mvpdemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RewardActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);
        ButterKnife.bind(this);

        initToolBar(toolbar);
    }
}
