package com.xingyun.mvpdemo.ui.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.xingyun.mvpdemo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class BarChartFragment extends Fragment {


    @BindView(R.id.mChart)
    BarChart mChart;
    Unbinder unbinder;
    private XAxis xAxis;
    private YAxis leftAxis;
    private YAxis rightAxis;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bar_chart, container, false);
        unbinder = ButterKnife.bind(this, view);

        initBarChart();
        return view;
    }

    private void initBarChart() {
        mChart.setDrawBarShadow(false); //背景阴影
        mChart.setDrawValueAboveBar(true);//顶部的数值
        mChart.getDescription().setEnabled(false);//描述
        mChart.setBackgroundColor(Color.WHITE);//背景颜色
        mChart.setDrawGridBackground(false);//背景网格
        mChart.setDrawBorders(true);//显示边界

        //动画效果
        mChart.animateY(1000, Easing.EasingOption.Linear);
        mChart.animateX(1000, Easing.EasingOption.Linear);

        //图例
        Legend legend = mChart.getLegend();
        legend.setForm(Legend.LegendForm.LINE);
        legend.setTextSize(11f);

        //显示位置
        legend.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        legend.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        legend.setDrawInside(false);
        legend.setEnabled(true); //显示图例

        //XY轴
        xAxis = mChart.getXAxis();
        leftAxis = mChart.getAxisLeft();
        rightAxis = mChart.getAxisRight();

        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);//X轴的位置
        xAxis.setGranularity(1f); //间隔大小
        leftAxis.setAxisMaximum(100f);
        rightAxis.setAxisMaximum(100f);
        rightAxis.setAxisMinimum(0f);
        rightAxis.setEnabled(false); //隐藏右边的y轴

        mChart.setScaleXEnabled(false); //禁止X轴缩放
        mChart.setScaleYEnabled(false); //禁止Y轴缩放
        mChart.setDoubleTapToZoomEnabled(false); //禁止双击缩放
        setData();

    }

    private void setData() {

        List<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(2016, 20));
        entries.add(new BarEntry(2017, 40));
        entries.add(new BarEntry(2018, 50));
        entries.add(new BarEntry(2019, 30));
        BarDataSet barDataSet = new BarDataSet(entries, "数据都是我瞎编的");

        barDataSet.setColors(ContextCompat.getColor(getContext(), R.color.red_color),
                ContextCompat.getColor(getContext(), R.color.green_color),
                ContextCompat.getColor(getContext(), R.color.blue_color),
                ContextCompat.getColor(getContext(), R.color.yellow_primary));

        List<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(barDataSet);

        BarData data = new BarData(dataSets);
        mChart.setData(data);

        xAxis.setLabelCount(10); //x轴刻度数
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
