package org.example;


import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

 readUi();

    }

public static void readUi(){

        Scanner scanner = new Scanner(System.in);
        int total =0;
        int count =0;
       do {
     try {
        System.out.println("Enter Number #" + count);
        total += Integer.parseInt(scanner.nextLine());
        count++;
    } catch (Exception e) {
        System.out.println("type a valid imput");

    }
}while(count < 5);
    System.out.println(total);




}
}