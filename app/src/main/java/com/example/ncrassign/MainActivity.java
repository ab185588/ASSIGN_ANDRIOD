package com.example.ncrassign;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActionBar ab =  getSupportActionBar();
        ab.setTitle("MYAPP_NCR");



        Button b = findViewById(R.id.act_1_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText ename = (EditText) findViewById(R.id.act_1_name);
                EditText edob = (EditText)findViewById(R.id.act_1_dob);
                EditText egender = (EditText)findViewById(R.id.act_1_gender);
                EditText eaddress = (EditText)findViewById(R.id.act_1_Address);


                String name = ename.getText().toString();
                String dob = edob.getText().toString();
                String gender = egender.getText().toString();
                String address = eaddress.getText().toString();

                Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                i.putExtra("NAME",name);
                i.putExtra("DOB",dob);
                i.putExtra("GENDER",gender);
                i.putExtra("ADDRESS",address);
                startActivity(i);

            }

        });

    }


}