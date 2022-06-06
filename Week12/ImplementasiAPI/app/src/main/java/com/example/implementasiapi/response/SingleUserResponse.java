package com.example.implementasiapi.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SingleUserResponse {
    @SerializedName("data")
    private DataItem data;
    @SerializedName("support")
    private Support support;

    public void setData(DataItem data){
        this.data = data;
    }

    public DataItem getData(){
        return data;
    }

    public void setSupport(Support support){
        this.support = support;
    }

    public Support getSupport(){
        return support;
    }

    @Override
    public String toString(){
        return "ListUserResponse{" +
                "data = '" + data + '\'' +
                ",support = '" + support + '\'' +
                "}";
    }
}
