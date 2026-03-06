// Day10 Inheritance
class Animal {

    String name = "Bull";

    void eat(){
        System.out.println(name + " eats food");
    }
}

class Dog extends Animal {

    void bark(){
        System.out.println("Bow Bow");
    }
}

public class Day10 {
    public static void main(String[] args){

        Dog d = new Dog();

        System.out.println(d.name); // inherited property
        d.eat();                    // inherited method
        d.bark();                   // own method
    }
}