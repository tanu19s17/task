package com.example.zomato.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.zomato.R;
import com.example.zomato.models.NearBy;

import java.util.ArrayList;

public class NearByAdapter extends RecyclerView.Adapter<NearByAdapter.ByViewHolder> {

    Context context;
    ArrayList<NearBy> nearByList;

    public NearByAdapter(Context context, ArrayList<NearBy> nearByList){
        this.context=context;
        this.nearByList = nearByList;
    }

    @NonNull
    @Override
    public ByViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.near_by_row_item,parent,false);
        return new ByViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ByViewHolder holder, int position) {
        try {
            NearBy model = nearByList.get(position);
            holder.itemImage.setImageResource(model.getImageurl());
            holder.name.setText(model.getName());
            holder.type.setText(model.getType());
            holder.time.setText(model.getTime());
            holder.percent.setText(model.getPercent());
            holder.rating.setText(model.getRating());
            holder.pricepp.setText(model.getPricepp());
            holder.number.setText(model.getNumber());
        }catch (Exception e){
            Log.d("TAG", "Exception : "+ Log.getStackTraceString(e));
        }
        }


    @Override
    public int getItemCount() {
        return nearByList.size();
    }

    public static final class ByViewHolder extends RecyclerView.ViewHolder{
        ImageView itemImage;
        TextView name, type, percent,rating, pricepp, number,time;
        public ByViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
             name = itemView.findViewById(R.id.res_name);
            type = itemView.findViewById(R.id.res_item);
            percent = itemView.findViewById(R.id.offer);
            rating = itemView.findViewById(R.id.rating);
            pricepp = itemView.findViewById(R.id.pricepp);
            number = itemView.findViewById(R.id.number);
            time = itemView.findViewById(R.id.time);

        }
    }
}
