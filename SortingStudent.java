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

class SortByAgeThenName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        int ageCompare = Integer.compare(a.age, b.age);
        if (ageCompare != 0) {
            return ageCompare;
        }
        return a.name.compareTo(b.name);
    }
}

class SortingStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ak", 20));
        students.add(new Student("Bc", 22));
        students.add(new Student("Chutiya", 19));
        students.add(new Student("Bsdk", 20));
        students.add(new Student("Babu", 22));
        students.add(new Student("Baby", 19));

        Collections.sort(students, new SortByAgeThenName());
        System.out.println("Sorted by age, then by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}