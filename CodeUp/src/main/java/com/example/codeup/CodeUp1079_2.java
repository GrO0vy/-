package com.example.codeup;

import java.util.Scanner;

public class CodeUp1079_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            char letter = sc.next().charAt(0);
            System.out.println(letter);
            if(letter == 'q') break;
        }

        sc.close();
    }
}
