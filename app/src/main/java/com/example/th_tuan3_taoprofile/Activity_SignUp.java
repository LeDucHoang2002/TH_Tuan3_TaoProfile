package com.example.th_tuan3_taoprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_SignUp extends AppCompatActivity {
    TextView editText,editText2,editText3,editText4,editText5,editText7;
    Button btnSignUp;
    ImageButton imgbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btnSignUp=(Button)findViewById(R.id.buttonSignUp);
        editText=(TextView)findViewById(R.id.tvMaSV);
        editText.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_SIGNED);
        editText2=(TextView)findViewById(R.id.tvName);
        editText3=(TextView)findViewById(R.id.tvEmail);
        editText3.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
        editText4=(TextView)findViewById(R.id.tvPhone);
        editText4.setInputType(InputType.TYPE_CLASS_PHONE);
        editText5=(TextView)findViewById(R.id.tvFB);
        editText7=(TextView)findViewById(R.id.tvPasword);
        imgbtn=(ImageButton)findViewById(R.id.im_btn);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {;
                String maSV=editText.getText().toString();
                String pass=editText7.getText().toString();
                String n=editText2.getText().toString();
                if (maSV.equals("")==true||pass.equals("")==true||n.equals("")==true){
                    Toast.makeText(Activity_SignUp.this, "Yêu Cầu Nhập Name, MaSV và Password", Toast.LENGTH_SHORT).show();
                }else {
                if (maSV.equals("2050531200150")==true){
                    Toast.makeText(Activity_SignUp.this, "MaSV Đã Tồn Tại", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Activity_SignUp.this, "Tạo Tài Khoản Thành Công", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getApplicationContext(),Activity_profile.class);
                    intent.putExtra("MaSV",maSV);
                    String name=editText2.getText().toString();
                    intent.putExtra("Name",name);
                    String email=editText3.getText().toString();
                    intent.putExtra("Email",email);
                    String phone=editText4.getText().toString();
                    intent.putExtra("Phone",phone);
                    String fb=editText5.getText().toString();
                    intent.putExtra("FB",fb);
                    startActivity(intent);
                }}
            }
        });
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Intent);
            }
        });
    }
}