package com.andrenas.applicationcarros.entities;

import android.graphics.drawable.Drawable;

public class Car {

    public int id;
    public String model;
    public String Manufacture;
    public int hoursePower;
    public Double price;
    public Drawable picture;

    public Car(int id, String model, String manufacture, int hoursePower, Double price, Drawable picture) {
        this.id = id;
        this.model = model;
        Manufacture = manufacture;
        this.hoursePower = hoursePower;
        this.price = price;
        this.picture = picture;
    }
}
