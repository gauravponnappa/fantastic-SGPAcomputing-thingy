package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TowO extends AppCompatActivity {
    private EditText marks1;
    private EditText marks2;
    private EditText marks3;
    private EditText marks4;
    private EditText marks5;
    private EditText marks6;
    private EditText marks7;
    private EditText marks8;
    private EditText marks9;
    private TextView cr1;
    private TextView cr2;
    private TextView cr3;
    private TextView cr4;
    private TextView cr5;
    private TextView cr6;
    private TextView cr7;
    private TextView cr8;
    private TextView cr9;
    private Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tow_o);

        marks1 = findViewById(R.id.marks1);
        marks2 = findViewById(R.id.marks2);
        marks3 = findViewById(R.id.marks3);
        marks4 = findViewById(R.id.marks4);
        marks5 = findViewById(R.id.marks5);
        marks6 = findViewById(R.id.marks6);
        marks7 = findViewById(R.id.marks7);
        marks8 = findViewById(R.id.marks8);
        marks9 = findViewById(R.id.marks9);
        cr1 = findViewById(R.id.cr1);
        cr2 = findViewById(R.id.cr2);
        cr3 = findViewById(R.id.cr3);
        cr4 = findViewById(R.id.cr4);
        cr5 = findViewById(R.id.cr5);
        cr6 = findViewById(R.id.cr6);
        cr7 = findViewById(R.id.cr7);
        cr8 = findViewById(R.id.cr8);
        cr9 = findViewById(R.id.cr9);
        calc = findViewById(R.id.buttoncalc);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mtest1 = marks1.getText().toString().trim();
                String mtest2 = marks2.getText().toString().trim();
                String mtest3 = marks3.getText().toString().trim();
                String mtest4 = marks4.getText().toString().trim();
                String mtest5 = marks5.getText().toString().trim();
                String mtest6 = marks6.getText().toString().trim();
                String mtest7 = marks7.getText().toString().trim();
                String mtest8 = marks8.getText().toString().trim();
                if (mtest1.equals("") || mtest2.equals("") || mtest3.equals("") || mtest4.equals("") || mtest5.equals("") || mtest6.equals("") || mtest7.equals("") || mtest8.equals("")) {
                    Toast.makeText(TowO.this, "please fill all the fields", Toast.LENGTH_LONG).show();
                } else {

                    float mr1 = Float.parseFloat(marks1.getText().toString());
                    float mr2 = Float.parseFloat(marks2.getText().toString());
                    float mr3 = Float.parseFloat(marks3.getText().toString());
                    float mr4 = Float.parseFloat(marks4.getText().toString());
                    float mr5 = Float.parseFloat(marks5.getText().toString());
                    float mr6 = Float.parseFloat(marks6.getText().toString());
                    float mr7 = Float.parseFloat(marks7.getText().toString());
                    float mr8 = Float.parseFloat(marks8.getText().toString());
                    float mr9 = Float.parseFloat(marks9.getText().toString());

                    float s1 = Float.parseFloat(cr1.getText().toString());
                    float s2 = Float.parseFloat(cr2.getText().toString());
                    float s3 = Float.parseFloat(cr3.getText().toString());
                    float s4 = Float.parseFloat(cr4.getText().toString());
                    float s5 = Float.parseFloat(cr5.getText().toString());
                    float s6 = Float.parseFloat(cr6.getText().toString());
                    float s7 = Float.parseFloat(cr7.getText().toString());
                    float s8 = Float.parseFloat(cr8.getText().toString());
                    float s9 = Float.parseFloat(cr9.getText().toString());


                    float total = mr1 + mr2 + mr3 + mr4 + mr5 + mr6 + mr7 + mr8 + mr9;

                    float per1, per2, per3, per4, per5, per6, per7, per8, per9;


                    per1 = (float) ((mr1 / 100.0) * s1);
                    per2 = (float) ((mr1 / 100.0) * s2);
                    per3 = (float) ((mr1 / 100.0) * s3);
                    per4 = (float) ((mr1 / 100.0) * s4);
                    per5 = (float) ((mr1 / 100.0) * s5);
                    per6 = (float) ((mr1 / 100.0) * s6);
                    per7 = (float) ((mr1 / 100.0) * s7);
                    per8 = (float) ((mr1 / 100.0) * s8);
                    per9 = (float) ((mr1 / 100.0) * s9);


                    float sgpa = (float) ((per1 + per2 + per3 + per4 + per5 + per6 + per7 + per8 + per9) / 2.4);
                    float per = (total / 900) * 100;

                    Intent intent = new Intent(TowO.this, results.class);
                    Bundle extras = new Bundle();
                    extras.putFloat("total_marks", total);
                    extras.putFloat("per", per);
                    extras.putFloat("sgpa", sgpa);
                    intent.putExtras(extras);
                    startActivity(intent);

                }
            }
        });

    }

}

