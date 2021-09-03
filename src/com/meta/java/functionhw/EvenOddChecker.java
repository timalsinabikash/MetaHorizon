package com.meta.java.functionhw;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to check");
        int input=sc.nextInt();
        if (isEven(input)){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is not even");
        }

    }



    public static boolean isEven(int parameter){
        if (parameter%2==0){
            return true;
        } else {
            return false;
        }
    }
}
