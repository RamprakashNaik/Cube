package com.example.cube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cube.databinding.ActivityPhoneNumberBinding;

public class PhoneNumber extends AppCompatActivity {

    ActivityPhoneNumberBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPhoneNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.phonebox.requestFocus();

        binding.continuebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhoneNumber.this,OTPActivity.class);
                intent.putExtra("phoneNumber", binding.phonebox.getText().toString());
                startActivity(intent);
            }
        });
    }
}