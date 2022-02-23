package algorithm;

import java.util.List;

public class Decision {


    /** Decides whether an item with a specific property is included in the array */

    public static boolean containsArray(int[] array, int num) {

        for (int i = 0; i < array.length; i++) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }


    /** Decides whether an item with a specific property is included in the list */

    public static boolean contiansList(List<Integer> list, int num) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                return true;
            }
        }
        return false;
    }
}
