package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        private Button loginButton ; //登录按钮
        private Button registButton  ;//注册按钮
        private EditText userNameEdit ; //用户名控件
        private EditText passwordEdit ; //密码空间
        private String userName ; //用户名
        private String userPassword ; //用户密码；

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        //点击登录按钮
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取用户输入的账户和密码

                //从本地读取到保存好的用户记录，判断是否有匹配的账号  （数据库或者sharedpreferences)

                //匹配成功，进入账户界面

                //匹配失败，弹出提示，清除用户的输入
            }
        });


        //点击注册按钮
        registButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取用户输入的账户和密码

                //将这个账户和密码保存到本地，通过数据库或者sharedpreferences.

                //清空用户的输入
            }
        });

    }





    //初始化控件
    private void init(){
        loginButton = findViewById(R.id.loginButton);
        registButton = findViewById(R.id.registButton);
        userNameEdit = findViewById(R.id.userNameEdit);
        passwordEdit = findViewById(R.id.userPasswordEdit);

    }
}