package com.example.implementasiapi;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.implementasiapi.response.DataResource;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    private List<DataResource> dataResources;
    private Context mContext;


    public RecycleAdapter(List<DataResource> dataResources, Context mContext) {
        this.dataResources = dataResources;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_resource, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.cName.setText(dataResources.get(i).getName());
        viewHolder.cYear.setText(dataResources.get(i).getYear());
//        viewHolder.color.setBackgroundColor(Color.parseColor(dataResources.get(i).getColor()));
    }

    @Override
    public int getItemCount() {
        return dataResources.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.color)
        ImageView color;
        @BindView(R.id.colorName)
        TextView cName;
        @BindView(R.id.year)
        TextView cYear;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}