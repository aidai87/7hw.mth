package com.example.a7hwmth;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a7hwmth.databinding.FragmentSecondBinding;

import java.util.ArrayList;


public class SecondFragment extends Fragment implements OnClickListener {
    private FragmentSecondBinding binding;
    private ArrayList<Model> data;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =  FragmentSecondBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        SecondAdapter adapter = new SecondAdapter(data, this :: onClick);
        binding.recycleView.setAdapter(adapter);
    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Model("Blank Space", "Taylor Swift", "1",  "3:22"));
        data.add(new Model("Watch me", "Silento", "2",  "5:36"));
        data.add(new Model("Earned it", "The Weekend", "3",  "4:51"));
        data.add(new Model("The Hills", "The Weekend", "4",  "3:41"));
        data.add(new Model("Writing's On The Wall", "Sam Smith, Jimmy Nape", "5",  "5:33"));
    }

    @Override
    public void onClick(Model model) {
    Intent intent = new Intent(requireActivity(), SecondActivity.class);
    intent.putExtra("key", model.getName());
    startActivity(intent);
    }
}