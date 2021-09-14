package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FourE extends AppCompatActivity {

        private EditText marks1;
        private EditText marks2;
        private EditText marks3;
        private EditText marks4;
        private EditText marks5;
        
        private TextView cr1;
        private TextView cr2;
        private TextView cr3;
        private TextView cr4;
        private TextView cr5;
        private Button reset;
        private Button calc;

    int obtcrd1,obtcrd2,obtcrd3,obtcrd4,obtcrd5;
    private TextView sub2,sub3,sub4,sub5,sub6,sub7,sub8,sub9;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_four_e);

            marks1 = findViewById(R.id.marks1);
            marks2 = findViewById(R.id.marks2);
            marks3 = findViewById(R.id.marks3);
            marks4 = findViewById(R.id.marks4);
            marks5 = findViewById(R.id.marks5);

            cr1 = findViewById(R.id.cr1);
            cr2 = findViewById(R.id.cr2);
            cr3 = findViewById(R.id.cr3);
            cr4 = findViewById(R.id.cr4);
            cr5 = findViewById(R.id.cr5);

            calc = findViewById(R.id.buttoncalc);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int branch = extras.getInt("branch");

        if (branch==1)
        {
            sub2 = findViewById(R.id.sub81);
            sub2.setText("18EC81");
            sub3 = findViewById(R.id.sub82);
            sub3.setText("18EC82x");
            sub4 = findViewById(R.id.sub83);
            sub4.setText("18ECP83");
            sub5 = findViewById(R.id.sub84);
            sub5.setText("18ECC84");
            sub6 = findViewById(R.id.sub85);
            sub6.setText("18ECI85");
         

        }
        if (branch==2)
        {
            sub2 = findViewById(R.id.sub81);
            sub2.setText("18CS81");
            sub3 = findViewById(R.id.sub82);
            sub3.setText("18CS82x");
            sub4 = findViewById(R.id.sub83);
            sub4.setText("18CSP83");
            sub5 = findViewById(R.id.sub84);
            sub5.setText("18CSC84");
            sub6 = findViewById(R.id.sub85);
            sub6.setText("18CSI85");
           

        }
        if (branch==3)
        {
            sub2 = findViewById(R.id.sub81);
            sub2.setText("18IS81");
            sub3 = findViewById(R.id.sub82);
            sub3.setText("18IS82x");
            sub4 = findViewById(R.id.sub83);
            sub4.setText("18ISP83");
            sub5 = findViewById(R.id.sub84);
            sub5.setText("18ISC84");
            sub6 = findViewById(R.id.sub85);
            sub6.setText("18ISI85");
         
        }
        if (branch==4)
        {
            sub2 = findViewById(R.id.sub81);
            sub2.setText("18CIV81");
            sub3 = findViewById(R.id.sub82);
            sub3.setText("18CIV82x");
            sub4 = findViewById(R.id.sub83);
            sub4.setText("18CIVP83");
            sub5 = findViewById(R.id.sub84);
            sub5.setText("18CIVC84");
            sub6 = findViewById(R.id.sub85);
            sub6.setText("18CIVI85");
            
        }
        if (branch==5)
        {
            sub2 = findViewById(R.id.sub81);
            sub2.setText("18ME81");
            sub3 = findViewById(R.id.sub82);
            sub3.setText("18ME82x");
            sub4 = findViewById(R.id.sub83);
            sub4.setText("18MEP83");
            sub5 = findViewById(R.id.sub84);
            sub5.setText("18MEC84");
            sub6 = findViewById(R.id.sub85);
            sub6.setText("18MEI85");
            
        }
        if (branch==6)
        {
            sub2 = findViewById(R.id.sub81);
            sub2.setText("18EE81");
            sub3 = findViewById(R.id.sub82);
            sub3.setText("18EE82x");
            sub4 = findViewById(R.id.sub83);
            sub4.setText("18EEP83");
            sub5 = findViewById(R.id.sub84);
            sub5.setText("18EEC84");
            sub6 = findViewById(R.id.sub85);
            sub6.setText("18EEI85");
          

        }

        reset=findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                marks1.setText("");
                marks2.setText("");
                marks3.setText("");
                marks4.setText("");
                marks5.setText("");


            }
        });


            calc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String mtest1 = marks1.getText().toString().trim();
                    String mtest2 = marks2.getText().toString().trim();
                    String mtest3 = marks3.getText().toString().trim();
                    String mtest4 = marks4.getText().toString().trim();
                    String mtest5 = marks5.getText().toString().trim();

                    if (mtest1.equals("") || mtest2.equals("") || mtest3.equals("") || mtest4.equals("") || mtest5.equals("")) {
                        Toast.makeText(FourE.this, "please fill all the fields", Toast.LENGTH_LONG).show();
                    }

                        else {
                            float mr1 = Float.parseFloat(marks1.getText().toString());
                            if (mr1<35){obtcrd1=0;}
                            if (mr1>=35&&mr1<40){obtcrd1=4;}
                            if (mr1>=40&&mr1<45){obtcrd1=5;}
                            if (mr1>=45&&mr1<60){obtcrd1=6;}
                            if (mr1>=60&&mr1<70){obtcrd1=7;}
                            if (mr1>=70&&mr1<80){obtcrd1=8;}
                            if (mr1>=80&&mr1<89){obtcrd1=9;}
                            if (mr1>=90){obtcrd1=10;}
                            float mr2 = Float.parseFloat(marks2.getText().toString());
                            if (mr2<35){obtcrd2=0;}
                            if (mr2>=35&&mr2<40){obtcrd2=4;}
                            if (mr2>=40&&mr2<45){obtcrd2=5;}
                            if (mr2>=45&&mr2<60){obtcrd2=6;}
                            if (mr2>=60&&mr2<70){obtcrd2=7;}
                            if (mr2>=70&&mr2<80){obtcrd2=8;}
                            if (mr2>=80&&mr2<89){obtcrd2=9;}
                            if (mr2>=90){obtcrd2=10;}
                            float mr3 = Float.parseFloat(marks3.getText().toString());
                            if (mr3<35){obtcrd3=0;}
                            if (mr3>=35&&mr3<40){obtcrd3=4;}
                            if (mr3>=40&&mr3<45){obtcrd3=5;}
                            if (mr3>=45&&mr3<60){obtcrd3=6;}
                            if (mr3>=60&&mr3<70){obtcrd3=7;}
                            if (mr3>=70&&mr3<80){obtcrd3=8;}
                            if (mr3>=80&&mr3<89){obtcrd3=9;}
                            if (mr3>=90){obtcrd3=10;}
                            float mr4 = Float.parseFloat(marks4.getText().toString());
                            if (mr4<35){obtcrd4=0;}
                            if (mr4>=35&&mr4<40){obtcrd4=4;}
                            if (mr4>=40&&mr4<45){obtcrd4=5;}
                            if (mr4>=45&&mr4<60){obtcrd4=6;}
                            if (mr4>=60&&mr4<70){obtcrd4=7;}
                            if (mr4>=70&&mr4<80){obtcrd4=8;}
                            if (mr4>=80&&mr4<89){obtcrd4=9;}
                            if (mr4>=90){obtcrd4=10;}
                            float mr5 = Float.parseFloat(marks5.getText().toString());
                            if (mr5<35){obtcrd5=0;}
                            if (mr5>=35&&mr5<40){obtcrd5=4;}
                            if (mr5>=40&&mr5<45){obtcrd5=5;}
                            if (mr5>=45&&mr5<60){obtcrd5=6;}
                            if (mr5>=60&&mr5<70){obtcrd5=7;}
                            if (mr5>=70&&mr5<80){obtcrd5=8;}
                            if (mr5>=80&&mr5<89){obtcrd5=9;}
                            if (mr5>=90){obtcrd5=10;}

                            float s1 = Float.parseFloat(cr1.getText().toString());
                            float s2 = Float.parseFloat(cr2.getText().toString());
                            float s3 = Float.parseFloat(cr3.getText().toString());
                            float s4 = Float.parseFloat(cr4.getText().toString());
                            float s5 = Float.parseFloat(cr5.getText().toString());


                            if (mr1>100||mr2>100||mr3>100||mr4>100||mr5>100){

                                Toast.makeText(FourE.this, "INVALID MARKS GIVEN", Toast.LENGTH_LONG).show();

                            }

                            else {
                                float total = mr1 + mr2 + mr3 + mr4 + mr5;

                                float per1, per2, per3, per4, per5;


                                per1=(s1*obtcrd1);
                                per2=(s2*obtcrd2);
                                per3=(s3*obtcrd3);
                                per4=(s4*obtcrd4);
                                per5=(s5*obtcrd5);


                                float sgpa = (per1 + per2 + per3 + per4 + per5 ) / (s1+s2+s3+s4+s5);
                            float per = (total / 500) * 100;

                            Intent intent = new Intent(FourE.this, results.class);
                            Bundle extras = new Bundle();
                            extras.putFloat("total_marks", total);
                            extras.putFloat("per", per);
                            extras.putFloat("sgpa", sgpa);
                            intent.putExtras(extras);
                            startActivity(intent);
                        }

                    }
                }

            });

        }

    }
