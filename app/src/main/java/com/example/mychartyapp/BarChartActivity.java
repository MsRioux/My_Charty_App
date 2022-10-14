package com.example.mychartyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        BarChart barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> listyThing =  new ArrayList<>();
        listyThing.add(new BarEntry( 20, 45));
        listyThing.add(new BarEntry( 21, 50));
        listyThing.add(new BarEntry( 22, 35));
        listyThing.add(new BarEntry( 23, 42));
        listyThing.add(new BarEntry( 24, 49));
        listyThing.add(new BarEntry( 25, 60));
        listyThing.add(new BarEntry( 26, 72));

        BarDataSet barDataSet = new BarDataSet(listyThing, "Awesomeness");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("I can do this!");
        barChart.animateY(2000);

    }
}