package com.company;

import java.util.Scanner;

public class Feb22_HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");

        System.out.println(arr1[0] + " is the first");

        for (int i = 1; i<arr1.length-1; i++){
            System.out.println(arr1[i] + " is after " + arr1[i-1] + " and below " + arr1[i+1]);
        }

        System.out.println(arr1[arr1.length-1] + " is last");


    }
}
