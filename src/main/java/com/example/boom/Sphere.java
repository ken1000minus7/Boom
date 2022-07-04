package com.example.boom;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.List;

public class Sphere implements Shape, ApplicationContextAware {

    String name;
    // field injection
    @Autowired
    private MessageSource messageSource;
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
    @Autowired
    public void setRadius(int radius) {
        this.radius = radius;
    }

    int radius;
    @Override
    public void draw() {
        System.out.println(messageSource.getMessage("sphere_message",new Object[]{radius,names.get(0),names.get(1)},"life",null));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @PostConstruct
    public void createSphere(){
        System.out.println("Sphere created");
    }

    @PreDestroy
    public void destroySphere(){
        System.out.println("Sphere destroyed");
    }
}
