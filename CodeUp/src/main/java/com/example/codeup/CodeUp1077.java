package com.example.codeup;

import java.util.Scanner;

public class CodeUp1077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int printNum = 0;

        while(printNum <= num){
            System.out.println(printNum++);
        }
        sc.close();
    }
}
