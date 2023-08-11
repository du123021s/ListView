package com.example.conandroid;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.conandroid.databinding.HomeFastfoodBinding;

public class AppBar extends AppCompatActivity {

    private HomeFastfoodBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = HomeFastfoodBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //    Khi customer click into menu which onOptionsItemSelected method will invoke.
//    To verify what item invoke we use MenuItem.getItemId()
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        int act = item.getItemId();
//        if(R.id.action_setting == act){
//            return true;
//        }else if(R.id.action_favorite == act){
//            showUserProfile();
//            return true;
//        }else{
//            return super.onOptionsItemSelected(item);
//        }
        return true;
    }

    private void showUserProfile() {
        // Hiển thị thông tin người dùng, ví dụ:
        Toast.makeText(this, "User profile clicked", Toast.LENGTH_SHORT).show();
    }
}
