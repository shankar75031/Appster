package com.example.hbg.appster;

/**
 * Created by hbg on 2/9/2018.
 */

public class Item {
    String name;
    String price;

    public Item() {
    }

    public Item(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
