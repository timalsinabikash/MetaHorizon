package com.meta.java.functionhw;

import java.util.Scanner;

public class MultiplyMethod {

    public static void main(String[] args) {
        MultiplyMethod result = new MultiplyMethod();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int firstInput = userInput.nextInt();
        int secondInput = userInput.nextInt();

        int product = result.multiplication(firstInput,secondInput)        ;
        System.out.println("The product of entered numbers are:"+ product);
    }


    public int multiplication(int a, int b){


        int product = a * b;
        return product;

    }
}
