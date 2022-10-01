package com.example.patterns.creational.singleton;

import org.junit.jupiter.api.Test;

class SingletonWithDoubleCheckingLockingTest {

    @Test
    void getInstanceTest() {
        System.out.println("""
            If you see the same value, then singleton was reused (yay!)
            If you see different values, then 2 singletons were created (booo!!)

            RESULT:""");

        Thread threadFoo = new Thread(() -> {
            SingletonWithDoubleCheckingLocking singleton = SingletonWithDoubleCheckingLocking.getInstance("FOO");
            System.out.println(singleton.value);
        });
        Thread threadBar = new Thread(() -> {
            SingletonWithDoubleCheckingLocking singleton = SingletonWithDoubleCheckingLocking.getInstance("BAR");
            System.out.println(singleton.value);
        });

        threadFoo.start();
        threadBar.start();
    }
}