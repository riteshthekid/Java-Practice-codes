import java.util.ArrayList; 
import java.util.Collections;

class ArrayListSort {
    public static void main(String[] args) {
        int [] numbers = {3, -1, 6, 2, -5, -4, 7, 0};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        System.out.println("List before sorting: " + list);
        Collections.sort(list);
        System.out.println("List after sorting: " + list);
        System.out.println("List size: " + list.size());
    }
}
