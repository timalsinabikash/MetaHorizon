package com.meta.java.forloophw;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an positive integer:");
        int posInteger = input.nextInt();

        for (int i = 1; i<=10;i++ ){
            int multiplicationTable =posInteger*i;
            System.out.println(posInteger +" * "+ i + " = "+multiplicationTable);
        }
    }
}