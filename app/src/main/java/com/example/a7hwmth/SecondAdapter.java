package com.example.a7hwmth;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a7hwmth.databinding.ItemBinding;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.SecondViewHolder> {
    private ArrayList<Model> data;
    private OnClickListener onClickListener;

    public SecondAdapter(ArrayList<Model> data, OnClickListener onClickListener) {
        this.data = data;
        this.onClickListener = onClickListener;
    }
    @NonNull
    @Override
    public SecondViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SecondViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));}

    @Override
    public void onBindViewHolder(@NonNull SecondViewHolder holder, int position) {
    holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class SecondViewHolder extends RecyclerView.ViewHolder{
        private ItemBinding binding;

        public SecondViewHolder(ItemBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void bind(Model model) {
            binding.tvAvtor.setText(model.getAvtor());
            binding.tvName.setText(model.getName());
            binding.tvTime.setText(model.getTime());
            binding.tvNumber.setText(model.getNumber());
            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onClickListener.onClick(data.get(getLayoutPosition()));
                }
            });
        }
    }
}
