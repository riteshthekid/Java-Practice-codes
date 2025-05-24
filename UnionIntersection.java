import java.util.HashSet;
import java.util.Set;

class UnionIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        Set<Integer> unionSet = new HashSet<>();
        for (int num : arr1) {
            unionSet.add(num);
        }
        for (int num : arr2) {
            unionSet.add(num);
        }

        Set<Integer> intersectionSet = new HashSet<>();
        Set<Integer> tempSet = new HashSet<>();
        for (int num : arr1) tempSet.add(num);
        for (int num : arr2) {
            if (tempSet.contains(num)) {
                intersectionSet.add(num);
            }
        }

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);
    }
}