package com.example.ncrassign;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    Button bt ;
    Button bn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);





        bt = findViewById(R.id.act2_prev);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        bn = findViewById(R.id.act2_next);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extras = getIntent().getExtras();

                EditText equalification = findViewById(R.id.act_2_qualification);
                EditText epercentage = findViewById(R.id.act_2_percentage);
                EditText ecollege = findViewById(R.id.act_2_college);


                String Qualification = equalification.getText().toString();
                String percentage = epercentage.getText().toString();
                String college = ecollege.getText().toString();

                Intent i = new Intent(getApplicationContext(), MainActivity3.class);
                i.putExtra("Qualification",Qualification);
                i.putExtra("Percentage",percentage);
                i.putExtra("College",college);
                i.putExtras(extras);
                startActivity(i);
            }

        });

    }
}