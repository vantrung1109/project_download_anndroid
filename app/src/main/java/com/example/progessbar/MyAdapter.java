package com.example.progessbar;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
    Context context;
    List<Item> items;
    public MyAdapter(Context context,List<Item> items){
        this.context=context;
        this.items=items;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  MyViewHolder holder, int position) {
        holder.filename.setText(items.get(position).getFilename());
        holder.capacity.setText(items.get(position).getCapacity());
        holder.speed.setText(items.get(position).getSpeed());
        holder.time.setText(items.get(position).getTime());
        holder.status.setImageResource(items.get(position).getStatus());
        holder.type.setImageResource(items.get(position).getType());
        holder.progressBar.setMax(1000);
        int currentProgress = 800;
        ObjectAnimator.ofInt(holder.progressBar, "progress", currentProgress).setDuration(4000).start();
    }


    @Override
    public int getItemCount() {
        return items.size();
    }
}