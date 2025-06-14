import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{name= " + name + ", age=" + age + '}';
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

class SortByAge implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return Integer.compare(a.age, b.age);
    }
}

public class SortingList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ak", 20));
        students.add(new Student("Bc", 22));
        students.add(new Student("Chutiya", 19));

        Collections.sort(students, new SortByName());
        System.out.println("Sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, new SortByAge());
        System.out.println("Sorted by age:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}