package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.chip.ChipGroup;

public class MainActivity extends AppCompatActivity {

    private Button calculate;
    private TextView marks;
    private TextView maxmarks;
    private TextView percent;
    private TextView CGPA;
    private Button reset;
    private Button act2;
    private Button act3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculate=findViewById(R.id.done);
        marks=findViewById(R.id.marks);
        maxmarks=findViewById(R.id.maxmarks);
        percent=findViewById(R.id.CGPA);
        CGPA=findViewById(R.id.percent);
        reset=findViewById(R.id.reset);







        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(marks.getText().toString()))
                {
                    Toast.makeText(MainActivity.this,
                            "Empty field not allowed!",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    float mar = Integer.parseInt(marks.getText().toString());
                    float maxmar = Integer.parseInt(maxmarks.getText().toString());
                    float per = ((mar / maxmar) * 100);
                    percent.setText(String.format("Your percentage: %.2f", per));
                    double cgpa = (per / 9.5);
                    CGPA.setText(String.format("Your CGPA: %.1f", cgpa));
                }

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marks.setText("");
                maxmarks.setText("");
                percent.setText("");
                CGPA.setText("");
            }
        });

    }
}