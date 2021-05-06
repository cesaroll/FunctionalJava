package com.company;

import java.util.function.Consumer;

public class Chapter2_6 {

    public static void main(String[] args) {
        FunctionNoArgs<FunctionNoArgs<String>> createPrinter = () -> {
            return () -> "Printer Created";
        };

        FunctionNoArgs<FunctionNoArgs<String>> createGreeter = () -> () -> "Hello functional";

        FunctionNoArgs<String> greeter = createGreeter.apply();

        System.out.println(greeter.apply());

        Consumer<String> consumer = msg -> System.out.println(msg);
        consumer.accept("Hello Consumer");

        Action action = () -> System.out.println("Hello Action");
        action.perform();
    }

}
