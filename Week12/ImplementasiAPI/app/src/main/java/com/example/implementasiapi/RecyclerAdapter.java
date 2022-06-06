package com.example.implementasiapi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.implementasiapi.activity.ListUserActivity;
import com.example.implementasiapi.activity.LoginActivity;
import com.example.implementasiapi.activity.SingleUserDetail;
import com.example.implementasiapi.response.DataItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    public static final String EXTRA_MESSAGE = "com.example.implementasiapi.extra.MESSAGE";
    private List<DataItem> dataUser;
    private Context mContext;

    public RecyclerAdapter(List<DataItem> dataUser, Context mContext) {
        this.dataUser = dataUser;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.tvName.setText(dataUser.get(i).getFirstName());
        viewHolder.tvLastName.setText(dataUser.get(i).getLastName());
        Glide.with(mContext).load(dataUser.get(i).getAvatar()).into(viewHolder.imgAvatar);
    }

    @Override
    public int getItemCount() {
        return dataUser.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        @BindView(R.id.img_avatar)
        ImageView imgAvatar;
        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_last_name)
        TextView tvLastName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            itemView.setOnClickListener(this::onClick);
        }

        @Override
        public void onClick(View view) {
            String idUser = Integer.toString(dataUser.get(getLayoutPosition()).getId());
            Intent intent = new Intent(view.getContext(), SingleUserDetail.class);
            intent.putExtra(EXTRA_MESSAGE, idUser);
            view.getContext().startActivity(intent);
        }
    }
}