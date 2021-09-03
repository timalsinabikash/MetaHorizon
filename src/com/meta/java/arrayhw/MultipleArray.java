package com.meta.java.arrayhw;

public class MultipleArray {

    public static void main(String[] args) {



        int[] array = new int[]{1, 2, 3, 43, -67, 843, -5, 6, 3, -4, 35, -75, 7, 85, 67, 9, 45, 76, 87, 100};

        System.out.println("Even Numbers");

        //
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {

                System.out.print(array[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("--------------");
        System.out.println("Odd numbers ");

        //Prints all the odd numbers of an array

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }


        System.out.println(" ");
        System.out.println("--------------");
        System.out.println("Prime numbers");


        //Prints prime numbers of the array
        for (int i = 0; i < array.length; i++) {

            int check = 0;
            if (array[i] > 1) {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        check = array[i];
                        break;
                    }

                }

                if (check == 0) {

                    System.out.print(array[i] + " ");
                }
            }
        }

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println("Negative numbers");

        //Prints all the negative numbers


        int counter=0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                counter++;
                System.out.print(array[i] + " ");
            }

        }


        System.out.println(" ");
        System.out.println("--------------");
        System.out.println("Numbers divisible by 5");

        //Prints all the numbers divisible by 5


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                System.out.print(array[i] + " ");
            }
        }


        System.out.println(" ");
        System.out.println("--------------");
        System.out.println("Largest Element");

        //Prints the largest element from the array


        int largestNum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (largestNum < array[j]) {
                    largestNum = array[j];
                }

            }
        }
        System.out.print(largestNum);

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println("Second Largest element");

        //Prints the second largest element from the array

        int secondlargestNum = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (secondlargestNum < largestNum) {
                }
                secondlargestNum = array[j];

            }
        }
        System.out.print(secondlargestNum);

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println("Sum of all the numbers");

        //Prints the sum of all the numbers

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println("Sum of all the prime numbers");

        //Prints the sum of all the prime numbers

        int primeSum = 0;
        for (int i = 0; i < array.length; i++) {
            int check = 0;
            if (array[i] > 1) {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        check = array[i];
                        break;
                    }

                }

                if (check == 0) {
                    primeSum = primeSum + array[i];
                }

            }
        }
        System.out.println(primeSum);


        System.out.println(" ");
        System.out.println("--------------");
        System.out.println("Negative numbers in different array");

        //Negative numbers in a different array


        int[] negativeArray= new int[counter];


        int indexCount = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                negativeArray[indexCount++] = array[i];
            }
        }
        for(int i=0; i<negativeArray.length; i++){
            System.out.print(negativeArray[i]+" ");
        }

        System.out.println(" ");
        System.out.println("--------------");
        System.out.println("Positive numbers in different array and increment of 10");

        //Negative numbers in a different array


        int positiveCounter=0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > 0) {
            positiveCounter++;
            }
        }

        int [] positiveArray= new int[positiveCounter];
        int indexCounter1=0;

        for (int i= 0; i<array.length;i++){

            if (array[i] > 0) {
               positiveArray[indexCounter1++]=array[i]+10;
            }

        }

        for(int i=0; i<positiveArray.length; i++){
            System.out.print(positiveArray[i]+" ");
        }


    }
    public static void evenNumbers(int[] array){

    }


}
