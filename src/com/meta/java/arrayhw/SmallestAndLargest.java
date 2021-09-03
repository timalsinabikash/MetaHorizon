package com.meta.java.arrayhw;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {

        int largestNum=0;

        int number=0;

        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i< array.length; i++) {

            System.out.println("Please enter the number:");
            number = sc.nextInt();
            array[i]=number;


        }
        // Largest=6
        // 1 5 2 6 3
        for (int j = 0; j<array.length;j++){
            if (largestNum<array[j]){
                largestNum= array[j];
            }

        }

        int smallestNum=array[0];
        for (int i =0; i<array.length;i++){
            if (smallestNum>array[i]){
                smallestNum= array[i];
            }

        }




        System.out.println("The greatest Num is:" +largestNum);
        System.out.println("The smallest num is:"+smallestNum);
    }
}
