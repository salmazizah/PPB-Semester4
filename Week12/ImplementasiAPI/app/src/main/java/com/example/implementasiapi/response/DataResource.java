package com.example.implementasiapi.response;

import com.google.gson.annotations.SerializedName;

public class DataResource {
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("year")
    private int year;
    @SerializedName("color")
    private String color;
    @SerializedName("patone_value")
    private String patoneValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatoneValue() {
        return patoneValue;
    }

    public void setPatoneValue(String patoneValue) {
        this.patoneValue = patoneValue;
    }

    @Override
    public String toString() {
        return "DataResource{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", patoneValue='" + patoneValue + '\'' +
                '}';
    }
}
