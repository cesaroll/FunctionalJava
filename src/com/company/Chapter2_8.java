package com.company;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Chapter2_8 {

    public static void main(String[] args) {
        // Main Function
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;

        // Validation Function
        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> divideValidate = (func) ->
            (x, y) -> {
                if (y == 0f) {
                    System.out.println("Error: Cannot divide by zero");
                    return 0f;
                }
                return func.apply(x, y);
            };

        BiFunction<Float, Float, Float> divideSafe = divideValidate.apply(divide);

        System.out.println(divideSafe.apply(10f, 0f));

    }
}
