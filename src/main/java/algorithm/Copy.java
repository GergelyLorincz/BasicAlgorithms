package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Copy {


    /** Creates a new array from the elements of the original array that match a certain criteria.
     * and modifies them before it places them in to the new array.
     * In this case it counts the elements that have even numbers in them and divides them with 2 */

    public static int[] copyArray(int[] array) {

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                counter++;
            }
        }

        int[] selected = new int[counter];
        int selectedId = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                array[i] = array[i] / 2;
                selected[selectedId] = array[i];
                selectedId++;
            }
        }
        return selected;
    }


    /** Creates a new list from the elements of the original list that match a certain criteria.
     * and modifies them before it places them in to the new list.
     * In this case it counts the elements that have even numbers in them and divides them with 2 */

    public static List<Integer> copyList(List<Integer> list) {

        List<Integer> selected = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0 && list.get(i) % 2 == 0) {
                int num = list.get(i);
                num /= 2;
                selected.add(num);
            }
        }
        return selected;
    }
}
