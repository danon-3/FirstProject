package com.company;
import java.util.Scanner;


public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = 1;
        while(n != 0){
            m = m * n;
            n = n - 1;
        }
        System.out.println(m);
    }
}
