package com.example.conandroid;

import android.media.MediaCodec;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.conandroid.databinding.FormLoginBinding;
import com.google.android.material.textfield.TextInputLayout;

import android.os.Handler;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private FormLoginBinding binding;
    Button btn;
    private TextInputLayout emailTextInputLayout;
    private TextInputLayout passwordTextInputLayout;
    private EditText emailEditText;
    private EditText passwordEditText;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FormLoginBinding.inflate(getLayoutInflater());  // chuyen xml -> obj in java
        setContentView(binding.getRoot()); // set UI

        emailTextInputLayout = findViewById(R.id.emailTextInputLayout);
        passwordTextInputLayout = findViewById(R.id.passwordTextInputLayout);
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        btn = findViewById(R.id.loginButton);
        btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        if (isValidCredentials(email, password)) {
            emailTextInputLayout.setError(null);
            passwordTextInputLayout.setError(null);
            showSuccessMessage();
        } else {
            // Kiểm tra và thiết lập con nháy focus tại chỗ không hợp lệ
            if (TextUtils.isEmpty(email)) {
                emailTextInputLayout.setError("Email is required");
                emailEditText.requestFocus();
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                emailTextInputLayout.setError("Invalid email format");
                emailEditText.requestFocus();
            } else {
                emailTextInputLayout.setError(null);
            }

            if (TextUtils.isEmpty(password)) {
                passwordTextInputLayout.setError("Password is required");
                passwordEditText.requestFocus();
            } else if (password.length() < 6) {
                passwordTextInputLayout.setError("Password must be 6 characters");
                passwordEditText.requestFocus();
            } else {
                passwordTextInputLayout.setError(null);
            };
        }
    }

    private boolean isValidCredentials(String email, String password) {
        return !TextUtils.isEmpty(email)
                && !TextUtils.isEmpty(password)
                && Patterns.EMAIL_ADDRESS.matcher(email).matches()
                && password.length() > 5;
    }

    private void showSuccessMessage() {
        showToast("Login has been successfully!");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}