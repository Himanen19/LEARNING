package learn.himanen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CreateArrayListWithUserInput {


    private static Scanner scanner = new Scanner(System.in);
    public static void askUser() {

        ArrayList<String> theList = new ArrayList<>();
        boolean flag = true;
        while (flag) {

            String userInput;
            System.out.println("0 to exit\n 1 to add\n 2 to remove\n");
            try {
                int userCommand = scanner.nextInt();
                switch (userCommand) {
                    case 0 -> {
                        System.out.println("System is shuting down");
                        flag = false;
                    }
                    case 1 -> addItems(theList);
                    case 2 -> removeItems(theList);
                    default -> System.out.println("Command not allowed!!!!!");
                }
//                if (userCommand == 0) {
//                    System.out.println("System is shuting down");
//                    flag = false;
//
//                } else if (userCommand == 1) {
//                 addItems(theList);
//
//                } else if (userCommand == 2) {
//                  removeItems(theList);
//                } else {
//                    System.out.println("Command not allowed!!!!!");
//                }
            } catch (Exception e) {
                System.out.println("Type a fucking number mate");
                break;
            }
        }
    }

    private static void addItems(ArrayList<String> groceries) {
        scanner.nextLine();
        System.out.println("Add itens separeted by ,");
        String[] items = scanner.nextLine().split(",");
        for (String item : items) {
            item = item.trim();
            if (groceries.contains(item)) {
                System.out.println("Duplicated itens not allowed");
            } else {
                groceries.add(item);
            }
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries.toString());


    }

    private static void removeItems(ArrayList<String> groceries) {
        scanner.nextLine();
        System.out.println("Remove itens separeted by ,");
        String[] items = scanner.nextLine().split(",");
        for (String item : items) {
            item = item.trim();
            groceries.remove(item);
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries.toString());


    }
}
