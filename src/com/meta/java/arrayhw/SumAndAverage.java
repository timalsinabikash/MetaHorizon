package com.meta.java.arrayhw;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {

        int numbers = 0;
        int sum = 0;
        int average = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the size of an array: ");
        int sizeArray = userInput.nextInt();
        int array[] = new int[sizeArray];
        if (sizeArray >= 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Please enter a number to insert:");
                numbers = userInput.nextInt();
                array[i] = numbers;
                sum = sum + numbers;
            }
            average = sum / array.length;

            System.out.println("The sum of input number/s is: "+sum);
            System.out.println("The average of input number/s is: "+average);
        }

    }
}
