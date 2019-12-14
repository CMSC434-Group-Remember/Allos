package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.provider.ContactsContract;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

//import android.support.design.widget.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button quiz_button = (Button) findViewById(R.id.button3);
        quiz_button.setOnClickListener(new OnClickListener() {

            // Call startExplicitActivation() when pressed
            @Override
            public void onClick(View v) {

                goto_quiz();

            }
        });
        Button contactButton = (Button) findViewById(R.id.button);
        contactButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                goto_add_contact();
            }
        });
        Button network_button = (Button) findViewById(R.id.button2);
        network_button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                goto_network();
            }
        });
    }
    public void goto_quiz(){
        Intent i = new Intent(this, QuizActivity.class);
        startActivity(i);
    }
    public void goto_add_contact(){
        Intent i = new Intent(this, contactActivity.class);
        startActivity(i);
    }
    public void goto_network(){
        Intent i = new Intent(this, NetworkActivity.class);
        startActivity(i);
    }







}
