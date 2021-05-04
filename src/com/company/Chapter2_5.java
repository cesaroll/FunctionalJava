package com.company;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Chapter2_5 {

    protected static class MyMath {
        public static Integer add(Integer x, Integer y) {
            return x + y;
        }

        public static Integer substract(Integer x, Integer y) {
            return x - y;
        }

        public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combineFunc) {
            return combineFunc.apply(15, 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(MyMath.combine2And3(MyMath::add));
        System.out.println(MyMath.combine2And3(MyMath::substract));

        // Lambda Syntax

        System.out.println(MyMath.combine2And3((x,y) -> 2 * x + 2 * y));
    }

}
