package com.example.th_tuan3_taoprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_profile extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,f1,f2;
    ImageView image;
    ImageButton imgbtn,imgsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        imgbtn=(ImageButton)findViewById(R.id.im_btn);
        imgsignup=(ImageButton)findViewById(R.id.imgSignup);
        t1=(TextView) findViewById(R.id.tvMaSV);
        t1.setText(getIntent().getExtras().getString("MaSV"));
        String ma = t1.getText().toString();
        if (ma.equals("2050531200150")==true){
        }else {
            t1 = (TextView) findViewById(R.id.tvMaSV);
            t1.setText(getIntent().getExtras().getString("MaSV"));
            t2 = (TextView) findViewById(R.id.tv_name);
            t2.setText(getIntent().getExtras().getString("Name"));
            t3 = (TextView) findViewById(R.id.tvEmail);
            t3.setText(getIntent().getExtras().getString("Email"));
            t4 = (TextView) findViewById(R.id.tvPhone);
            t4.setText(getIntent().getExtras().getString("Phone"));
            t5 = (TextView) findViewById(R.id.tvFB);
            t5.setText(getIntent().getExtras().getString("FB"));
            f1 = (TextView) findViewById(R.id.fl);
            f1.setText("0K");
            f2 = (TextView) findViewById(R.id.fl2);
            f2.setText("0K");
            image=(ImageView) findViewById(R.id.img);
            image.setImageResource(R.drawable.img_1);
        }
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Intent);
            }
        });
        imgsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent=new Intent(getApplicationContext(),Activity_SignUp.class);
                startActivity(Intent);
            }
        });
    }
}