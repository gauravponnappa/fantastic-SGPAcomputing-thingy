package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.lalongooo.Rings;

public class results extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);





        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        float total = extras.getFloat("total_marks");
        float sgpa = extras.getFloat("sgpa");


        float ringtotal = total/8;
        float ringsgpa = (sgpa*9);


        TextView oTextView = (TextView) findViewById(R.id.totalm);
        oTextView.setText(String.valueOf(total));

        float per=extras.getFloat("per");
        float ringpercent = per+10;

         TextView nTextView = (TextView) findViewById(R.id.per);
        nTextView.setText(String.valueOf(per));

         TextView mTextView = (TextView) findViewById(R.id.sgpa);
        mTextView.setText(String.valueOf(sgpa));

        Rings oRings = (Rings) findViewById(R.id.rings);
        oRings.setRingInnerFirstProgress(Float.parseFloat(String.valueOf(ringtotal)));
        Rings nRings = (Rings) findViewById(R.id.rings);
        nRings.setRingInnerSecondProgress(Float.parseFloat(String.valueOf(ringpercent)));
        Rings mRings = (Rings) findViewById(R.id.rings);
        mRings.setRingInnerThirdProgress(Float.parseFloat(String.valueOf(ringsgpa)));


        if (total<200){
            Rings xRings = (Rings) findViewById(R.id.rings);
            xRings.setRingOverallProgress(15);
        }
        if (total>200||total<300){
            Rings xRings = (Rings) findViewById(R.id.rings);
            xRings.setRingOverallProgress(25);
        }
        if (total>300||total<500){
            Rings xRings = (Rings) findViewById(R.id.rings);
            xRings.setRingOverallProgress(50);
        }
        if (total>500||total<700){
            Rings xRings = (Rings) findViewById(R.id.rings);
            xRings.setRingOverallProgress(75);
        }
        if (total>700){
            Rings xRings = (Rings) findViewById(R.id.rings);
            xRings.setRingOverallProgress(100);
        }


    }


}