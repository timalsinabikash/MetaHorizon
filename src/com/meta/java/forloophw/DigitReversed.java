package com.meta.java.forloophw;

import java.util.Scanner;

public class DigitReversed {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number to reverse:");

        int userInput = input.nextInt();
        int result=0;
        for (; userInput!=0; userInput=userInput/10) {
            int remainder = userInput % 10;
            result= result*10+remainder;


        }
        System.out.print( "The reversed number is "+ result);
    }


}
