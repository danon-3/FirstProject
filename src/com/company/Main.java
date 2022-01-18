package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] numbers = scan.nextLine().split(" ");
        String[] num2 = new String[numbers.length];
        int m = 0;
        for(int i = 0; i < numbers.length; i++){
            if(!numbers[i].equals("0")){
                num2[m] = numbers[i];
                m = m + 1;
            }
        }
        for (int i = m; i < numbers.length; i++){
            num2[m] = "0";
            m = m + 1;
        }

        System.out.println(Arrays.toString(num2));
    }
    }



