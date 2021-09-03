package com.meta.java.nestedloop;

public class DesignPrinter {
     public static void main(String[] args) {

          for (int i=1; i<=4; i++ ){
              for (int j = 1; j<=10; j++){
                  System.out.print("* ");
              }
              System.out.println(" ");
          }
         System.out.println(" ");
         System.out.println("-------------------");
         System.out.println(" ");
         for (int i=1; i<=5; i++ ){
             for (int j = 1; j<=i; j++){
                 System.out.print("* ");
             }
             System.out.println(" ");
         }

         System.out.println(" ");
         System.out.println("-------------------");
         System.out.println(" ");



         for (int i=1; i<=5; i++ ){
             for (int k= 4; k>=i; k--)
             {
                 System.out.print(" ");
             }
             for (int j = 1; j<=i; j++){

                 System.out.print("* ");
             }

             System.out.println(" ");
         }


         System.out.println(" ");
         System.out.println("-------------------");
         System.out.println(" ");


         for (int i=1; i<=11; i++ ){
             for (int k= 10; k>=i; k--)
             {
                 if(k%2==0) {
                     System.out.print(" ");
                 }
             }
             for (int j = 1; j<=i; j++){

                 if(i%2!=0) {

                     System.out.print("*");
                 }
             }
             System.out.println(" ");
         }


         System.out.println(" ");
         System.out.println("-------------------");
         System.out.println(" ");


         for (int i=1; i<=5; i++ ){

             for (int j = 1; j<=i; j++){


                     System.out.print(i);

             }
             System.out.println(" ");
         }

         System.out.println(" ");
         System.out.println("-------------------");
         System.out.println(" ");





    }
}
