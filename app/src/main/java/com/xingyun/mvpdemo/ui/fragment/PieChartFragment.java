package com.xingyun.mvpdemo.ui.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.xingyun.mvpdemo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class PieChartFragment extends Fragment {


    @BindView(R.id.pie_chart)
    PieChart pieChart;
    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pie_chart, container, false);
        unbinder = ButterKnife.bind(this, view);

        initPieChart();
        return view;
    }

    private void initPieChart() {
        pieChart.setCenterText("这是一块饼"); //中间文字
        pieChart.setCenterTextColor(ContextCompat.getColor(getContext(), R.color.colorPrimary)); //中间文字颜色
        pieChart.setCenterTextSize(16f); //中间文字大小
        pieChart.setUsePercentValues(true); //百分比值
        pieChart.getDescription().setEnabled(false); //描述
        pieChart.animateXY(1000, 1000);//动画效果
        pieChart.setRotationEnabled(false); //触摸旋转
        pieChart.setExtraOffsets(15, 15, 15, 15); //外边距

        //图例设置
        Legend legend = pieChart.getLegend();
        legend.setEnabled(true); //显示图例
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER); //左右居中
        legend.setVerticalAlignment(Legend.LegendVerticalAlignment.TOP); //纵向靠上
        legend.setOrientation(Legend.LegendOrientation.VERTICAL); //图例排布方向
        legend.setDrawInside(false);
        legend.setDirection(Legend.LegendDirection.LEFT_TO_RIGHT);//方向
        legend.setYOffset(50f); //图例纵向边距
        legend.setYEntrySpace(10f); //图例元素间距

        setData();
    }

    private void setData() {
        List<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(55, "英雄联盟"));
        entries.add(new PieEntry(15, "守望先锋"));
        entries.add(new PieEntry(10, "炉石传说"));
        entries.add(new PieEntry(20, "绝地求生"));
        PieDataSet dataSet = new PieDataSet(entries, "数据都是我瞎编的");

        dataSet.setColors(ContextCompat.getColor(getContext(), R.color.red_color),
                ContextCompat.getColor(getContext(), R.color.green_color),
                ContextCompat.getColor(getContext(), R.color.blue_color),
                ContextCompat.getColor(getContext(), R.color.yellow_primary));
        PieData data = new PieData(dataSet);
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(11f);
        data.setValueTextColor(Color.WHITE);
        pieChart.setData(data);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
