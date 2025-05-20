class Animal{
    void makeSound(){
        System.out.println("Animals make sounds");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("barks");
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println("meows");
    }
}

public class Inheritance{
    public static void main(String[] args){
        Animal an = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        an.makeSound();
        d.makeSound();
        c.makeSound();
    }
}
