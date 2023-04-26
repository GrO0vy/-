package com.example.codeup;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        while(true){
            char letter = (char)isr.read();
            if(letter ==' ') continue;
            System.out.println(letter);
            if(letter =='q') break;
        }
    }
}
