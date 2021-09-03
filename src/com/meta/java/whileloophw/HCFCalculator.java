package com.meta.java.whileloophw;

import java.util.Scanner;

public class HCFCalculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a first number:");
        int firstNum= input.nextInt();

        System.out.println("Please enter a second number");
        int secondNum= input.nextInt();
        int hcfNum=0;
        while (secondNum>0)
        {
            hcfNum = secondNum;
            secondNum = firstNum% secondNum;
            firstNum = hcfNum;
        }
        System.out.println("The HCF is: " + hcfNum);


    }
}
