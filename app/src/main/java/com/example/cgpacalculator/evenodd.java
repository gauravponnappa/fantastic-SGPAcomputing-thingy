package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class evenodd extends AppCompatActivity {


    private Button even;
    private Button odd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evenodd);
        even=findViewById(R.id.even);
        odd=findViewById(R.id.odd);


        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("intVariableName", 0);

        even.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               //get value from val here add if condition and make pathways to all the activities
                if (intValue==2)
                {
                    Intent myIntent7 = new Intent(evenodd.this, TowE.class);
                    startActivity(myIntent7);
                }

                if (intValue==3)
                {
                    Intent myIntent8 = new Intent(evenodd.this, ThreeE.class);
                    startActivity(myIntent8);
                }

                if (intValue==4)
                {
                    Intent myIntent9 = new Intent(evenodd.this, FourE.class);
                    startActivity(myIntent9);
                }


                if (intValue==171)
                {
                    Intent myIntent7 = new Intent(evenodd.this, TowE.class);
                    startActivity(myIntent7);
                }

                if (intValue==172)
                {
                    Intent myIntent8 = new Intent(evenodd.this, ThreeE.class);
                    startActivity(myIntent8);
                }

                if (intValue==173)
                {
                    Intent myIntent9 = new Intent(evenodd.this, FourE.class);
                    startActivity(myIntent9);
                }

                if (intValue==174)
                {
                    Intent myIntent9 = new Intent(evenodd.this, FourE.class);
                    startActivity(myIntent9);
                }

            }
        });

        odd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if (intValue==2)
                {
                    Intent myIntent10 = new Intent(evenodd.this, TowO.class);
                    startActivity(myIntent10);
                }

                if (intValue==3)
                {
                    Intent myIntent11 = new Intent(evenodd.this, ThreeO.class);
                    startActivity(myIntent11);
                }

                if (intValue==4)
                {
                    Intent myIntent12 = new Intent(evenodd.this, FourO.class);
                    startActivity(myIntent12);
                }

                if (intValue==171)
                {
                    Intent myIntent7 = new Intent(evenodd.this, TowE.class);
                    startActivity(myIntent7);
                }

                if (intValue==172)
                {
                    Intent myIntent8 = new Intent(evenodd.this, ThreeE.class);
                    startActivity(myIntent8);
                }

                if (intValue==173)
                {
                    Intent myIntent9 = new Intent(evenodd.this, FourE.class);
                    startActivity(myIntent9);
                }

                if (intValue==174)
                {
                    Intent myIntent9 = new Intent(evenodd.this, FourE.class);
                    startActivity(myIntent9);
                }


            }
        });

    }
}