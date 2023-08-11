package com.example.conandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.conandroid.databinding.Chuyenform1Binding;
import com.google.android.material.textfield.TextInputEditText;

public class ChuyenGiaoDien extends AppCompatActivity implements View.OnClickListener {

    private Chuyenform1Binding binding;
    private TextInputEditText emailTxt, passTxt;
    Button loginBtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Chuyenform1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        emailTxt = findViewById(R.id.emailEditText);
        passTxt = findViewById(R.id.passwordEditText);
        loginBtn = findViewById(R.id.loginButton);
        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String emailStr = emailTxt.getText().toString();
        String passStr = passTxt.getText().toString();

        Intent intent = new Intent(this, Chuyenform2Activity.class);

        intent.putExtra("email",emailStr);
        intent.putExtra("pass", passStr);

        startActivity(intent);
    }
}
