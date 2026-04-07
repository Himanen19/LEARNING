package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

 readUi();

    }

public static void readUi(){

    Scanner myscanner = new Scanner(System.in);
    double maxNumber = 0;
    double minNumber = 0;
    while (true) {

        try {
            System.out.println("Type a Number or a invalid character to quit");
            double currentNumber = Double.parseDouble(myscanner.nextLine());
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        } catch (Exception e) {
            System.out.println("Finishing the program:");

            throw new RuntimeException(e);
            break;
        }

    }
    System.out.println("The max typed number is " + maxNumber + " and the min typed is " + minNumber);

}
}