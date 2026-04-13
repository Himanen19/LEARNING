package learn.himanen;

import java.util.Arrays;
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

}
