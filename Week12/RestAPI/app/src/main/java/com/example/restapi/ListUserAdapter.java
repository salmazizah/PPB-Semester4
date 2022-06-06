package com.example.restapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListUserAdapter extends RecyclerView.Adapter<ListUserAdapter.UserViewHolder> {
    private LayoutInflater mInflater;
    ListUserResponse listUserResponse;

    public ListUserAdapter(Context context, ListUserResponse listUser) {
        mInflater = LayoutInflater.from(context);
        this.listUserResponse = listUser;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.listuser_item, parent, false);
        return new UserViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        public UserViewHolder(@NonNull View itemView, ListUserAdapter listUserAdapter) {
            super(itemView);
        }
    }
}
