package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Chapter3_2_Filter {

    public static void main(String[] args) {

        // Even Numbers
        var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        var evens = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        evens.forEach(System.out::println);

        // Words
        var words = Arrays.asList("hello", "functional", "programming", "is", "cool");

        var smallWords = words
                .stream()
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());

        System.out.println(smallWords);

    }
}
