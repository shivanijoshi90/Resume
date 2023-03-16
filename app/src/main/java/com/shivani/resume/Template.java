package com.shivani.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Template extends AppCompatActivity {
    SharedPreferences preferences;

    TextView name,address,education,email,phone,uni_name,course,grade,year,company,job,Description,job_year,skill1,skill2,skill3,skill4,github,linkedin,objective,company_name,company_link,location,pro1,pro2,pro3,hobby1,hobby2,hobby3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);

        preferences = getSharedPreferences("Data",0);

        name= findViewById(R.id.name);
        address=findViewById(R.id.address);
        education=findViewById(R.id.educate);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        uni_name=findViewById(R.id.uni_name);
        course=findViewById(R.id.course);
        grade=findViewById(R.id.grade);
        year=findViewById(R.id.year);
        company=findViewById(R.id.company);
        job=findViewById(R.id.job);
        Description=findViewById(R.id.Description);
        job_year=findViewById(R.id.job_year);
        skill1=findViewById(R.id.skill1);
        skill2=findViewById(R.id.skill2);
        skill3=findViewById(R.id.skill3);
        skill4=findViewById(R.id.skill4);
        github=findViewById(R.id.Github);
        linkedin=findViewById(R.id.Linkedin);
        objective=findViewById(R.id.objective);
        company_name=findViewById(R.id.company_name);
        company_link=findViewById(R.id.company_link);
        location=findViewById(R.id.location);
        pro1=findViewById(R.id.pro1);
        pro2=findViewById(R.id.pro2);
        pro3=findViewById(R.id.pro3);
        hobby1=findViewById(R.id.hobby1);
        hobby2=findViewById(R.id.hobby2);
        hobby3=findViewById(R.id.hobby3);

        String n1=preferences.getString("name","");
        String n2=preferences.getString("address","");
        String n3=preferences.getString("education","");
        String n4=preferences.getString("email","");
        String n5=preferences.getString("phone","");
        String n6=preferences.getString("uni_name","");
        String n7=preferences.getString("course","");
        String n8=preferences.getString("grade","");
        String n9=preferences.getString("year","");
        String n10=preferences.getString("company","");
        String n11=preferences.getString("job","");
        String n12=preferences.getString("description","");
        String n13=preferences.getString("job_year","");
        String n14=preferences.getString("skill1","");
        String n15=preferences.getString("skill2","");
        String n16=preferences.getString("skill3","");
        String n17=preferences.getString("skill4","");
        String n18=preferences.getString("github","");
        String n19=preferences.getString("linkedin","");
        String n20=preferences.getString("objective","");
        String n21=preferences.getString("company_name","");
        String n22=preferences.getString("company_link","");
        String n23=preferences.getString("location","");
        String n24=preferences.getString("pro1","");
        String n25=preferences.getString("pro2","");
        String n26=preferences.getString("pr03","");
        String n27=preferences.getString("hobby1","");
        String n28=preferences.getString("hobby2","");
        String n29=preferences.getString("hobby3","");


        name.setText(n1);
        address.setText(n2);
        education.setText(n3);
        email.setText(n4);
        phone.setText(n5);
        uni_name.setText(n6);
        course.setText(n7);
        grade.setText(n8);
        year.setText(n9);
        company.setText(n10);
        job.setText(n11);
        Description.setText(n12);
        job_year.setText(n13);
        skill1.setText(n14);
        skill2.setText(n15);
        skill3.setText(n16);
        skill4.setText(n17);
        github.setText(n18);
        linkedin.setText(n19);
        objective.setText(n20);
        company_name.setText(n21);
        company_link.setText(n22);
        location.setText(n23);
        pro1.setText(n24);
        pro2.setText(n25);
        pro3.setText(n26);
        hobby1.setText(n27);
        hobby2.setText(n28);
        hobby3.setText(n29);










    }
}