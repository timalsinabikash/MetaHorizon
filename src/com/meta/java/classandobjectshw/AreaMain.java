package com.meta.java.classandobjectshw;

import java.util.Scanner;

public class AreaMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area area= new Area();
        System.out.println("Please enter the length: ");
        area.length= sc.nextInt();
        System.out.println("Please enter the breadth: ");
        area.breadth= sc.nextInt();
        area.setDim(area.length, area.breadth);
        System.out.println(area.getArea());

    }
}
