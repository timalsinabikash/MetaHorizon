package com.meta.java.forloophw;

import java.util.Scanner;

public class EvenOddSummer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        int firstNum= input.nextInt();

        System.out.println("Please enter the last number:");
        int secondNum= input.nextInt();
        int sumEven=0 ,sumOdd =0;

        for ( int i =firstNum; i<=secondNum; i++){
            if ( i%2==0){
                sumEven =sumEven+ i;
            }
            else {
                sumOdd=sumOdd+i;
            }
        }
        System.out.println("The sum of even numbers from "+firstNum+" to "+secondNum+" is: "+sumEven);
        System.out.println("The sum of odd numbers from "+firstNum+" to "+secondNum+" is: "+sumOdd);


    }
}
