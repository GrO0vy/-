package com.example.codeup;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        int letter = isr.read();
        char start = 'a';

       while((int)start<=letter) {
           System.out.println((char)start);
           start++;
       }
    }
}
