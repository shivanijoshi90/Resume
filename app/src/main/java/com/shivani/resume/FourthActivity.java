package com.shivani.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView txtNext,reset;
    CheckBox dance ,writing,drawing,crafting,swimming;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

             dance=findViewById(R.id.dance);
             writing=findViewById(R.id.writing);
             drawing=findViewById(R.id.drawing);
             crafting=findViewById(R.id.crafting);
             swimming=findViewById(R.id.swimming);
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
                     Intent intent=new Intent(FourthActivity.this,FifthActivity.class);
                 }
             });

}







