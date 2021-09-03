package com.meta.java.functionhw;

import java.util.Scanner;

public class CircumRadiusCalc {

    public static void main(String[] args) {
        CircumRadiusCalc result = new CircumRadiusCalc();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the radius");
        int radius = userInput.nextInt();
        result.calculator(radius);


    }




    public void calculator (int r){
        double area=  3.14 * (r*r);
        double circumference = 2* 3.14*r;
        System.out.println("The area of the circle is: "+area+"\nAnd the circumference is: "+ circumference);
    }
}
