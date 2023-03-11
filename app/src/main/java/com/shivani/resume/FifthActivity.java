package com.shivani.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.time.Instant;

public class FifthActivity extends AppCompatActivity {
    TextView txtNext,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        txtNext=findViewById(R.id.txtNext);
        reset=findViewById(R.id.reset);

        txtNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Instant instant=new Intent(FifthActivity.this,SixthActivity.class);
            }
        });
    }

}