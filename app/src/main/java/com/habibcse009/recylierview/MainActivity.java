package com.habibcse009.recylierview;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    String countryName[] = {"Bangladesh", "India", "China", "America", "Australia", "New Zeland", "Portugal"};
    int imgFlag[] = {R.drawable.bd, R.drawable.india, R.drawable.china, R.drawable.america, R.drawable.australia, R.drawable.new_zealand, R.drawable.portugle};
    RecyclerView recyclerView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Initialize font
        /*Typeface tf = Typeface.createFromAsset(getAssets(), "Milkshake.ttf");
        Typeface tf1 = Typeface.createFromAsset(getAssets(), "Quicksand-Regular.otf");
        Typeface tf2 = Typeface.createFromAsset(getAssets(), "aqua.ttf");
        Typeface tf3 = Typeface.createFromAsset(getAssets(), "SolaimanLipi.ttf");
        btnStop.setTypeface(tf2);
        btnPause.setTypeface(tf2);*/

        recyclerView = findViewById(R.id.recyleview);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(manager);

        CustomAdapter customAdapter = new CustomAdapter(MainActivity.this, countryName, imgFlag);
        recyclerView.setAdapter(customAdapter);
    }
}
