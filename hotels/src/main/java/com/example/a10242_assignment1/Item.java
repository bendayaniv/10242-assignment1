package com.example.a10242_assignment1;

import androidx.annotation.NonNull;

public class Item {

    private String name;
    private String imageUrl;
    private String description;
    private String location;
    private String price;

    public Item(String name, String imageUrl, String description, String location, String price) {
        this.name = name;
        this.imageUrl = imageUrl;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public Item setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
                ", image=" + imageUrl +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
