package com.example.nuxt.fuctionalInterface;

import java.util.function.*;

public class Foo {
    public static void main(String[] args) {
        
//        RunSomething runSomething = new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("do it!");
//            }
//        };
//
//        RunSomething runSomething2 = () -> System.out.println("do it!!");

//        Vehicle car = new Car();
//        Vehicle bike = new Bike();
//        car.drive();
//        car.turnAlarmOn();
//
//        bike.drive();
//        bike.turnAlarmOn();
//
//        Vehicle.getHorsePower(10,2);

        Function<Integer, Integer> add10 = (i) -> i + 10;
        System.out.println(add10.apply(2));

        BiFunction<Integer, Integer, String> addtoString =  (t, u) -> Integer.toString(t+u);
        System.out.println(addtoString.apply(10, 20) + "  " + addtoString.apply(10, 2).getClass());

        Consumer<String>  print = s -> System.out.println(s);
        print.accept("hello lambda");

        Supplier<Integer> fiveSuplier = () -> 5;
        System.out.println(fiveSuplier.get());

        Predicate<Integer> isOdd = integer -> integer%2 > 0;
        System.out.println(isOdd.test(2));



    }
}
