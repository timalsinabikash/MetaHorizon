package com.meta.java.classandobjectshw;

public class StudentMain {
    public static void main(String[] args) {
        Student student1= new Student();
        Student student2= new Student();
        student1.name= "Sam";
        student1.roll_no= 2;
        student1.phoneNum=1234567891;
        student1.address="Kathmandu";
        student2.name="John";
        student2.roll_no=3;
        student2.phoneNum=1234567893;
        student2.address="Pokhara";



        System.out.println("Name: "+student1.name);
        System.out.println("Roll no:"+student1.roll_no);
        System.out.println("Phone Number:"+student1.phoneNum);
        System.out.println("Address: "+student1.address);
        System.out.println("----------------");
        System.out.println("Name: "+student2.name);
        System.out.println("Roll no:"+student2.roll_no);
        System.out.println("Phone Number:"+student2.phoneNum);
        System.out.println("Address: "+student2.address);


    }


}
