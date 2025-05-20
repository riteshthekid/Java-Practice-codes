class Person {
    void displayName() {
        System.out.println("person name");
    }
}

class Student extends Person {
    void displayClass() {
        System.out.println("student's class");
    }
}

class Monitor extends Student {
    void checkDiscipline() {
        System.out.println("checking discipline of students");
    }
}

public class data {
    public static void main(String[] args) {
        Monitor mon = new Monitor();
        mon.displayName();
        mon.displayClass();
        mon.checkDiscipline();  
    }
}