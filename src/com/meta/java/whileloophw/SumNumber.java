package com.meta.java.whileloophw;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        String answer = "y";

        while (answer.equals("y")){

            System.out.println("Please enter the first number:");
            int firstNum= input.nextInt();

            System.out.println("Please enter a second number");
            int secondNum= input.nextInt();

         int   sumNum= firstNum+ secondNum;
            System.out.println("The total is "+ sumNum);
            System.out.println("Do you want to run the program again? (y/n )");
            answer = input.next();
        }


    }
}
