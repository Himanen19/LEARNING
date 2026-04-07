package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// readUi();
        inputThenPrintSumAndAverage();
    }

public static void readUi(){

    Scanner myscanner = new Scanner(System.in);
    double maxNumber = 0;
    double minNumber = 0;
    boolean firstNumber = true;
    while (true) {

        try {
            System.out.println("Type a Number or a invalid character to quit");
            double currentNumber = Double.parseDouble(myscanner.nextLine());
            if (firstNumber) {
                maxNumber = currentNumber;
                minNumber = currentNumber;
                firstNumber = false;
            }
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        } catch (Exception e) {
            System.out.println("Finishing the program:");
            break;
        }

    }
    System.out.println("The max typed number is " + maxNumber + " and the min typed is " + minNumber);

}

    public static void inputThenPrintSumAndAverage() {


        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 0;
        while (true) {

            try {
                System.out.println("type your numbers");
                sum += Integer.parseInt(scanner.nextLine());
                counter++;

            } catch (NumberFormatException e) {


                avg = Math.round((double) sum / counter);
                System.out.println("SUM = " + sum + " AVG = " + avg);
                break;
            }

        }


    }
}

