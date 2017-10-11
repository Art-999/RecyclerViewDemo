package com.example.arturmusayelyan.recyclerviewdemo;

/**
 * Created by artur.musayelyan on 11/10/2017.
 */

public class Car {
    private String name;
    private int price;
    private int imageRes;

    public Car() {
    }

    public Car(String name, int price, int imageRes) {
        this.name = name;
        this.price = price;
        this.imageRes = imageRes;
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", imageRes=" + imageRes +
                '}';
    }
}
