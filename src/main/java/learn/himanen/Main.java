package learn.himanen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Burgers myBurger = new Burgers(100, "Chedder supreme");
//        Drinks coca = new Drinks();
//        Fries fry = new Fries();
//        Meal myMeal = new Meal();
//        myMeal.orderMeal("x-supreme", true, true, true);
////       myBurger.makeBurger("Chedder Supreme", true, true, false);
//
////       myBurger.deluxeBurger(true, true);


        int[] randomArr = randomGen(4);
//
//        for (int i = 0; i < randomArr.length; i++) {
//                int randomN = (int) (Math.random() * 100);
//
//            randomArr[i] = randomN;
//        }
        System.out.println(Arrays.toString(randomArr));
        Arrays.sort(randomArr);
        int[] desArr = new int[randomArr.length];
        for (int i = 0; i < randomArr.length; i++) {

            desArr[i] = randomArr[(randomArr.length - 1) - i];

        }

        System.out.println(Arrays.toString(randomArr));
        System.out.println(Arrays.toString(desArr));
    }

    public static int[] randomGen(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            int randomN = (int) (Math.random() * 10000);

            arr[i] = randomN;
        }
        return arr;
    }


}

