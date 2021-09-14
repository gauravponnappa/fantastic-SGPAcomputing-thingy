package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Branch extends AppCompatActivity {
    private Button ec;
    private Button cs;
    private Button is;
    private Button civ;
    private Button me;
    private Button ee;
    int branch=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);

        ec=findViewById(R.id.button4);
        cs=findViewById(R.id.button5);
        is=findViewById(R.id.button6);
        civ=findViewById(R.id.button7);
        me=findViewById(R.id.button2);
        ee=findViewById(R.id.button3);

        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branch=1;
                Intent intent = new Intent(Branch.this, Scheme.class);
                Bundle extras = new Bundle();
                extras.putInt("branch", branch);
                intent.putExtras(extras);
                startActivity(intent);
                
            }
        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branch=2;
                Intent intent = new Intent(Branch.this, Scheme.class);
                Bundle extras = new Bundle();
                extras.putInt("branch", branch);
                intent.putExtras(extras);
                startActivity(intent);                
            }
        });

        is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branch=3;
                Intent intent = new Intent(Branch.this, Scheme.class);
                Bundle extras = new Bundle();
                extras.putInt("branch", branch);
                intent.putExtras(extras);
                startActivity(intent);
            }
        });

        civ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branch=4;
                Intent intent = new Intent(Branch.this, Scheme.class);
                Bundle extras = new Bundle();
                extras.putInt("branch", branch);
                intent.putExtras(extras);
                startActivity(intent);                
            }
        });

        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branch=5;
                Intent intent = new Intent(Branch.this, Scheme.class);
                Bundle extras = new Bundle();
                extras.putInt("branch", branch);
                intent.putExtras(extras);
                startActivity(intent);                
            }
        });

        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                branch=6;
                Intent intent = new Intent(Branch.this, Scheme.class);
                Bundle extras = new Bundle();
                extras.putInt("branch", branch);
                intent.putExtras(extras);
                startActivity(intent);               
            }
        });
    }
}