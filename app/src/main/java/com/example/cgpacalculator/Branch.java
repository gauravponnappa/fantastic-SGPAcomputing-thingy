package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Branch extends AppCompatActivity {
    private Button ec;
    private Button cs;
    private Button is;
    private Button civ;
    private Button me;
    private Button ee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);

        ec=findViewById(R.id.button2);
        cs=findViewById(R.id.button3);
        is=findViewById(R.id.button4);
        civ=findViewById(R.id.button5);
        me=findViewById(R.id.button6);
        ee=findViewById(R.id.button7);

    }
}