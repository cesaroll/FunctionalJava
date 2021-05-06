package com.company;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Chapter3_3_Reduce {

    public static void main(String[] args) {

        var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // With Binary Operator
        BinaryOperator<Integer> getSum = (acc, x) -> {
            Integer result = acc + x;
            System.out.println("acc: " + acc + ", x: " + x);
            return result;
        };

        var sum = numbers.stream().reduce(0, getSum);
        System.out.println(sum);

        // With Lambda
        sum = numbers.stream().reduce(0, (acc, x) -> acc + x);
        System.out.println(sum);

    }
}
