package com.meta.java.functionhw;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int input1= sc.nextInt();
        System.out.println("Enter the ending number");
        int input2= sc.nextInt();
        displayOddNumbers(input1,input2);

    }

    public static void displayOddNumbers(int start, int end){

        for (int i = start; i<=end; i++){

            if (i%2!=0){
                System.out.println(i+" ");
            }
        }

    }
}
