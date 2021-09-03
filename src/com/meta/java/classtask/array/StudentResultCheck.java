package com.meta.java.classtask.array;

import java.util.Scanner;

public class StudentResultCheck {

    public static void main(String[] args) {
        final int totalSubject = 7;
        Scanner sc = new Scanner(System.in);
        double array[]= new double[7];
        for (int i = 0; i<totalSubject; i++){
            System.out.println("Enter the marks in " +(i+1)+ "subject");
            array[i]= sc.nextDouble();

            if (array[i]<0 || array[i]>100){
                System.out.println("Invalid amrks!! Please enter again");
                i--;
            }
        }


        for (int i = 0; i<totalSubject;i++){
            System.out.println(array[i]);
        }
    }
}
