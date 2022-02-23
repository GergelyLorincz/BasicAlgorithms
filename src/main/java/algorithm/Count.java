package algorithm;

import java.util.List;

public class Count {


    /** Counts the elements of an array that matches a certain criteria.
     * In this case it counts the elements that have even numbers in them */

    public static int countArray(int[] array) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }


    /** Counts the elements of a list that matches a certain criteria.
     * In this case it counts the elements that have even numbers in them */

    public static int countList(List<Integer> list) {
        int counter = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0 && list.get(i) % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
