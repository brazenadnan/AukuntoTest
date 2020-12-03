package com.android.aukunto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.aukunto.Activity.ThirdActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.SignUp1);
        EditText editText = (EditText) findViewById(R.id.Email) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(getApplicationContext(), ThirdActivity.class);
                intent1.putExtra("email", editText.getText().toString());
                startActivity(intent1);
                intent1.putExtra("password",editText.getText().toString());
                startActivity(intent1);
                Intent fintent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(fintent);
            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Adnan ", "Inside on Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Adnan ", "Inside on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Adnan ", "Inside on Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Adnan ", "Inside on Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Adnan ", "Inside on Destroy");
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }
}