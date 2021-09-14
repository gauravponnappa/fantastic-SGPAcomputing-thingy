package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;


public class manual extends AppCompatActivity {

    private Button addrow;
    private Button reset;
    private TableRow row5;
    private TableRow row6;
    private TableRow row7;
    private TableRow row8;
    private TableRow row9;
    private TableRow row10;

    private EditText marks1;
    private EditText marks2;
    private EditText marks3;
    private EditText marks4;
    private EditText marks5;
    private EditText marks6;
    private EditText marks7;
    private EditText marks8;
    private EditText marks9;
    private EditText marks10;

    private TextView cr1;
    private TextView cr2;
    private TextView cr3;
    private TextView cr4;
    private TextView cr5;
    private TextView cr6;
    private TextView cr7;
    private TextView cr8;
    private TextView cr9;
    private TextView cr10;

    private Button calc;
    int counter=4;
    int obtcrd1,obtcrd2,obtcrd3,obtcrd4,obtcrd5,obtcrd6,obtcrd7,obtcrd8,obtcrd9,obtcrd10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        row5=findViewById(R.id.row5);
        row6=findViewById(R.id.row6);
        row7=findViewById(R.id.row7);
        row8=findViewById(R.id.row8);
        row9=findViewById(R.id.row9);
        row10=findViewById(R.id.row10);

        addrow=findViewById(R.id.addrow);
        reset=findViewById(R.id.reset);
        addrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=counter+1;
                if (counter==5){
                    row5.setVisibility(View.VISIBLE);
                }
                if (counter==6){
                    row6.setVisibility(View.VISIBLE);
                }
                if (counter==7){
                    row7.setVisibility(View.VISIBLE);
                }
                if (counter==8){
                    row8.setVisibility(View.VISIBLE);
                }
                if (counter==9){
                    row9.setVisibility(View.VISIBLE);
                }
                if (counter==10){
                    row10.setVisibility(View.VISIBLE);
                }
            }
        });

        marks1 = findViewById(R.id.marks1);
        marks2 = findViewById(R.id.marks2);
        marks3 = findViewById(R.id.marks3);
        marks4 = findViewById(R.id.marks4);
        marks5 = findViewById(R.id.marks5);
        marks7 = findViewById(R.id.marks6);
        marks8 = findViewById(R.id.marks7);
        marks9 = findViewById(R.id.marks8);
        marks9 = findViewById(R.id.marks9);
        marks10 = findViewById(R.id.marks10);


        cr1 = findViewById(R.id.cr1);
        cr2 = findViewById(R.id.cr2);
        cr3 = findViewById(R.id.cr3);
        cr4 = findViewById(R.id.cr4);
        cr5 = findViewById(R.id.cr5);
        cr6 = findViewById(R.id.cr6);
        cr7 = findViewById(R.id.cr7);
        cr8 = findViewById(R.id.cr8);
        cr9 = findViewById(R.id.cr9);
        cr10 = findViewById(R.id.cr10);


        calc = findViewById(R.id.buttoncalc);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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
                float mr6 = Float.parseFloat(marks6.getText().toString());
                if (mr6<35){obtcrd6=0;}
                if (mr6>=35&&mr6<40){obtcrd6=4;}
                if (mr6>=40&&mr6<45){obtcrd6=5;}
                if (mr6>=45&&mr6<60){obtcrd6=6;}
                if (mr6>=60&&mr6<70){obtcrd6=7;}
                if (mr6>=70&&mr6<80){obtcrd6=8;}
                if (mr6>=80&&mr6<89){obtcrd6=9;}
                if (mr6>=90){obtcrd6=10;}
                float mr7 = Float.parseFloat(marks7.getText().toString());
                if (mr7<35){obtcrd7=0;}
                if (mr7>=35&&mr7<40){obtcrd7=4;}
                if (mr7>=40&&mr7<45){obtcrd7=5;}
                if (mr7>=45&&mr7<60){obtcrd7=6;}
                if (mr7>=60&&mr7<70){obtcrd7=7;}
                if (mr7>=70&&mr7<80){obtcrd7=8;}
                if (mr7>=80&&mr7<89){obtcrd7=9;}
                if (mr7>=90){obtcrd7=10;}
                float mr8 = Float.parseFloat(marks8.getText().toString());
                if (mr8<35){obtcrd8=0;}
                if (mr8>=35&&mr8<40){obtcrd8=4;}
                if (mr8>=40&&mr8<45){obtcrd8=5;}
                if (mr8>=45&&mr8<60){obtcrd8=6;}
                if (mr8>=60&&mr8<70){obtcrd8=7;}
                if (mr8>=70&&mr8<80){obtcrd8=8;}
                if (mr8>=80&&mr8<89){obtcrd8=9;}
                if (mr8>=90){obtcrd8=10;}
                float mr9 = Float.parseFloat(marks9.getText().toString());
                if (mr9<35){obtcrd9=0;}
                if (mr9>=35&&mr9<40){obtcrd9=4;}
                if (mr9>=40&&mr9<45){obtcrd9=5;}
                if (mr9>=45&&mr9<60){obtcrd9=6;}
                if (mr9>=60&&mr9<70){obtcrd9=7;}
                if (mr9>=70&&mr9<80){obtcrd9=8;}
                if (mr9>=80&&mr9<89){obtcrd9=9;}
                if (mr9>=90){obtcrd9=10;}
                float mr10 = Float.parseFloat(marks10.getText().toString());
                if (mr10<35){obtcrd10=0;}
                if (mr10>=35&&mr10<40){obtcrd10=4;}
                if (mr10>=40&&mr10<45){obtcrd10=5;}
                if (mr10>=45&&mr10<60){obtcrd10=6;}
                if (mr10>=60&&mr10<70){obtcrd10=7;}
                if (mr10>=70&&mr10<80){obtcrd10=8;}
                if (mr10>=80&&mr10<89){obtcrd10=9;}
                if (mr10>=90){obtcrd10=10;}

                float s1 = Float.parseFloat(cr1.getText().toString());
                float s2 = Float.parseFloat(cr2.getText().toString());
                float s3 = Float.parseFloat(cr3.getText().toString());
                float s4 = Float.parseFloat(cr4.getText().toString());
                float s5 = Float.parseFloat(cr5.getText().toString());
                float s6 = Float.parseFloat(cr6.getText().toString());
                float s7 = Float.parseFloat(cr7.getText().toString());
                float s8 = Float.parseFloat(cr8.getText().toString());
                float s9 = Float.parseFloat(cr9.getText().toString());
                float s10 = Float.parseFloat(cr10.getText().toString());

                if (mr1>100||mr2>100||mr3>100||mr4>100||mr5>100||mr6>100||mr7>100||mr8>100){

                    Toast.makeText(manual.this, "INVALID MARKS GIVEN", Toast.LENGTH_LONG).show();

                }

                else {

                    float total = mr1 + mr2 + mr3 + mr4 + mr5+mr6+mr7+mr8+mr9;

                    float per1, per2, per3, per4, per5, per6, per7, per8, per9, per10;


                    per1=(s1*obtcrd1);
                    per2=(s2*obtcrd2);
                    per3=(s3*obtcrd3);
                    per4=(s4*obtcrd4);
                    per5=(s5*obtcrd5);
                    per6=(s6*obtcrd6);
                    per7=(s7*obtcrd7);
                    per8=(s8*obtcrd8);
                    per9=(s9*obtcrd8);
                    per10=(s10*obtcrd8);


                    float sgpa = (per1 + per2 + per3 + per4 + per5 + per6 + per7 + per8+per9+per10) / (s1+s2+s3+s4+s5+s6+s7+s8);
                    float per = (total / (counter*100)) * 100;

                    Intent intent = new Intent(manual.this, results.class);
                    Bundle extras = new Bundle();
                    extras.putFloat("total_marks", total);
                    extras.putFloat("per", per);
                    extras.putFloat("sgpa", sgpa);
                    intent.putExtras(extras);
                    startActivity(intent);
                }

            }
        });


    }
}