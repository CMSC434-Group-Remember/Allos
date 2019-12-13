package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import java.net.*;
import java.io.*;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuizActivity extends  AppCompatActivity{
    //Bitmap bmImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Button btn_1 = (Button) findViewById(R.id.button_option1);
        Button btn_2 = (Button) findViewById(R.id.button_option2);
        Button btn_3 = (Button) findViewById(R.id.button_option3);
        Button btn_4 = (Button) findViewById(R.id.button_option4);
        ImageView imv = (ImageView) findViewById(R.id.imageView2);
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
        btn_4.setOnClickListener(new OnClickListener() {

            // Call startExplicitActivation() when pressed
            @Override
            public void onClick(View v) {

               btn_click_incorrect();
            }
        });
        //String imageurl = "https://specials-images.forbesimg.com/imageserve/1184057015/960x0.jpg?fit=scale";
        imv.setImageResource(R.drawable.cp3);
    }
    public void btn_click_incorrect(){
        Toast.makeText(getApplicationContext(),"Not correct, please try again",Toast.LENGTH_SHORT).show();
    }
    public void btn_click_correct(){
        Toast.makeText(getApplicationContext(),"Correct!!! Good job!!",Toast.LENGTH_SHORT).show();
    }

    }




