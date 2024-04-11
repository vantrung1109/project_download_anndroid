package com.example.progessbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ProgressBar progressBar = findViewById(R.id.);
//        progressBar.setMax(1000);
//        int currentProgress = 900;
//        ObjectAnimator.ofInt(progressBar,"progress",currentProgress).setDuration(4000).start();
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.pause,"Archive.zip",R.drawable.iconzip,"70,3m/253m","4.38mB/s","00:16/00:41"));
        items.add(new Item(R.drawable.mp3,"Music.mp3",R.drawable.start,"70,3m/253m","4.38mB/s","00:16/00:41"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}