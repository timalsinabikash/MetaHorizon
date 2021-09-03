package com.meta.java.functionhw;

import java.util.Scanner;

public class EqualChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a 1st number:");
        int input1 = input.nextInt();
        System.out.println("Please enter a 2nd number:");
        int input2 = input.nextInt();

        System.out.println(isSameNum(input1,input2));

    }


    public static boolean isSameNum(int num1, int num2){
        if (num1==num2){
            return true;
        } else {
            return false;
        }
    }
}
