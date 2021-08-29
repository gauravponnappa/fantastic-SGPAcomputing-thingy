package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {


    private Button p;
    private Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        p=findViewById(R.id.even);
        c=findViewById(R.id.odd);


        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("intVariableName", 0);

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get value from val here add if condition and make pathways to all the activities
                if (intValue==1)
                {
                    Intent myIntent5 = new Intent(MainActivity3.this, pcycle.class);
                    startActivity(myIntent5);
                }

            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intValue==1){
                    Intent myIntent6 = new Intent(MainActivity3.this, ccycle.class);
                    startActivity(myIntent6);

                }
            }
        });
    }
}