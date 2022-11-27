package com.jo.line.number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while (n>0){
            String[] s = sc.nextLine().split(" ");
            for (int i = 0; i < s.length-1; i++) {
               sum = sum+Integer.parseInt(s[i]);
            }
            System.out.println(sum);
        }
    }
}
