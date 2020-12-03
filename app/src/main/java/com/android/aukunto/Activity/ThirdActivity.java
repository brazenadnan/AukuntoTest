package com.android.aukunto.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.aukunto.MainActivity;
import com.android.aukunto.R;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        String person_name = getIntent().getExtras().get("email").toString();
        String person_name1= getIntent().getExtras().get("password").toString();
        TextView textView=(TextView) findViewById(R.id.xyz);
        textView.setText(person_name);
        TextView textView1=(TextView) findViewById(R.id.abc);
        textView1.setText(person_name1);
       // textView.setTextColor(Color.parseColor("FF5733"));

       // textView.setTextAppearance(getApplicationContext(), android.R.style.TextAppearance_DeviceDefault_Large);
       // textView.setTextColor(getResources().getColor(R.color.colorPrimary));

    }


}