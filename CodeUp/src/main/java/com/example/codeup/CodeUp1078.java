package com.example.codeup;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;

        for(int i=1; i<=num; i++){
            if(i%2 ==0) result += i;
        }
        System.out.println(result);
        sc.close();
    }
}
