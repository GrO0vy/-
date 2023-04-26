package com.example.codeup;

import java.util.Scanner;

public class CodeUp1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count =1;
        int result = 0;

        while(true){
            result = result + count;
            if(result >= num){
                System.out.println(count);
                break;
            }
            count++;
        }
    }
}
