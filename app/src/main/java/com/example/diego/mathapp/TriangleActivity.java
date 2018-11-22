package com.example.diego.mathapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TriangleActivity extends AppCompatActivity {
    double a, b, c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
    }

    public String typeTriangule(double a, double b, double c){

        String string = "Triangle";
        if ((Math.abs(a - b)< c && c < a + b) && (Math.abs(a - c) < b && b < a + c) && (Math.abs( b - c)< a && a < b + c)) {
            if (a == b && a == b && b == c) {
                string = "Equilateral Triangle ";

            } else if ((a == b && a != c) || (a == c && b != c) || (b == c && b != a)) {
                string = "Isoceles Triangle";
            }else if (a != b && a != c && b != c) {
                string = "Scalene Triangle";
            }
        } else {
            string = "Invalid Triangle";
        }
        return string;
    }


    public void checkTriangle(View v){
        EditText e = findViewById(R.id.sideA);
        EditText f = findViewById(R.id.sideB);
        EditText g = findViewById(R.id.sideC);

        a = Double.parseDouble(e.getText().toString());
        b = Double.parseDouble(f.getText().toString());
        c = Double.parseDouble(g.getText().toString());

        String s = typeTriangule(a,b,c);
        TextView t = findViewById(R.id.triangleType);
        t.setText(s);

    }

}
