package com.example.ncrassign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity4 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Bundle extras = getIntent().getExtras();

        TextView info1 = findViewById(R.id.act1);
        TextView info2 = findViewById(R.id.act2);
        TextView info3 = findViewById(R.id.act3);

        String name = extras.getString("NAME");
        String dob = extras.getString("DOB");
        String gender = extras.getString("GENDER");
        String address = extras.getString("ADDRESS");

        info1.setText("Name : "+name+"\n"+"BirthDate : "+ dob+"\n"+"Gender : "+gender+"\n"+"Address : "+address);

        String Qualification = extras.getString("Qualification");
        String percentage = extras.getString("Percentage");
        System.out.println(percentage);
        String College = extras.getString("College");

        info2.setText("Graduation : "+Qualification+"\n"+"Percentage : "+percentage+"\n"+" College : "+College);

        String ts = extras.getString("Technology Skills");
        String pl = extras.getString("Programming Skills");
        String es = extras.getString("ExtraSkills");

        info3.setText("Technical Skills :" +ts+"\n"+"Programming Languages : "+pl+"\n"+ "Other Skills : "+es);

    }
}