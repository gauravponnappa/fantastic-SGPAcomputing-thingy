package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;


public class manual extends AppCompatActivity {

    private ImageView addrow;
    private Button reset;
    private Button calc;
    private TableRow row5;
    private TableRow row6;
    private TableRow row7;
    private TableRow row8;
    private TableRow row9;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        row5=findViewById(R.id.row5);
        row6=findViewById(R.id.row6);
        row7=findViewById(R.id.row7);
        row8=findViewById(R.id.row8);
        row9=findViewById(R.id.row9);
        addrow=findViewById(R.id.addrow);
        reset=findViewById(R.id.reset);
        addrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=counter+1;
                if (counter==1){
                    row5.setVisibility(View.VISIBLE);
                }
                if (counter==2){
                    row6.setVisibility(View.VISIBLE);
                }
                if (counter==3){
                    row7.setVisibility(View.VISIBLE);
                }
                if (counter==4){
                    row8.setVisibility(View.VISIBLE);
                }
                if (counter==5){
                    row9.setVisibility(View.VISIBLE);
                }
            }
        });


    }
}