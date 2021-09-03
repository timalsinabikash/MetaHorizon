package com.meta.java.functionhw;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an positive integer:");
        int posInteger = input.nextInt();
        printMultiplication(posInteger);
    }


    public static void printMultiplication(int inputnumber){

        for (int i = 1; i<=10;i++ ){
            int multiplicationTable =inputnumber*i;
            System.out.println(inputnumber +" * "+ i + " = "+multiplicationTable);
        }
    }
}
