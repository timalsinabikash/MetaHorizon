package com.meta.java.forloophw;

import java.util.Scanner;

public class PowerRaiser {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the base number:");
        int firstNum = userInput.nextInt();

        System.out.println("Please enter the power number:");
        int secondNum= userInput.nextInt();

        int raisedNum= 1;


        for (int j = secondNum; j>0; j--) {

            raisedNum= raisedNum* firstNum;

        }
        System.out.println("The answer is " + raisedNum);

    }
}
