package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class year17 extends AppCompatActivity {

    private Button year1;
    private Button year2;
    private Button year3;
    private Button year4;
    int val;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        year1=findViewById(R.id.year1);
        year2=findViewById(R.id.year2);
        year3=findViewById(R.id.year3);
        year4=findViewById(R.id.year4);

        getSupportActionBar().hide();

        year1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=171;
                Intent myIntent1 = new Intent(year17.this, evenodd.class);
                myIntent1.putExtra("intVariableName", val);
                startActivity(myIntent1);
            }
        });


        year2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=172;
                Intent myIntent2 = new Intent(year17.this, evenodd.class);
                myIntent2.putExtra("intVariableName", val);
                startActivity(myIntent2);
            }
        });


        year3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=173;
                Intent myIntent3 = new Intent(year17.this, evenodd.class);
                myIntent3.putExtra("intVariableName", val);
                startActivity(myIntent3);
            }
        });


        year4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=174;
                Intent myIntent4 = new Intent(year17.this, evenodd.class);
                myIntent4.putExtra("intVariableName", val);
                startActivity(myIntent4);
            }
        });




    }
}