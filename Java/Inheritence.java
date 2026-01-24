public class Inheritence {
    public static void main(String[] args) {
        Fish shark= new Fish();
        shark.eat();
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
//Derived class
class Fish extends Animal{
    int fin;
    void swim(){
        System.out.println("swim in water");
    }
}
