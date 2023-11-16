package com.sumeyra.myfavoritesong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.sumeyra.myfavoritesong.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Songs> songsArrayList;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        songsArrayList = new ArrayList<>();

        Songs beatles = new Songs("The Beatles","Come Together", R.drawable.beatles);
        Songs ledzeppelin = new Songs("Led Zeppelin","Immigrant Song", R.drawable.ledzeppelin);
        Songs nirvana = new Songs("Nirvana","Come As You Are", R.drawable.nirvana);
        Songs queen = new Songs("Quenn","Love Of My Love",R.drawable.queen);

        songsArrayList.add(beatles);
        songsArrayList.add(ledzeppelin);
        songsArrayList.add(nirvana);
        songsArrayList.add(queen);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        songsAdapter songsAdapter= new songsAdapter(songsArrayList);
        binding.recyclerView.setAdapter(songsAdapter);



    }
}