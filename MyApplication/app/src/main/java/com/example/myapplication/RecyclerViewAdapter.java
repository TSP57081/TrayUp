package com.example.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.concurrent.atomic.AtomicInteger;

public class RecyclerViewAdapter extends RecyclerView.Adapter {
    String[] dataSet;
    Activity context;
    public RecyclerViewAdapter(String[] dataSet, Activity context) {
        this.dataSet = dataSet;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TextView textView = holder.itemView.findViewById(R.id.header);
        textView.setText(dataSet[position]);
        TextView text_quantity = holder.itemView.findViewById(R.id.text_quantity);
        ImageButton minus = holder.itemView.findViewById(R.id.btn_minus);
        ImageButton plus = holder.itemView.findViewById(R.id.btn_plus);
        ImageButton lock_unlock = holder.itemView.findViewById(R.id.lock_unlock_btn);
        AtomicInteger currentValue = new AtomicInteger(Integer.parseInt(text_quantity.getText().toString()));
        if (currentValue.get() <= 0) {
            minus.setEnabled(false);
        } else {
            minus.setEnabled(true);
        }

        minus.setOnClickListener(v -> {
            text_quantity.setText(String.valueOf(currentValue.decrementAndGet()));
            if (currentValue.get() <= 0) {
                minus.setEnabled(false);
            }
        });

        plus.setOnClickListener(v -> {
            text_quantity.setText(String.valueOf(currentValue.incrementAndGet()));
            minus.setEnabled(true);
        });

        lock_unlock.setOnClickListener(v -> {
            if (plus.isEnabled()) {
                lock_unlock.setImageResource(R.drawable.lock_locked);
                plus.setEnabled(false);
                plus.setActivated(false);
                minus.setEnabled(false);
                minus.setActivated(false);
            } else {
                lock_unlock.setImageResource(R.drawable.lock_open);
                plus.setEnabled(true);
                plus.setActivated(true);
                minus.setEnabled(true);
                minus.setActivated(true);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataSet.length;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}