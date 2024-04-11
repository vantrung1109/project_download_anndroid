package com.example.progessbar;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView status,type;
    TextView capacity,filename,speed,time;
    ProgressBar progressBar;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        status = itemView.findViewById(R.id.status);
        type = itemView.findViewById(R.id.type);
        filename = itemView.findViewById(R.id.filename);
        capacity = itemView.findViewById(R.id.capacity);
        speed = itemView.findViewById(R.id.speed);
        time = itemView.findViewById(R.id.time);
        progressBar = itemView.findViewById(R.id.progressBar);
    }
}