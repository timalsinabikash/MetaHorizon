package com.meta.java.functionhw;


//WAP that displays all the numbers from range void display(int start , int end)
//WAP that displays all the odd numbers from range void displayOddNumbers(int start , int end)
public class StartEnd {


         public static void main(String[] args) {
             int[] array=new int[]{1,2,3,4,5,6,8};
             System.out.println(solution(array,9));
         }

        public static boolean solution(int[] Array, int K) {
            boolean result= false;
            for (int i = 0; i < Array.length; i++) {
           /* if (A[i] + 1 < A[i + 1]) {
                return false;
            }*/
                if (Array[i] == K) {

                    result= true;
                    break;

                }
            }


           return result;
        }
    }





