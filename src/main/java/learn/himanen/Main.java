package learn.himanen;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        LinkedList<Place> thePlaceList = new LinkedList<>();

        Place japan = new Place("Japan", 7000);


        addPlace(thePlaceList, japan);
        System.out.println(thePlaceList);

    }

    public static void addPlace(LinkedList<Place> list, Place place) {

        scanner.nextLine();
        System.out.println("Type the itens to add separated by ,");
        String[] itensToAdd = scanner.nextLine().split(",");
        for (int i = 0; i < itensToAdd.length; i++) {

            if (list.contains(place)) {
                System.out.println("Duplicated entry");
                return;
            }
            list.add(place);
        }

    }

    record Place(String name, int distance) {
    }


//    public static int[] randomGen(int length) {
//        int[] arr = new int[length];
//        for (int i = 0; i < arr.length; i++) {
//            int randomN = (int) (Math.random() * 10000);
//
//            arr[i] = randomN;
//        }
//        return arr;
//    }




}




