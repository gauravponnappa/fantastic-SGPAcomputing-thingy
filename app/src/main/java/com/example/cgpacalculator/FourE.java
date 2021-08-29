package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FourE extends AppCompatActivity {

        private EditText marks1;
        private EditText marks2;
        private EditText marks3;
        private EditText marks4;
        private EditText marks5;
        
        private TextView cr1;
        private TextView cr2;
        private TextView cr3;
        private TextView cr4;
        private TextView cr5;

        private Button calc;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_four_e);

            marks1 = findViewById(R.id.marks1);
            marks2 = findViewById(R.id.marks2);
            marks3 = findViewById(R.id.marks3);
            marks4 = findViewById(R.id.marks4);
            marks5 = findViewById(R.id.marks5);

            cr1 = findViewById(R.id.cr1);
            cr2 = findViewById(R.id.cr2);
            cr3 = findViewById(R.id.cr3);
            cr4 = findViewById(R.id.cr4);
            cr5 = findViewById(R.id.cr5);

            calc = findViewById(R.id.buttoncalc);


            calc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    float mr1 = Float.parseFloat(marks1.getText().toString());
                    float mr2 = Float.parseFloat(marks2.getText().toString());
                    float mr3 = Float.parseFloat(marks3.getText().toString());
                    float mr4 = Float.parseFloat(marks4.getText().toString());
                    float mr5 = Float.parseFloat(marks5.getText().toString());

                    float s1 = Float.parseFloat(cr1.getText().toString());
                    float s2 = Float.parseFloat(cr2.getText().toString());
                    float s3 = Float.parseFloat(cr3.getText().toString());
                    float s4 = Float.parseFloat(cr4.getText().toString());
                    float s5 = Float.parseFloat(cr5.getText().toString());


                    float total = mr1 + mr2 + mr3 + mr4 + mr5;

                    float per1, per2, per3, per4, per5;


                    per1 = (float) ((mr1 / 100.0) * s1);
                    per2 = (float) ((mr1 / 100.0) * s2);
                    per3 = (float) ((mr1 / 100.0) * s3);
                    per4 = (float) ((mr1 / 100.0) * s4);
                    per5 = (float) ((mr1 / 100.0) * s5);



                    float sgpa = (float) ((per1 + per2 + per3 + per4 + per5 ) / 1.8);
                    float per = (total / 500) * 100;

                    Intent intent = new Intent(FourE.this, results.class);
                    Bundle extras = new Bundle();
                    extras.putFloat("total_marks", total);
                    extras.putFloat("per", per);
                    extras.putFloat("sgpa", sgpa);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
            });

        }

    }
