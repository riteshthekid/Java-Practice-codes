import java.util.HashSet;

public class dublicatevalue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 2, 3, 14, 15};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])) {
                System.out.println("Duplicate value found: " + arr[i]);
            }
            else {
                set.add(arr[i]);
            }
        }
        System.out.println("Unique values: " + set);
    }
}
