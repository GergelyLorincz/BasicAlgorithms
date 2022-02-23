package algorithm;

import java.util.List;

public class SearchIndex {


    /** Returns the index of the given element in the array */

    public static int searchIndexArray(int[] array, int num) {
        int searchedIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return searchedIndex = i;
            }
        }
        return -1;
    }

    /** Returns the index of the given element in the list */

    public static int searchIndexList(List<Integer> list, int num) {
        int searchIndex = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                return searchIndex = i;
            }
        }
        return -1;
    }
}
