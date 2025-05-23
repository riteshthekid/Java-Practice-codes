import java.util.ArrayList;

public class ArrayListSum {
    public static void main(String[] args) {
        int [] numbers = {3, -1, 6, 2, -5, -4, 7, 0};
        int sum = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of the elements in the list: " + sum);
        System.out.println("List contents: " + list);
        System.out.println("List size: " + list.size());
    }
}
