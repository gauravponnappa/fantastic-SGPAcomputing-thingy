package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private Button year1;
    private Button year2;
    private Button year3;
    private Button year4;
    int val;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int branch = extras.getInt("branch");


        year1=findViewById(R.id.year1);
        year2=findViewById(R.id.year2);
        year3=findViewById(R.id.year3);
        year4=findViewById(R.id.year4);


        year1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 val=1;

                Intent myIntent1 = new Intent(MainActivity2.this, MainActivity3.class);
                myIntent1.putExtra("intVariableName", val);
                startActivity(myIntent1);                  }
        });


        year2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 val=2;
                int branch = extras.getInt("branch");

                Intent intent = new Intent(MainActivity2.this, evenodd.class);
                intent.putExtra("intVariableName", val);
                Bundle extras = new Bundle();
                extras.putInt("branch", branch);
                intent.putExtras(extras);
                startActivity(intent);                  }
        });


        year3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 val=3;
                int branch = extras.getInt("branch");

                Intent intent = new Intent(MainActivity2.this, evenodd.class);
                intent.putExtra("intVariableName", val);
                Bundle extras = new Bundle();
                extras.putInt("branch", branch);
                intent.putExtras(extras);
                startActivity(intent);                  }
        });


        year4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val=4;
                int branch = extras.getInt("branch");

                Intent intent = new Intent(MainActivity2.this, evenodd.class);
                intent.putExtra("intVariableName", val);
                Bundle extras = new Bundle();
                extras.putInt("branch", branch);
                intent.putExtras(extras);
                startActivity(intent);                  }
        });




    }
}