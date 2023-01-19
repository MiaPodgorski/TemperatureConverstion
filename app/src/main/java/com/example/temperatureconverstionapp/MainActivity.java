package com.example.temperatureconverstionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputC;
    TextView outputC;
    Button buttonC;
    EditText inputF;
    Button buttonF;
    ConstraintLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputC = findViewById(R.id.inputC);
        outputC = findViewById(R.id.outputC);
        buttonC = findViewById(R.id.buttonC);
        inputF = findViewById(R.id.inputF);
        buttonF = findViewById(R.id.buttonF);
        background = findViewById(R.id.background);

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= inputC.getText().toString();
                double x = Double.parseDouble(s);
                x=1.8*x+32;
                outputC.setText(x +" degrees fahrenheit");

                if (x<=32) background.setBackgroundColor(0xFFA9E5F8);
                else if (32<x && x<=60) background.setBackgroundColor(0xFFFAB248);
                else background.setBackgroundColor(0xF5D32F24);
            }
        });


        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= inputF.getText().toString();
                double x = Double.parseDouble(s);
                x=(x-32)*.5556;
                outputC.setText(x +" degrees celsius");

                if (x<=0) background.setBackgroundColor(0xFFA9E5F8);
                else if (0<x && x<=20) background.setBackgroundColor(0xFFFAB248);
                else  background.setBackgroundColor(0xF5D32F24);
            }
        });


    }
}