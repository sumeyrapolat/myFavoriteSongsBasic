package com.sumeyra.myfavoritesong;

import android.content.Intent;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sumeyra.myfavoritesong.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class songsAdapter extends RecyclerView.Adapter<songsAdapter.songsHolder> {
    ArrayList<Songs> songsArrayList;

    public songsAdapter(ArrayList<Songs> songsArrayList) {
        this.songsArrayList = songsArrayList;
    }

    @NonNull
    @Override
    public songsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // xml i bağlama işlemini yapacağız
        RecyclerRowBinding recyclerRowBinding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new songsHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull songsHolder holder, int position) {
    // layout içerisinde hangi verileri göstereceğimize karar vereceğiz
        holder.binding.recyclerViewTextView.setText(songsArrayList.get(position).bandName);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), infoPage.class);
                intent.putExtra("songs",songsArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        //xml in kaç kere oluşturulacağını söyleyecek
        return songsArrayList.size();
    }

    public class songsHolder extends RecyclerView.ViewHolder{
        //Recyclerrow oluşturulduktan sonra Binding ile koda bağlıyoruz
        // sonra constructor oluşturuyoruz
        private RecyclerRowBinding binding;

        public songsHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
