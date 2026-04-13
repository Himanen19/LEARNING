package learn.himanen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortedArray {


    public static int[] getIntegers(int length) {
        Scanner scanner = new Scanner(System.in);
        int resultArr[] = new int[length];
        for (int i = 0; i < length; i++) {
            resultArr[i] = scanner.nextInt();

        }

        return resultArr;
    }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element %d contents %d", i, arr[i]);
        }


    }

    public static int[] sortIntegers(int[] arr) {
        Arrays.sort(arr);
        int[] desArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            desArr[(arr.length - 1) - i] = arr[i];
        }

        return desArr;
    }

    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }

    private static int[] readElements(int ele) {
        int[] finalResult = new int[ele];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < ele; i++) {
            finalResult[i] = scanner.nextInt();
        }


        return finalResult;
    }

    private static int findMin(int[] arr) {

        Arrays.sort(arr);
        int minValue = arr[0];

        Integer[] b = {1, 2, 3, 4};
        ArrayList<Integer> a = new ArrayList<>(List.of(b));

        Test test = new Test();
        return minValue;


    }

    private static void reverse(int[] array) {

        int[] reversedArray = new int[array.length];
        System.out.printf("Array = %s", Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - 1 - i] = array[i];


        }
        System.out.printf("Reversed array = %s", Arrays.toString(reversedArray));


    }

    record Test(String name, int num, boolean t) {

        Test() {
            this("jao", 3, true);
        }
    }


}

