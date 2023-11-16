package com.sumeyra.myfavoritesong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sumeyra.myfavoritesong.databinding.ActivityInfoPageBinding;

public class infoPage extends AppCompatActivity {

    private ActivityInfoPageBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInfoPageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot(); // görünüme çevirme deniliyor
        setContentView(view);

        Intent intent= getIntent();
        Songs selectedSongs= (Songs)intent.getSerializableExtra("songs");
        binding.songText.setText(selectedSongs.song);
        binding.bandText.setText(selectedSongs.bandName);
        binding.imageView.setImageResource(selectedSongs.image);

    }
}