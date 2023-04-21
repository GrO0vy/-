package com.example.codeup;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        for(int i =0; i<word.length(); i++){
            System.out.printf("'%c'\n",word.charAt(i));
        }
    }
}
