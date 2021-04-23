package com.example.zomato.models;

public class NearBy {
    Integer imageurl;
    String name, type, time, percent, rating, pricepp, number;


    public NearBy(Integer imageurl, String name, String type, String time, String percent, String rating, String pricepp, String number) {
        this.imageurl = imageurl;
        this.name = name;
        this.type = type;
        this.time = time;
        this.percent = percent;
        this.rating = rating;
        this.pricepp = pricepp;
        this.number = number;
    }

    public NearBy() {

    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPricepp() {
        return pricepp;
    }

    public void setPricepp(String pricepp) {
        this.pricepp = pricepp;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
