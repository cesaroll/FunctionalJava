package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Chapter0_2 {

    public static void main(String[] args) {
        var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        var evens = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        evens.forEach(System.out::println);
    }
}
