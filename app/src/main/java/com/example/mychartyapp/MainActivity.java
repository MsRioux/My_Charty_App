package com.example.mychartyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       findViewById(R.id.barChartBtn).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(),BarChartActivity.class));
           }
       });

        findViewById(R.id.pieChartBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PieChartActivity.class));
            }
        });
    }

//    public void topClick(View v)
//    {
//        Toast.makeText(this, "You clicked the top button", Toast.LENGTH_SHORT).show();
//        Log.i("info", "The user clicked the top button");
//
//    }
}
