package com.android.aukunto.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.aukunto.MainActivity;
import com.android.aukunto.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView textView = (TextView) findViewById(R.id.name);

        textView.setOnClickListener(click -> {
            Toast.makeText(this,"You are in the signup screen",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
        textView.setText("Go to Log in Screen");
        Log.e("Adnan is ", "Inside on Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Adnan is ", "Inside on Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Adnan is ", "Inside on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Adnan is ", "Inside on Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Adnan is ", "Inside on Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Adnan is ", "Inside on Destroy");
    }
}