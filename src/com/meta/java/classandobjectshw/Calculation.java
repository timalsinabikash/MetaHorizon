package com.meta.java.classandobjectshw;

public class Calculation  {
    int firstNumber;
    int secondNumber;




    public  void findSum(){
        System.out.println("Sum: "+ (this.firstNumber+this.secondNumber));
    }
    public  void findProduct(){
        System.out.println("Product: "+ (this.firstNumber*this.secondNumber));
    }
    public  void findQuotient(){
        System.out.println("Quotient: "+ (this.firstNumber/this.secondNumber));
    }
    public  void findDifference(){
        System.out.println("Difference: "+ (this.firstNumber-this.secondNumber));
    }
}
