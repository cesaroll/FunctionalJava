package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Chapter3_1 {
    public static void main(String[] args) {
        var list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(list);

        var listDoubled = list.stream().map(x -> x * 2).collect(Collectors.toList());

        System.out.println(listDoubled);

    }
}
