package com.meta.java.classandobjectshw;

import java.util.Scanner;

public class Area2Mainb {
    public static void main(String[] args) {
        Scanner userInput= new Scanner(System.in);
        System.out.println("Please enter the length & breadth:");
        Area2 input = new Area2(userInput.nextInt(), userInput.nextInt());
        System.out.println("The area of the rectangle is: "+input.returnArea()+ " cm2");
    }
}
