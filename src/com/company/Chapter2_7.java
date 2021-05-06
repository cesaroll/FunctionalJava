package com.company;

public class Chapter2_7 {

    public static void main(String[] args) {
        FunctionNoArgs<FunctionNoArgs<String>> createGreeter = () -> {
            String name = "Cesar";
            return () -> "Hello " + name;
        };

        FunctionNoArgs<String> greeter = createGreeter.apply();

        System.out.println(greeter.apply()); // When function is called, it access name

    }
}
