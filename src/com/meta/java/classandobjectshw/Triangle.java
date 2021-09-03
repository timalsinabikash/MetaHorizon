package com.meta.java.classandobjectshw;

public class Triangle {
    int side1;
    int side2;
    int side3;
    public Triangle(int side1, int side2, int side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;

    }
    public void display(){
        int area = side2 * side1* side3;
        int perimeter= side1+ side3+ side2;
        System.out.println("Area: "+ area);
        System.out.println("Perimeter:"+perimeter);
    }
}
