package com.meta.java.functionhw;

public class SumMethod {
    public static void main(String[] args) {
        SumMethod result = new SumMethod();
        System.out.println(result.getTotal(23,20));
    }

    public int getTotal(int a, int b){
        int total = a + b;
        return total;
    }
}
