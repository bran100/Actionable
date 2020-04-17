package com.zyfdroid.tomatoclock;

import android.app.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.service.autofill.OnClickAction;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


public class MetricActivity extends Activity implements View.OnClickListener{
PieChart pieChart;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metrics);

        super.onCreate(savedInstanceState);
        Button home= findViewById(R.id.buttonHome);

        pieChart = (PieChart) findViewById(R.id.pieChart);

        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(false);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.95f);

        pieChart.setDrawHoleEnabled(true);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.setTransparentCircleRadius(61f);

        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(37f,"Work"));
        yValues.add(new PieEntry(18f,"Study"));
        yValues.add(new PieEntry(13f,"Rest"));
        yValues.add(new PieEntry(32f,"Activity"));


        PieDataSet dataSetPie = new PieDataSet(yValues,"Work Completed");
        dataSetPie.setSliceSpace(3f);
        dataSetPie.setSelectionShift(5f);
        dataSetPie.setColors(ColorTemplate.COLORFUL_COLORS);

        PieData data = new PieData((dataSetPie));
        data.setValueTextSize(10f);
        data.setValueTextColor(Color.YELLOW);

        pieChart.setData(data);
    }

@Override
    public void onClick(View v){
        Intent intent = new Intent(MetricActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);

    }
    }

