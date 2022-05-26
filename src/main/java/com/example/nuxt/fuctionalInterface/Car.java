package com.example.nuxt.fuctionalInterface;

public class Car implements Vehicle, Alarm{
    @Override
    public void drive() {
        System.out.println("뛰뛰 빵빵");
    }


    @Override
    public void turnAlarmOn() {
        Vehicle.super.turnAlarmOn(); // 인터페이스를 다중 구현했을때, 어떤 디폴트 매서드를 사용할지 명시해줘야함.
    }


}
