package com.klu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:applicationContext.xml")
public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(MainApp.class, args);

        Car car = context.getBean(Car.class);
        car.drive();

        Bike bike = context.getBean(Bike.class);
        bike.ride();
    }
}
