package com.example.work1;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import android.widget.ListView;

import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private String[] data={"apple","banana","cherry","pear","orange","grape"};
    private ListView myList;
    private List<Fruit> fruitList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitFruit();

        myList=findViewById(R.id.my_list);
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.item_layout,fruitList);
        myList.setAdapter(adapter);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(getApplicationContext(),fruit.getName(),Toast.LENGTH_LONG).show();
            }
        });


    }
    public void InitFruit(){
        Fruit fruit=new Fruit("苹果     5元/斤",R.drawable.apple_pic);
        fruitList.add(fruit);
        Fruit fruit1=new Fruit("香蕉     6元/斤",R.drawable.banana_pic);
        fruitList.add(fruit1);
        Fruit fruit2=new Fruit("樱桃     20元/斤",R.drawable.cherry_pic);
        fruitList.add(fruit2);
        Fruit fruit3=new Fruit("梨     7元/斤",R.drawable.pear_pic);
        fruitList.add(fruit3);
        Fruit fruit4=new Fruit("橘子     4元/斤",R.drawable.orange_pic);
        fruitList.add(fruit4);
        Fruit fruit5=new Fruit("葡萄     8元/斤",R.drawable.grape_pic);
        fruitList.add(fruit5);
    }

}