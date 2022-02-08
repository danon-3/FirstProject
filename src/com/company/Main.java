package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] par = scan.nextLine().split(" ");
        int N = Integer.valueOf(par[0]);
        int D = Integer.valueOf(par[1]);

        String[] arr0 = scan.nextLine().split(" ");
        String[] result = new String[arr0.length];

        for (int i=0; i< arr0.length; i++){
            if (i+D < arr0.length)
                result[i] = arr0[i + D];
            else
                result[i] = arr0[i + D - arr0.length];
        }

        System.out.println(Arrays.toString(result));


    }
}




