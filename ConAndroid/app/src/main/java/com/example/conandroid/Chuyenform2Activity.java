package com.example.conandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Chuyenform2Activity extends AppCompatActivity {

    private TextView emailTxt, passTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chuyenform2);

        Bundle bundle = getIntent().getExtras();
        String emailValue = bundle.getString("email", "GEST");
        String passValue = bundle.getString("pass", "PASS_DEFAULT");

        emailTxt = findViewById(R.id.email);
        passTxt = findViewById(R.id.pass);

        emailTxt.setText(emailValue);
        passTxt.setText(passValue);
    }
}