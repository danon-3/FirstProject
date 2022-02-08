package com.company;

import java.util.Scanner;

public class Task2_8Feb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr0 = scan.nextLine().split(" ");
        String longest = arr0[0];
        int length = 0;

        for (String e: arr0){
            if (e.length() > length){
                length = e.length();
                longest = e;
            }
        }

        System.out.println(longest);

    }
}
