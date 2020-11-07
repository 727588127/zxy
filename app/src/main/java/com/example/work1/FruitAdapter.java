package com.example.work1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FruitAdapter   extends ArrayAdapter<Fruit> {
    private  int resourceId;
    public FruitAdapter(@NonNull Context context, int textViewResourceId, List<Fruit> objects) {
        super(context, textViewResourceId,objects);
        resourceId=textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Fruit fruit=getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        ImageView fruitImage=(ImageView)view.findViewById(R.id.iv1);
        TextView fruitName =(TextView)view.findViewById(R.id.tv1);
        fruitImage.setImageResource(fruit.getImage());
        fruitName.setText(fruit.getName());
        return view;
    }
}