package com.example.zomato;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.zomato.Adapter.NearByAdapter;
import com.example.zomato.models.NearBy;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView nearByRecycler;
    NearByAdapter nearByAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nearByRecycler = findViewById(R.id.near_by_recycler);
        ArrayList<NearBy> nearByList = new ArrayList<>();
        //nearByList.add(new NearBy(R.drawable.restro,"","","","","",""));
        nearByList.add(new NearBy(R.drawable.restro, "Hotel Kohinoor","Biriyani,North Indian, chinese","44min","50% off upto ₹100","3.7*",
                "₹150 for one", "15800+ people orderd from here since lockdown"));
        nearByList.add(new NearBy(R.drawable.icecream, "Arihant's Natural Ice cream", "Ice Cream, Beverages","21min","20% upto ₹1000","4.1*",
                "₹100 for one", "975+ people orderd from here since lockdown"));
        nearByList.add(new NearBy(R.drawable.paneer,"Live Barbeque", "Biriyani,North Indian","31 min","50% off upto ₹100", "3.7*",
                "₹100 for one","2600+ people orderd from here since lockdown"));
        nearByAdapter = new NearByAdapter(this, nearByList);
        nearByRecycler.setAdapter(nearByAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        nearByRecycler.setLayoutManager(layoutManager);
        nearByAdapter.notifyDataSetChanged();
    }

}