package com.meta.java.classtask.class_objects;

import java.util.Scanner;

public class NewProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Houes house1 = new Houes();
    house1.noOfRooms=10;
    house1.height=12;
    house1.location="kavre";
    house1.color="Blue";



    house1.displayHouseDetails();
    }
}
