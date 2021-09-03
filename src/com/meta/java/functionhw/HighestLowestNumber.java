package com.meta.java.functionhw;

import java.util.Scanner;

public class HighestLowestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the 1st number:");
        int userInput = input.nextInt();

        System.out.println("Please enter the 2nd number:");
        int userInput2 = input.nextInt();

        System.out.println("Please enter the 3rd number:");
        int userInput3 = input.nextInt();
        averageNumber(userInput, userInput2, userInput3);


    }


    public static void averageNumber(int num1, int num2, int num3) {

        if (num1 > num2 && num1 > num3) {
            System.out.println("The highest Number is:" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The highest Number is:" + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The highest Number is:" + num3);
        }


        if (num1 < num2 && num1 < num3) {
            System.out.println("The lowest Number is:" + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("The lowest Number is:" + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("The lowest Number is:" + num3);
        }



    }
}
