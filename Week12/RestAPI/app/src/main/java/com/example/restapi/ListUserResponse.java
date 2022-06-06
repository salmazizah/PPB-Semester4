package com.example.restapi;

import java.util.List;

public class ListUserResponse{
    private int page;
    private int per_page;
    private int total;
    private int total_page;
    private List<User> data;

    public int getPage() {
        return page;
    }

    public int getPer_page() {
        return per_page;
    }

    public int getTotal() {
        return total;
    }

    public int getTotal_page() {
        return total_page;
    }

    public List<User> getData() {
        return data;
    }

    public ListUserResponse(int page, int per_page, int total, int total_page, List<User> data) {
        this.page = page;
        this.per_page = per_page;
        this.total = total;
        this.total_page = total_page;
        this.data = data;
    }
}
