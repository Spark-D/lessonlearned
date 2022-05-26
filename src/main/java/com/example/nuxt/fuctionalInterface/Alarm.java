package com.example.nuxt.fuctionalInterface;

public interface Alarm {

    default void turnAlarmOn() {
        System.out.println("alarm on 2222");
    }

    default void turnAlarmOff() {
        System.out.println("alarm off 2222");
    }
}