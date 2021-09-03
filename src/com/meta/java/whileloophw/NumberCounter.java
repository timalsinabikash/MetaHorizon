package com.meta.java.whileloophw;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        String answer = "y";
        int firstCounter=0, secondCounter=0, thirdCounter=0;

        while (answer.equals("y")){

            System.out.println("Please enter the number:");
            int userInput= input.nextInt();
                if (userInput==0){
                    firstCounter ++;
                } else if(userInput>0) {
                    secondCounter++;
                  } else {
                    thirdCounter++;
                }

            System.out.println("Do you want to enter more numbers? (y/n )");
            answer = input.next();
        }
        System.out.println("The total number of 0s entered = "+firstCounter);
        System.out.println("The total number of positive integers entered = "+secondCounter);
        System.out.println("The total number of negative integers entered = "+thirdCounter);



    }
}
