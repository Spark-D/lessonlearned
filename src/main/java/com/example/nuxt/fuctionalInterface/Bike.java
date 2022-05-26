package com.example.nuxt.fuctionalInterface;

public class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("따르릉 따르릉");
    }

    @Override
    public void turnAlarmOn() {
        System.out.println("V 알람온");
    }
}
