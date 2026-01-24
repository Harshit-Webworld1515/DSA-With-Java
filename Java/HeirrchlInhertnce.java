public class HeirrchlInhertnce {
    public static void main(String[] args) {
     Bird kappu =new Bird();
     kappu.breathe();   
    }
}
class Animal{
   String color;
   void eat(){
    System.out.println("eats");
   } 
   void breathe(){
        System.out.println("breathing");
 }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}