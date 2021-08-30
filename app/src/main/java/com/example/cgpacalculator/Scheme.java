package com.example.cgpacalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lalongooo.Rings;

public class Scheme extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater help = getMenuInflater();
        help.inflate(R.menu.action, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case (R.id.help):
                Toast.makeText(Scheme.this, "Under development || Regards:Team MIT", Toast.LENGTH_LONG).show();

        }

        return super.onOptionsItemSelected(item);
    }

    /////////////////////////////////////////////////////////


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme);
        Button sc18 = (Button) findViewById(R.id.scheme18);

        sc18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scheme.this, MainActivity2.class);
                startActivity(intent);
            }
        });


        Button sc17 = (Button) findViewById(R.id.scheme17);
        sc17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Scheme.this, "Under development || Regards:Team MIT", Toast.LENGTH_LONG).show();
                // Intent intent= new Intent(Scheme.this,year17.class);
                //startActivity(intent);
            }
        });
        Button sc = (Button) findViewById(R.id.scheme);
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Scheme.this, manual.class);
                startActivity(intent);
            }
        });
    }



}
