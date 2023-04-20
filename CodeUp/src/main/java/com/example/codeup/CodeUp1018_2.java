package com.example.codeup;

import java.util.Scanner;

public class CodeUp1018_2 {
    public static void main(String[] args) {
        String[] time = new String[2];
        Scanner sc = new Scanner(System.in);
        time = sc.nextLine().split(":");

        System.out.printf("%s:%s",time[0],time[1]);
        sc.close();
    }
}
