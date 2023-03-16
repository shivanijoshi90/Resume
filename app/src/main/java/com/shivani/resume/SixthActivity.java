package com.shivani.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SixthActivity extends AppCompatActivity {

    TextView txtNext,reset;

    EditText pr1,pr2,pr3,pr4,pr5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        pr1 = findViewById(R.id.pr1);
        pr2 = findViewById(R.id.pr2);
        pr3 = findViewById(R.id.pr3);
        pr4 = findViewById(R.id.pr4);
        pr5 = findViewById(R.id.pr5);

        txtNext = findViewById(R.id.txtNext);
        reset = findViewById(R.id.reset);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p = pr1.getText().toString();
                String pr = pr2.getText().toString();
                String pro = pr3.getText().toString();
                String proj = pr4.getText().toString();
                String project = pr5.getText().toString();

            }
        });


        txtNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SixthActivity.this,templeteactivity.class);

        }
    }
     );
    }
}

