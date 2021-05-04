package com.company;

import java.util.Arrays;

public class Chapter2_7 {

    public static void main(String[] args) {
        Function<Function<String>> createGreeter = () -> {
            String name = "Cesar";
            return () -> "Hello " + name;
        };

        Function<String> greeter = createGreeter.apply();

        System.out.println(greeter.apply()); // When function is called, it access name

    }
}
