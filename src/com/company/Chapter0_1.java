package com.company;

import java.util.Arrays;

public class Chapter0_1 {

    public static void main(String[] args) {

        // var an anonymous class
        var obj = new Object() {
            Integer Id = 100;
            boolean success = true;
        };

        System.out.println("ID: " + obj.Id + ", Success: " + obj.success);
    }

}
