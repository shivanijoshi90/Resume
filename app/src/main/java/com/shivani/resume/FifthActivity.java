package com.shivani.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Instant;

public class FifthActivity extends AppCompatActivity {
    TextView txtNext,reset;
    EditText skill1,skill2,skill3,skill4,skill5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        txtNext=findViewById(R.id.txtNext);
        reset=findViewById(R.id.reset);
        skill1=findViewById(R.id.skill1);
        skill2=findViewById(R.id.skill2);
        skill3=findViewById(R.id.skill3);
        skill4=findViewById(R.id.skill4);
        skill5=findViewById(R.id.skill5);

        txtNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String skil = skill1.getText().toString();
                String skill = skill2.getText().toString();
                String ski= skill3.getText().toString();
                String skilll = skill4.getText().toString();
                String skile= skill5.getText().toString();

                Intent intent =new Intent(FifthActivity.this,SixthActivity.class);

            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                skill1.setText("");
                skill2.setText("");
                skill3.setText("");
                skill4.setText("");
                skill5.setText("");

            }
        });
    }

}