package com.meta.java.whileloophw;

import java.util.Scanner;

public class LargestSmallestNumberes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number:");
        int userInput= input.nextInt();

        String answer = "y";
        int greatestNum=0, smallestNum=0;

        while (answer.equals("y")){



            System.out.println("Please enter the number:");
            int userInput1 = input.nextInt();


            if (userInput>userInput1) {
                greatestNum = userInput;
            }
            else if (userInput<userInput1){
                smallestNum = userInput;
            }

            System.out.println("Do you want to enter more numbers? (y/n )");
            answer = input.next();


        }

        System.out.println("gn"+greatestNum);
        System.out.println("sn"+smallestNum);
    }
}

