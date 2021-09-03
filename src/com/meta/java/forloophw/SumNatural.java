package com.meta.java.forloophw;

public class SumNatural {
    public static void main(String[] args) {

        int sumNatural=0;
        for (int i= 1; i<=10; i++){
            sumNatural=i+sumNatural;
        }
        System.out.println("The total is "+sumNatural);
    }
}