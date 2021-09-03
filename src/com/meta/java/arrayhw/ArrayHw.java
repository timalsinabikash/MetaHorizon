package com.meta.java.arrayhw;

import java.util.Scanner;

public class ArrayHw {
    public static void main(String[] args) {
        int array[] = new int[10];
        Scanner sc = new Scanner(System.in);

       for (int i=0; i< array.length; i++) {

           System.out.println("Please enter the number:");
           int number = sc.nextInt();
           array[i]=number;

       }
       for (int i= 0;i< array.length; i++){
           System.out.print (array[i]+" ");
       }

    }

}
