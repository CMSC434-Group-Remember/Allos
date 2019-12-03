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
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button add_contact = (Button) findViewById(R.id.btnAdd_Contact);
        add_contact.setOnClickListener(new OnClickListener() {

            // Call startExplicitActivation() when pressed
            @Override
            public void onClick(View v) {

                btnAdd_Contact_onClick();

            }
        });
    }

    public void btnAdd_Contact_onClick() {

        Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);

        EditText mEmailAddress = (EditText) findViewById(R.id.txtEmail);
        EditText mPhoneNumber = (EditText) findViewById(R.id.txtTelephone);

        intent.putExtra(ContactsContract.Intents.Insert.EMAIL, mEmailAddress.getText())
                .putExtra(ContactsContract.Intents.Insert.EMAIL_TYPE, ContactsContract.CommonDataKinds.Email.TYPE_WORK)
                .putExtra(ContactsContract.Intents.Insert.PHONE, mPhoneNumber.getText())

                .putExtra(ContactsContract.Intents.Insert.PHONE_TYPE, ContactsContract.CommonDataKinds.Phone.TYPE_WORK);


        startActivity(intent);

    }
}

