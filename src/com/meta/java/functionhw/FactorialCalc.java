package com.meta.java.functionhw;

import java.util.Scanner;

public class FactorialCalc {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the number to get the factorial of: ");
        int factorialNum= userInput.nextInt();
        getFactorial(factorialNum);
    }



    public static void getFactorial(int number){
        int totalFactorial= 1;
        for (int i = number; i>=1; i--){
            System.out.print(i);
            totalFactorial= totalFactorial *i;
            if(i!=1) {
                System.out.print(" * ");
            }
        }
        System.out.println(" = " + totalFactorial);
    }
}
