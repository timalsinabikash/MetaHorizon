package com.meta.java.classandobjectshw;

public class Average {
    int num1;
    int num2;
    int num3;


    public Average (int n1, int n2, int n3){
        this.num1=n1;
        this.num2=n2;
        this.num3=n3;
    }

    public void displayInfo(){
        int average= (num1+num2+num3)/3;
        System.out.println("The average is: "+ average);
    }
}
