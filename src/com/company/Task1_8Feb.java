package com.company;

import java.util.Scanner;

public class Task1_8Feb {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr0 = scan.nextLine().split(" ");
        int n = arr0.length;
        int[] arr1;
        int[] arr2;
        int sum1 = 0;
        int mult1 = 1;
        int sum2 = 0;
        int mult2 = 1;

        if (n % 2 == 0){
            arr1 = new int[n / 2];
            arr2 = new int[n / 2];
            for (int i=0; i < n/2; i++){
                arr1[i] = Integer.valueOf(arr0[i]);
            }
            for (int i=n/2; i < n; i++){
                arr2[i - n/2] = Integer.valueOf(arr0[i]);
            }
        }
        else{
            arr1 = new int[(n-1) / 2];
            arr2 = new int[(n+1) / 2];
            for (int i=0; i < (n-1)/2; i++){
                arr1[i] = Integer.valueOf(arr0[i]);
            }
            for (int i=(n-1)/2; i < n; i++){
                arr2[i - n/2] = Integer.valueOf(arr0[i]);
            }
        }

        for (int e: arr1){
            sum1 = sum1 + e;
            mult1 = mult1 * e;
        }
        for (int e: arr2){
            sum2 = sum2 + e;
            mult2 = mult2 * e;
        }

        System.out.println("1st subarray\nsum: " + sum1 +"\nmultiply: " + mult1 + "\n");
        System.out.println("2nd subarray\nsum: " + sum2 +"\nmultiply: " + mult2);



    }
}
