package com.example.a7hwmth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a7hwmth.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity implements OnClickListener {
    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.tvResult.setText(getIntent().getStringExtra("key"));
    }

    @Override
    public void onClick(Model model) {

    }
}