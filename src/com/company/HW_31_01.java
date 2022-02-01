package com.company;

import java.util.Scanner;

public class HW_31_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.valueOf(scan.nextLine());
        String[] numbers = scan.nextLine().split(" ");
        int K = 0;
        int[] first = new int[numbers.length];

        for (int i=0; i< numbers.length; i++){
            first[i] = Integer.valueOf(numbers[i]);
        }

        for (int j=1; j< first.length; j++){
            if (first[j] > first[0])
                K = K + 1;
        }

        System.out.println(K);

        for (int i=1; i< first.length;i++){
            if (first[i-1] < first[i])
                K = K - 1;
            System.out.println(K);
        }
}}
