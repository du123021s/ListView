package com.example.learnlayout;

import android.animation.TimeAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.example.learnlayout.databinding.CalculationBinding;
import com.example.learnlayout.databinding.FormloginBinding;
import com.example.learnlayout.databinding.VdBtnBinding;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.navigation.ui.AppBarConfiguration;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private VdBtnBinding binding;
    float tso1, tso2;
    String operation_num, congchuoi="";
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding =VdBtnBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        editText = findViewById(R.id.edit);
//        int btnList[] = {R.id.oneBtn, R.id.twoBtn,R.id.threeBtn, R.id.fourBtn, R.id.fineBtn, R.id.sixBtn, R.id.sevenBtn, R.id.eighBtn,
//                                    R.id.nineBtn, R.id.deleteBtn, R.id.mulBtn, R.id.minusBtn, R.id.divisionBtn, R.id.equalBtn, R.id.plusBtn};
//
//        for (int id:btnList){
//            View v = findViewById(id);
//            v.setOnClickListener(this);
//        }

    }

    private void toanTu(){
        tso1 = Float.parseFloat(editText.getText().toString());
        congchuoi = "";
        editText.setText("0");
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
//        int checkId = view.getId();
//        Button btn = findViewById(checkId);
//
//        if(R.id.plusBtn == checkId){
//            operation_num = "+";
//            toanTu();
//        }else if (R.id.minusBtn == checkId){
//            operation_num = "-";
//            toanTu();
//
//        }else if (R.id.mulBtn == checkId){
//            operation_num = "x";
//            toanTu();
//        }else if (R.id.divisionBtn == checkId){
//            operation_num = "/";
//            toanTu();
//        }else if (R.id.equalBtn == checkId){
//            operation_num = "=";
//            tso2 = Float.parseFloat(editText.getText().toString());
//            float result = tso1 + tso2;
//            editText.setText(String.valueOf(result));
//            tso1 = 0.0f;
//            tso2 = 0.0f;
//            congchuoi = "";
//        }else {
//            congchuoi += btn.getText().toString();
//            editText.setText(congchuoi);
//        }
    }

}