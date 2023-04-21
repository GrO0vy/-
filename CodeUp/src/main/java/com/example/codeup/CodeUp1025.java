package com.example.codeup;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=4; i>=0; i--){
            System.out.printf("[%d]\n",(num/(int)Math.pow(10,i)) * (int)Math.pow(10,i));
            num = num - (num/(int)Math.pow(10,i)) * (int)Math.pow(10,i);
        }
    }
}
