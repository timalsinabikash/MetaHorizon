package com.meta.java.functionhw;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner userAge= new Scanner(System.in);
        System.out.println("Enter your age to check");
        int age = userAge.nextInt();
        voter(age);
    }



    public static void voter (int age){
        if (age>=18){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You're not eligible to vote");
        }



    }
}
