package com.example.a10242_assignment1.Models;

import androidx.annotation.NonNull;

public class Item {

    private String name;
    private int image;
    private String description;
    private String location;
    private String price;

    public Item(String name, int image, String description, String location, String price) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.location = location;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public int getImage() {
        return image;
    }

    public Item setImageUrl(int image) {
        this.image = image;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Item setLocation(String location) {
        this.location = location;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Item setPrice(String price) {
        this.price = price;
        return this;
    }

    @NonNull
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", image=" + image +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
