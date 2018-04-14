package com.xingyun.mvpdemo.ui.fragment;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.xingyun.mvpdemo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class LineChartFragment extends Fragment {


    @BindView(R.id.mChart)
    LineChart mChart;
    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_line, container, false);
        unbinder = ButterKnife.bind(this, view);

        initLineChart();
        return view;
    }

    /**
     * 1.初始化LineChart
     * 2.添加数据x，y轴数据
     * 3.刷新图表
     */
    private void initLineChart() {
        mChart.setDrawGridBackground(false);//背景表格
        mChart.setDrawBorders(false);//边框
        //设置透明度
        mChart.setAlpha(0.8f);
        //设置是否可以触摸，如为false，则不能拖动，缩放等
        mChart.setTouchEnabled(true);
        //设置是否可以拖拽
        mChart.setDragEnabled(false);
        //设置是否可以缩放
        mChart.setScaleEnabled(false);
        //设置是否能扩大扩小
        mChart.setPinchZoom(false);


        // 加载数据
        LineData data = getLineData();
        mChart.setData(data);


//        //从X轴进入的动画
//        mChart.animateX(4000);
//        mChart.animateY(3000);   //从Y轴进入的动画
//        mChart.animateXY(3000, 3000);    //从XY轴一起进入的动画

        //设置最小的缩放
        mChart.setScaleMinima(0.5f, 1f);

        mChart.setExtraOffsets(15, 50, 15, 50);//外边距


        Legend legend = mChart.getLegend();
        legend.setForm(Legend.LegendForm.LINE);  //设置图最下面显示的类型
        legend.setTextSize(11f);
        legend.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
        legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
        legend.setOrientation(Legend.LegendOrientation.HORIZONTAL);
        legend.setDrawInside(false);
        legend.setYOffset(20f);
        legend.setEnabled(true); //显示图例


        // 刷新图表
        mChart.invalidate();
    }

    private LineData getLineData() {
        List<Entry> entries = new ArrayList<>();
        entries.add(new Entry(1, 10));
        entries.add(new Entry(2, 40));
        entries.add(new Entry(3, 30));
        entries.add(new Entry(4, 60));
        entries.add(new Entry(5, 30));
        entries.add(new Entry(6, 40));
        entries.add(new Entry(7, 20));
        LineDataSet dataSet = new LineDataSet(entries, "数据都是我瞎编的");

        dataSet.setCubicIntensity(0.2f);
        dataSet.setDrawFilled(false);  //设置包括的范围区域填充颜色
        dataSet.setDrawCircles(true);  //设置有圆点
        dataSet.setLineWidth(2f);    //设置线的宽度
        dataSet.setColor(ContextCompat.getColor(getContext(), R.color.green_color));    //设置曲线的颜色

        return new LineData(dataSet);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
