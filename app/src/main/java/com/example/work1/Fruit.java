package com.example.work1;

public class Fruit {
    String name;
    int image;

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public Fruit(String name, int image) {
        this.name = name;
        this.image = image;
    }
}
