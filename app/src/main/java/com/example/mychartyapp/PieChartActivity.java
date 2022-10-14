package com.example.mychartyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        PieChart pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> listyThing =  new ArrayList<>();
        listyThing.add(new PieEntry( 20, 45));
        listyThing.add(new PieEntry( 21, 50));
        listyThing.add(new PieEntry( 22, 35));
        listyThing.add(new PieEntry( 23, 42));
        listyThing.add(new PieEntry( 24, 49));
        listyThing.add(new PieEntry( 25, 60));
        listyThing.add(new PieEntry( 26, 72));

        PieDataSet pieDataSet = new PieDataSet(listyThing, "More Awesomeness");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("PI PIE PIES");
        pieChart.animate();
    }
    public void BackButton(View view)
    {
        finish();
    }   //end back to main button event handler

}