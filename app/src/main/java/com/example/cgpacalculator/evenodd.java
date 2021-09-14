package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class evenodd extends AppCompatActivity {


    private Button even;
    private Button odd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evenodd);
        even=findViewById(R.id.even);
        odd=findViewById(R.id.odd);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();




        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("intVariableName", 0);

        even.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               //using value from val here add if condition and make pathways to all the activities
                if (intValue==2)
                {
                    int branch = extras.getInt("branch");
                    Intent myIntent7 = new Intent(evenodd.this, TowE.class);
                    Bundle extras = new Bundle();
                    extras.putInt("branch", branch);
                    myIntent7.putExtras(extras);
                    startActivity(myIntent7);                      }

                if (intValue==3)
                {
                    int branch = extras.getInt("branch");

                    Intent myIntent8 = new Intent(evenodd.this, ThreeE.class);
                    Bundle extras = new Bundle();
                    extras.putInt("branch", branch);
                    myIntent8.putExtras(extras);
                    startActivity(myIntent8);                      }

                if (intValue==4)
                {
                    int branch = extras.getInt("branch");

                    Intent myIntent9 = new Intent(evenodd.this, FourE.class);
                    Bundle extras = new Bundle();
                    extras.putInt("branch", branch);
                    myIntent9.putExtras(extras);
                    startActivity(myIntent9);                      }


                if (intValue==171)
                {
                    int branch = extras.getInt("branch");

                    Intent myIntent7 = new Intent(evenodd.this, TowE.class);
                    Bundle extras = new Bundle();
                    extras.putInt("branch", branch);
                    startActivity(myIntent7);                      }

                if (intValue==172)
                {
                    int branch = extras.getInt("branch");

                    Intent myIntent8 = new Intent(evenodd.this, ThreeE.class);
                    Bundle extras = new Bundle();
                    extras.putInt("branch", branch);
                    startActivity(myIntent8);                      }

                if (intValue==173)
                {
                    int branch = extras.getInt("branch");

                    Intent myIntent9 = new Intent(evenodd.this, FourE.class);
                    Bundle extras = new Bundle();
                    extras.putInt("branch", branch);
                    startActivity(myIntent9);                      }

                if (intValue==174)
                {
                    int branch = extras.getInt("branch");

                    Intent myIntent9 = new Intent(evenodd.this, FourE.class);
                    Bundle extras = new Bundle();
                    extras.putInt("branch", branch);
                    startActivity(myIntent9);                      }

            }
        });

        odd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if (intValue==2)
                {
                    int branch = extras.getInt("branch");

                    Intent myIntent10 = new Intent(evenodd.this, TowO.class);
                    Bundle extras = new Bundle();
                    extras.putInt("branch", branch);
                    myIntent10.putExtras(extras);
                    startActivity(myIntent10);                      }

                if (intValue==3)
                {
                    int branch = extras.getInt("branch");

                    Intent myIntent11 = new Intent(evenodd.this, ThreeO.class);
                    Bundle extras = new Bundle();
                    extras.putInt("branch", branch);
                    myIntent11.putExtras(extras);
                    startActivity(myIntent11);                      }

                if (intValue==4)
                {
                    int branch = extras.getInt("branch");

                    Intent myIntent12 = new Intent(evenodd.this, FourO.class);
                    Bundle extras = new Bundle();
                    extras.putInt("branch", branch);
                    myIntent12.putExtras(extras);
                    startActivity(myIntent12);                      }

                if (intValue==171)
                {
                    Intent myIntent7 = new Intent(evenodd.this, TowE.class);
                    Bundle extras = new Bundle();
                    startActivity(myIntent7);                      }

                if (intValue==172)
                {
                    Intent myIntent8 = new Intent(evenodd.this, ThreeE.class);
                    Bundle extras = new Bundle();
                    startActivity(myIntent8);                      }

                if (intValue==173)
                {
                    Intent myIntent9 = new Intent(evenodd.this, FourE.class);
                    Bundle extras = new Bundle();
                    startActivity(myIntent9);                      }

                if (intValue==174)
                {
                    Intent myIntent9 = new Intent(evenodd.this, FourE.class);
                    Bundle extras = new Bundle();
                    startActivity(myIntent9);                      }


            }
        });

    }
}