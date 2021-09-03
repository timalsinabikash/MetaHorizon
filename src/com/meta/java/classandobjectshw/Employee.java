package com.meta.java.classandobjectshw;

public class Employee {
    String name;
    int yearOfJoining;
    int salary;
    String address;


    public Employee(String name, int yearOfJoining, int salary, String address){
        this.name= name;
        this.yearOfJoining= yearOfJoining;
        this.salary= salary;
        this.address= address;
    }
    public void displayInfo(){
        System.out.println(name+"        "+yearOfJoining + "        "+   address);
    }
}
