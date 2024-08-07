package com.example.recycler;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
 rv=findViewById(R.id.rv_main);
        ArrayList<Cat> cats=new ArrayList<>();
        cats.add(new Cat(R.drawable.cat,"cat1"));
        cats.add(new Cat(R.drawable.cat1,"cat2"));
        cats.add(new Cat(R.drawable.cat2,"cat3"));
 RecyclerViewAdapter adapter= new RecyclerViewAdapter(cats) ;
        RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
        rv.hasFixedSize();
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}