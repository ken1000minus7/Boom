package com.example.boom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BoomApplication {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Shape shape = (Shape) context.getBean("sphere");
        shape.draw();
        System.out.println(context.getMessage("hello_world",null,"dead",null));
        MessageSource messageSource = (MessageSource) context.getBean("messageSource");
        System.out.println(messageSource.getMessage("sadgers",null,"aha",null));
        SpringApplication.run(BoomApplication.class, args);
    }

}
