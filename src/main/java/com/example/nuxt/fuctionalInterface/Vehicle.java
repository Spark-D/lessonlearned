package com.example.nuxt.fuctionalInterface;

@FunctionalInterface
public interface Vehicle {
    void drive();

    static void getHorsePower(int rpm, int torque) {
        System.out.println((rpm * torque) / 5252);
    }

    default void turnAlarmOn() {
        System.out.println("ON");
    }

}
