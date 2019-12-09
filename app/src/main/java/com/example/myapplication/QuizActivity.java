package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class QuizActivity extends  AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_1 = (Button) findViewById(R.id.button1);
        Button btn_2 = (Button) findViewById(R.id.button2);
        Button btn_3 = (Button) findViewById(R.id.button3);
        Button btn_4 = (Button) findViewById(R.id.button4);
        btn_1.setOnClickListener(new OnClickListener() {

            // Call startExplicitActivation() when pressed
            @Override
            public void onClick(View v) {

               btn_click_incorrect();
            }
        });
        btn_2.setOnClickListener(new OnClickListener() {

            // Call startExplicitActivation() when pressed
            @Override
            public void onClick(View v) {

                btn_click_incorrect();
            }
        });
        btn_3.setOnClickListener(new OnClickListener() {

            // Call startExplicitActivation() when pressed
            @Override
            public void onClick(View v) {

                btn_click_correct();
            }
        });
        btn_1.setOnClickListener(new OnClickListener() {

            // Call startExplicitActivation() when pressed
            @Override
            public void onClick(View v) {

               btn_click_incorrect();
            }
        });

    }
    public void btn_click_incorrect(){
        Toast.makeText(getApplicationContext(),"Not correct, please try again",Toast.LENGTH_SHORT).show();
    }
    public void btn_click_correct(){
        Toast.makeText(getApplicationContext(),"Not correct, please try again",Toast.LENGTH_SHORT).show();
    }




}

