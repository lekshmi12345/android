package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText E1,E2,E3,E4,E5,E6,E7;
    AppCompatButton B1,B2;
    String getname,getaddress,getphno,getemid,getusername,getpassword,getcmpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        E1=(EditText) findViewById(R.id.name);
        E2=(EditText) findViewById(R.id.address);
        E3=(EditText) findViewById(R.id.phno);
        E4=(EditText) findViewById(R.id.emid);
        E5=(EditText) findViewById(R.id.username);
        E6=(EditText) findViewById(R.id.password);
        E7=(EditText) findViewById(R.id.cmpassword);
        B1=(AppCompatButton) findViewById(R.id.register);
        B2=(AppCompatButton) findViewById(R.id.blogin);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               getname=E1.getText().toString();
                Toast.makeText(getApplicationContext(),getname, Toast.LENGTH_LONG).show();
                getaddress=E2.getText().toString();
                Toast.makeText(getApplicationContext(),getaddress,Toast.LENGTH_LONG).show();
                getphno=E3.getText().toString();
                Toast.makeText(getApplicationContext(),getphno,Toast.LENGTH_LONG).show();
                getemid=E4.getText().toString();
                Toast.makeText(getApplicationContext(),getemid,Toast.LENGTH_LONG).show();
                getusername=E5.getText().toString();
                Toast.makeText(getApplicationContext(),getusername,Toast.LENGTH_LONG).show();
                getpassword=E6.getText().toString();
                Toast.makeText(getApplicationContext(),getpassword,Toast.LENGTH_LONG).show();
                getcmpassword=E7.getText().toString();
                Toast.makeText(getApplicationContext(),getcmpassword,Toast.LENGTH_LONG).show();


            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}