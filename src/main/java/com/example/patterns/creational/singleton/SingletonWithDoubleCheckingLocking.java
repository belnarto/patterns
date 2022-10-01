package com.example.patterns.creational.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SingletonWithDoubleCheckingLocking {

    // volatile is mandatory for double-checking locking (DCL)
    private static volatile SingletonWithDoubleCheckingLocking instance;

    public String value;

    public static SingletonWithDoubleCheckingLocking getInstance(String value) {

        SingletonWithDoubleCheckingLocking result = instance;
        if (result != null) {
            return result;
        }
        synchronized(SingletonWithDoubleCheckingLocking.class) {
            if (instance == null) {
                instance = new SingletonWithDoubleCheckingLocking(value);
            }
            return instance;
        }
    }
}
