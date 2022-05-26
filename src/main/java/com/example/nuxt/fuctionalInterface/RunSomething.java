package com.example.nuxt.fuctionalInterface;

@FunctionalInterface
public interface RunSomething {

    void doIt();

    //인터페이스에서도 static 메서드를 정의할수 있다.
    static void printName() {
        System.out.println("박슬기");
    }

    //인터페이스에서도 default 메서드를 정의할 수 있다.
    default void prinAge() {
        System.out.println("20");
    }
}
