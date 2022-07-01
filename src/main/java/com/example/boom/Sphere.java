package com.example.boom;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Sphere implements Shape, ApplicationContextAware {

    String name;
    private ApplicationContext applicationContext;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    List<String> names;
    // constructor injection
    Sphere(String name){
        this.name = name;
    }
    public int getRadius() {
        return radius;
    }

    // setter injection
    @Required
    public void setRadius(int radius) {
        this.radius = radius;
    }

    int radius;
    @Override
    public void draw() {
        System.out.println("I am " + name + " goli moli with radius "+radius+" elo "+ names.get(0)+" "+names.get(1));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
