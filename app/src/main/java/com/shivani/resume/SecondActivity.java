package com.shivani.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {



    TextView txtNext,reset;

    EditText year,job,awards,location,title,responsibilities;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtNext=findViewById(R.id.txtNext);
        reset=findViewById(R.id.reset);
        year=findViewById(R.id.year);
        job=findViewById(R.id.job);
        awards=findViewById(R.id.awards);
        location=findViewById(R.id.location);
        title=findViewById(R.id.title);
        responsibilities=findViewById(R.id.responsibilities);

        txtNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
            }
        });
    }
}