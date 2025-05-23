import java.util.ArrayList;

class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add(1, "cherry");
        list.add("date");
        list.add("elderberry");
        list.add("fig");
        list.add("grape");
        
        System.out.println("List size: " + list.size()); 
        System.out.println("List contents: " + list);
        System.out.println("Element at index 2: " + list.get(2)); 
        System.out.println("Index of 'date': " + list.indexOf("date")); 
        System.out.println("Last index of 'fig': " + list.lastIndexOf("fig"));
        System.out.println("Is 'banana' in the list? " + list.contains("banana")); 
        System.out.println("Is 'kiwi' in the list? " + list.contains("kiwi")); 
        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("Removing 'banana' from the list: " + list.remove("banana"));
        System.out.println("List after removing 'banana': " + list);
        System.out.println("Removing element at index 3: " + list.remove(3));

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}