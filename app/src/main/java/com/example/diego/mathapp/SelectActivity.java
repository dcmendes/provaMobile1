package com.example.diego.mathapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }

    public void openTriangle(View v){
        Intent intent = new Intent(this, TriangleActivity.class);
        startActivity(intent);
    }

    public void openSpeed(View v){
        Intent intent = new Intent(this,SpeedConverterActivity.class);
        startActivity(intent);

    }




}
