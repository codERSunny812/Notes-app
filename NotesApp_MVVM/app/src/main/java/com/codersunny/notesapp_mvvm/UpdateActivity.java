package com.codersunny.notesapp_mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.codeeraayush.notesapp_mvvm.databinding.ActivityUpdateBinding;

public class UpdateActivity extends AppCompatActivity {
private ActivityUpdateBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityUpdateBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }
}