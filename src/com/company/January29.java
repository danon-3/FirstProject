package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class January29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.nextLine().split(" ");
        int N = Integer.valueOf(numbers[0]);
        int K = Integer.valueOf(numbers[1]);

        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");

        for (String e: second){
            int b = Arrays.binarySearch(first, e);
            if (b >= 0){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
}}
