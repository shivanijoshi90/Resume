package com.shivani.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class homeactivity extends AppCompatActivity {

    EditText name,address,contact_no,email;

    Button reset,next;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);

        name=findViewById(R.id.name);
        address=findViewById(R.id.address);
        contact_no=findViewById(R.id.contact_no);
        email=findViewById(R.id.email);
        reset=findViewById(R.id.reset);
        next=findViewById(R.id.Next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(homeactivity.this,SecondActivity.class);
            }


        });
    }
}