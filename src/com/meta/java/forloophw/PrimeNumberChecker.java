package com.meta.java.forloophw;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an positive integer: ");
        int userInput= input.nextInt();
        boolean isPrime= true;
            for (int i = 2; i< userInput;i++){
                if (userInput%i==0){
                isPrime=false;
                break;
                }
            }

            if (isPrime==true){
                System.out.println(userInput+" is prime");

            }
            else {
                System.out.println(userInput+" is not prime");
            }


    }
}
