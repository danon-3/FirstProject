package com.company;

import java.util.Scanner;

public class Arrays_15Feb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        int[] given = new int[arr1.length];
        boolean decreasing = true;
        boolean increasing = true;

        for (int i = 0; i < arr1.length; i++)
            given[i] = Integer.valueOf(arr1[i]);


        for (int i = 0; i < given.length - 1; i++) {
            if (given[i] < given[i + 1]) {
                decreasing = false;
                break;
            }
        }

        for (int i = 0; i < given.length - 1; i++) {
            if (given[i] > given[i + 1]) {
                increasing = false;
                break;
            }
        }

        if (increasing && decreasing)
            System.out.println("All elements of the array are equal");
        else if (!increasing && decreasing)
            System.out.println("Array is sorted in decreasing order");
        else if (increasing && !decreasing)
            System.out.println("Array is sorted in increasing order");
        else if (!increasing && !decreasing)
            System.out.println("Array is not sorted");


    }


}
