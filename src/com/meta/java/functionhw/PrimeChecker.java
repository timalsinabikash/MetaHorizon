package com.meta.java.functionhw;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an positive integer: ");
        int userInput= input.nextInt();

        if(checkPrime(userInput)){
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }


    public static boolean checkPrime(int testNumber){
        boolean isPrime= true;


            for (int i = 2; i< testNumber;i++) {
                if (testNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            return isPrime;


    }
}
