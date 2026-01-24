public class HybridInheritance {
    public static void main(String[] args) {
        Bird jimy = new Bird();
        jimy.breathe();
        
        Dog jery = new Dog();
        jery.eats();
        jery.walk();
    }
}

class AnimalOrder {
    String color;

    void eats() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathing");
    }
}

class Mammal extends AnimalOrder {
    void walk() {
        System.out.println("walks");
    }
}

class Fish extends AnimalOrder {
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends AnimalOrder { // Changed from Animal to AnimalOrder
    void fly() {
        System.out.println("flies");
    }
}

class Peacock extends Bird {
    void dance() {
        System.out.println("ram ram ji");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("bhau-bhau");
    }
}

class Cat extends Mammal {
    void drink() {
        System.out.println("milk");
    }
}
