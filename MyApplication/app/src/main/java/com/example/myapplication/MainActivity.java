package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setNavigationBarColor(ContextCompat.getColor(this,R.color.background));
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.background));

        MaterialCardView trayUpCard = findViewById(R.id.card_tray_up);
        MaterialCardView rtuCard = findViewById(R.id.card_rtu);

        trayUpCard.setOnClickListener(v -> {
            this.startActivity(new Intent(this, TrayUpActivity.class));
        });

        rtuCard.setOnClickListener(v -> {
            this.startActivity(new Intent(this, RTUActivity.class));
        });
    }
}