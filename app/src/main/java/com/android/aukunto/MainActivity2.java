package com.android.aukunto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView dog=(TextView) findViewById(R.id.stsrted);
        dog.setOnClickListener(click->{
            Toast.makeText(this,"You are in the signup screen",Toast.LENGTH_LONG).show();
        });




    }
}