package com.example.boom;

public class Sphere implements Shape {

    String name;

    // constructor injection
    Sphere(String name){
        this.name = name;
    }
    public int getRadius() {
        return radius;
    }

    // setter injection
    public void setRadius(int radius) {
        this.radius = radius;
    }

    int radius;
    @Override
    public void draw() {
        System.out.println("I am " + name + " goli moli with radius "+radius);
    }
}
