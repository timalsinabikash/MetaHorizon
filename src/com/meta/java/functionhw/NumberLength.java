package com.meta.java.functionhw;

import java.util.Scanner;

public class NumberLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check length:");
        int input = sc.nextInt();
        numberChecker(input);


    }


    public static void numberChecker(int inputNumber){
        int length =0;
       // for (i=0)
        if(inputNumber>0) {
            int length2 = inputNumber / 10;
            length=+1;
            System.out.println(length2);
        }

        if (inputNumber/10==0){
            length++;
        }

        System.out.println(length);


    }
}
