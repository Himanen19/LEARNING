package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// readUi();
//        inputThenPrintSumAndAverage();
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
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
        long avg;
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

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || extraBuckets <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double wallArea = width * height;

        return (int) Math.ceil((double) (wallArea - (extraBuckets * areaPerBucket)) / areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double wallArea = width * height;

        return (int) Math.ceil((double) wallArea / areaPerBucket);

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil((double) area / areaPerBucket);

    }




}

