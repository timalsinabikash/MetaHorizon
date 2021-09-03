package com.meta.java.functionhw;

import java.util.Scanner;

public class NumberGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int input1= sc.nextInt();
        System.out.println("Enter the ending number");
        int input2= sc.nextInt();
        display(input1,input2);


    }



    public static void display(int start, int end){
        for (int i = start; i<=end; i++){
            System.out.print(i+ " ");
        }
    }
}
