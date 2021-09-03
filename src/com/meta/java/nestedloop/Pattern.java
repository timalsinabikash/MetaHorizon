package com.meta.java.nestedloop;

public class Pattern {
    public static void main(String[] args) {
        for (int z = 1; z<=5; z++){
            for (int j = z; j<5; j++) {
                System.out.print(" ");
            }
            for (int k =1; k<=z; k++ ){
                System.out.print(k);

            }
            for (int l=z; l>1; l--){
                System.out.print(l-1);

            }
            System.out.println(" ");
        }
    }
}
