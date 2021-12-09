package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
AppCompatButton b1,b2;
String getusername,getpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.username);
        e2=(EditText)findViewById(R.id.password);
        b1=(AppCompatButton)findViewById(R.id.login);
        b2=(AppCompatButton)findViewById(R.id.goToReg);
        b1.setOnClickListener(new View.OnClickListener()
             {
                @Override
                public void onClick(View v) {
                    getusername=e1.getText().toString();
                    Toast.makeText(getApplicationContext(),getusername, Toast.LENGTH_SHORT).show();
                    getpassword=e2.getText().toString();
                    Toast.makeText(getApplicationContext(),getpassword,Toast.LENGTH_LONG).show();
                }
            });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);
            }
        });


    }
}