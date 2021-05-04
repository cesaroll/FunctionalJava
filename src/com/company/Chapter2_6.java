package com.company;

import java.util.Arrays;
import java.util.function.Consumer;

public class Chapter2_6 {

    public static void main(String[] args) {
        Function<Function<String>> createPrinter = () -> {
            return () -> "Printer Created";
        };

        Function<Function<String>> createGreeter = () -> () -> "Hello functional";

        Function<String> greeter = createGreeter.apply();

        System.out.println(greeter.apply());

        Consumer<String> consumer = msg -> System.out.println(msg);
        consumer.accept("Hello Consumer");

        Action action = () -> System.out.println("Hello Action");
        action.perform();
    }

}
