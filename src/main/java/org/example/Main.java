package org.example;


import java.security.PublicKey;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
int counter =5;
int counterEven = 0;
int counterOdd = 0;
      while ( counter < 20) {


          if( isEvenNumber(counter) ) {
              System.out.println(counter + " its even.");
              counterEven++;
          }
          else {
              counterOdd++;
          }

           counter++;
          if (counterEven == 50) {
              break;
          }
      }
        System.out.println(counter + " counter and there is a total of " + counterEven + " even numbers and " + counterOdd + " odd numbers");
    }

    public static int finalGrade(int exam, int projects){

        if(exam > 90 || projects > 10) {
            return 100;
        }
        else if (exam > 75 && projects >=  5) {
            return 90;
        }
        else if (exam > 50 && projects>= 2 ){
            return 75;
        }
        else {
        return    0;
        }

    }

    public static int sumOfDifferences(int[] arr) {


     int max = arr[0];
     int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max){
                max = arr[i];
            }
            if ( arr[i] < min ) {
                min = arr[i];
            }

        }
        return max - min;
    }
    public static boolean isOdd (int number ) {
        if (number <= 0) {
            return false;
        }
       return number % 2 != 0 ;

    }

    public static int sumOdd(int start, int end ) {
        int total =0;
        if ( end < start || end < 0 || start < 3) {
            return -1;
        }
         for (int i = start; i <= end ; i++) {
              if (  isOdd(i) ) {
                  total += i;
              }

         }
         return total;
    }
public static boolean isPrime(int wholeNumber ) {
        if(wholeNumber<= 2  ){
            return wholeNumber ==2;

        }
    for (int i = 2; i < wholeNumber /2 ; i++) {
       if (wholeNumber % i ==0) {
           return false;
       }

    }
    return true;
}



public static boolean isEvenNumber ( int number) {
         return number % 2 == 0 ;

}


}


