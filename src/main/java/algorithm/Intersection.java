package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Intersection {


    /** Returns the intersection of two arrays. In other words, the common elements of the two arrays */

    public static int[] intersectionArray(int[] array1, int[] array2) {

        int counter = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    counter++;
                }
            }
        }

        int[] intersection = new int[counter];
        int id = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    intersection[id] = array2[j];
                    id++;
                }
            }
        }
        return intersection;
    }


    /** Returns the intersection of two lists. In other words, the common elements of the two lists */

    public static List<Integer> intersectionList(List<Integer> list1, List<Integer> list2) {

        List<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    intersection.add(list2.get(j));
                }
            }
        }
        return intersection;
    }
}
