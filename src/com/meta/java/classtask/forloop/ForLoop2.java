package com.meta.java.classtask.forloop;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {

        //CLassName ojectName = new ClassConstructor(Parametre...):
        Scanner input = new Scanner(System.in);

        int lowerRange, higherRange;
        System.out.println(
                " Enter the lower range"
        );
        lowerRange = input.nextInt();

        System.out.println("Enter the higher range");
        higherRange= input.nextInt();


        if (higherRange> lowerRange) {
            for ( int i =lowerRange; i<=higherRange; i++){
                System.out.println(i);
            }
        }
        else {
            System.out.println("The higher range must be greater than the lower range");
        }

    }
}
