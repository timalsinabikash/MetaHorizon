package com.meta.java.classandobjectshw;

import java.util.Scanner;

public class AverageMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter three numbers to get an average of: ");
        Average call = new Average(userInput.nextInt(), userInput.nextInt(), userInput.nextInt());
        call.displayInfo();

    }
}
