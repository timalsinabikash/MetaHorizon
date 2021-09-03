package com.meta.java.functionhw;

import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the 1st number:");
        int userInput= input.nextInt();

        System.out.println("Please enter the 2nd number:");
        int userInput2= input.nextInt();

        System.out.println("Please enter the 3rd number:");
        int userInput3= input.nextInt();

        System.out.println("The sum is "+ sum(userInput,userInput2,userInput3));
    }



    public static int sum(int num1,int num2, int num3){
        int total = num1+ num2+ num3;
        return total;

    }
}
