package com.example.diego.mathapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SpeedConverterActivity extends AppCompatActivity {

    private String[] speeds = new String[]{ "Km/h" , "m/s"};

    private String s;

    public double speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_converter);

        final Spinner combo = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, speeds);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        combo.setAdapter(adapter);

        combo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                setS(combo.getSelectedItem().toString());
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    public double KmhConverter(double speed){
        double out = speed * 3.6;

        return out;
    }

    public double MsConverter(double speed){
        double out = (speed/3.6);
        return out;
    }



    public void calcSpeed(View v){

        TextView text = findViewById(R.id.textView3);
        EditText edit = findViewById(R.id.editText);
        Double b = Double.parseDouble(edit.getText().toString());
        String string = null;
        DecimalFormat formatador = new DecimalFormat("#.##");
        //formatador.format(MsConverter(b));
        if (s.equals("Km/h") == true) {
            text.setText(formatador.format(MsConverter(b)) + " m/s");
        } else if (s.equals("m/s")){
            text.setText(formatador.format(KmhConverter(b)) + " Km/h");
        }


    }

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}
