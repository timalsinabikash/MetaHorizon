package com.meta.java.classandobjectshw;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1= new Employee("Robert", 1994,10000 ,"64C WallsStreat");
        Employee employee2= new Employee("Sam", 2000,50000 ,"68D WallsStreat");
        Employee employee3= new Employee("John", 1999, 25000,"26B WallsStreat");
        System.out.println("Name   "+" Year of joining "+"   Address");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }


}

