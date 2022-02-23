package algorithm;

import java.util.List;

public class Sum {


    /** Sums the values of an array */

    public static int sumArray(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        return sum;
    }


    /** Sums the values of a list */

    public static int sumList(List<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += i;
        }
        return sum;
    }
}
