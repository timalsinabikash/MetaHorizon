package com.meta.java.classandobjectshw;

import java.util.Scanner;

public class CalculationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation calculation = new Calculation();
        System.out.println("please enter the first Number:");
        calculation.firstNumber= sc.nextInt();
        System.out.println("Please enter the second Number:");
        calculation.secondNumber= sc.nextInt();
        calculation.findSum();
        calculation.findProduct();
        calculation.findDifference();
        calculation.findQuotient();

    }
}
