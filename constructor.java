class student {
    String name = "AK";
    int age = 15;

    student(){
        System.out.println("Hello");
    }

    student(String name){
        this();
        System.out.println(name);
    }
    
    student(String name, int age){
        this("Twilight");
        this.name = name;
        this.age = age;
        System.out.println(name + " " + age);
    }
}

class constructor{
    public static void main(String[] args) {
       // student obj = new student("AJ", 16);
        // student obj1 = new student("AKA", 16);

        // System.out.println(obj.name + " " + obj.age);
    }
}