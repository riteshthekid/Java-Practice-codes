class Employee{
    void work(){
        System.out.println("working");
    }
}

class Manager extends Employee{
    void attendMeeting(){
        System.out.println("attending meeting");
    }
}

class Main{
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();
        m.attendMeeting();
    }
}