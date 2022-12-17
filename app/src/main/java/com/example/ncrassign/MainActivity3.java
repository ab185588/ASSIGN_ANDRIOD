package com.example.ncrassign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button bp = findViewById(R.id.act3_prev);



        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i);
            }

        });
        Button bn = findViewById(R.id.act3_next);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extras = getIntent().getExtras();


                EditText ets = findViewById(R.id.act_3_Technologies);
                EditText epl = findViewById(R.id.act_3_lang);
                EditText ees = findViewById(R.id.act3_extraSkills);

                String ts = ets.getText().toString();
                String pl = epl.getText().toString();
                String es = ees.getText().toString();


                Intent i = new Intent(getApplicationContext(), MainActivity4.class);
                i.putExtras(extras);
                i.putExtra("Technology Skills",ts);
                i.putExtra("Programming Skills",pl);
                i.putExtra("ExtraSkills",es);
                startActivity(i);
            }
        });
    }
}