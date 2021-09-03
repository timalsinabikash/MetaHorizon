package com.meta.java.functionhw;

public class PrimeDisplayer {
    public static void main(String[] args) {
        PrimeDisplayer object = new PrimeDisplayer();
        object.primeGenerator();
    }

    public void primeGenerator() {
        int isPrime = 0;

        for (int j = 2; j <= 1000; j++) {
            int check = 0;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    check = j;
                    break;


                }

            }

            if (check == 0) {
                System.out.println(j);
            }

        }

    }
}
