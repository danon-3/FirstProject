package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HW_04_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr0 = scan.nextLine().split(" ");
        int[] arr = new int[arr0.length];
        for (int i=0; i< arr.length; i++){
            arr[i] = Integer.valueOf(arr0[i]);
        }
        int a;

        for (int i=0; i<arr.length;i++){
            if (i+2 < arr.length){
                a = arr[i+2];
                arr[i+2] = arr[i];
                arr[i] = a;
            }}
        a = arr[arr.length-2];
        arr[arr.length-2] = arr[0];
        arr[0] = a;

        a = arr[arr.length-1];
        arr[arr.length-1] = arr[1];
        arr[1] = a;

        System.out.println(Arrays.toString(arr));

    }
}
