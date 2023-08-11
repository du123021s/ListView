//package com.example.conandroid;
//
//import android.os.Bundle;
//
//import com.example.conandroid.databinding.FormLoginBinding;
//import com.example.conandroid.databinding.PinBinding;
//import com.google.android.material.snackbar.Snackbar;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Handler;
//import android.os.Message;
//import android.view.View;
//
//import androidx.core.view.WindowCompat;
//import androidx.navigation.NavController;
//import androidx.navigation.Navigation;
//import androidx.navigation.ui.AppBarConfiguration;
//import androidx.navigation.ui.NavigationUI;
//
//import com.example.conandroid.databinding.ActivityMainBinding;
//
//import android.view.Menu;
//import android.view.MenuItem;
//import android.widget.Button;
//import android.widget.ImageView;
//
//import java.util.Timer;
//import java.util.TimerTask;
//
//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    private FormLoginBinding binding;
//    ImageView img;
//    Button btn;
//    int i=0;
//
//    Handler handler;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        binding = FormLoginBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//
////        img = findViewById(R.id.pin);
////        btn = findViewById(R.id.btn);
////
////        btn.setOnClickListener(this);
////
////        handler = new Handler(){
////            @Override
////            public void handleMessage(@NonNull Message msg) {
////                super.handleMessage(msg);
////                if(msg.what == 0){
////                    if(i < 5){
////                        i++;
////                        img.setImageLevel(i);
////                    }else{
////                        i = 0;
////                        img.setImageLevel(i);
////                    }
////                }
////
////
////            }
////        };
////
////        Timer time = new Timer();
////        time.scheduleAtFixedRate(new TimerTask() {
////            @Override
////            public void run() {
////                handler.sendEmptyMessage(0);
////            }
////        },1000,1000);
//
//    }
//
//    @Override
//    public void onClick(View view) {
//
////        if(i < 5){
////            i++;
////            img.setImageLevel(i);
////        }else{
////            i = 0;
////        }
//
//    }
//}