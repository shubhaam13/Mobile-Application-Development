package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.FieldClassification;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button signUpBtn;

    String regularExpr="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!])[A-Za-z\\d@$!]{8,}$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        signUpBtn = findViewById(R.id.signup);

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String pwd = password.getText().toString();

                if(validatePassword(pwd)){

                    Bundle bundle = new Bundle();

                    bundle.putString("username",uname);
                    bundle.putString("password",pwd);

                    Intent intent = new Intent(MainActivity.this,SignIn.class);

                    intent.putExtras(bundle);

                    startActivity(intent);


                }
                else{
                    Toast.makeText(MainActivity.this, "Invaild Password", Toast.LENGTH_SHORT).show();
                }

            }
        });



    }

    public boolean validatePassword(String pwd){
        Pattern pattern = Pattern.compile(regularExpr);
        Matcher matcher = pattern.matcher(pwd);

        return matcher.matches();


    }
}