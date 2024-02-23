package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class TrayUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tray_up);

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setNavigationBarColor(ContextCompat.getColor(this,R.color.background));
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.background));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        String[] dataset = {
                "Margarine Croissants 12pk",
                "Margarine Croissant 6pk",
                "Straight croissants 4pk",
                "Mini croissants 8pk",
                "Butter chocolate brioche 4pk",
                "Raisin brioche 4pk",
                "Chocolatine 4pk",
                "Butter Greek yogurt cherry croissants 4pk",
                "Mini raspberry strudel 4pk",
                "Mini Lemon Strudel 4pk",
                "Mini apple strudel 4pk",
                "Mini blueberry strudel 4pk",
                "Mini cherry strudel 4pk",
                "Lemon Danish 4pk",
                "Cherry Danish 4pk",
                "Raspberry Danish 4pk",
                "Lemon Mini Danish 6pk",
                "Cherry Mini Danish 6pk"
        };

        recyclerView.setAdapter(new RecyclerViewAdapter(dataset, TrayUpActivity.this));
    }
}