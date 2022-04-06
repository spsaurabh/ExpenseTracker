package com.firstapp.expensetracker;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class expenserecycler extends RecyclerView.Adapter<expenserecycler.recycle> {


    @NonNull
    @Override
    public expenserecycler.recycle onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull expenserecycler.recycle holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class recycle extends RecyclerView.ViewHolder {
        public recycle(@NonNull View itemView) {
            super(itemView);
        }
    }
}