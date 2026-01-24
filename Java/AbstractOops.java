    public class AbstractOops {
    public static void main(String[] args) {
        Horses h =new Horses();
        h.eat();
        h.walk();
        Chickens c=new Chickens();
        c.eat();
        c.walk();
    }
}
abstract class Animal{
    void eat(){
        System.out.println("animal eat");
    }//non abstract function
    abstract void walk();
}
class Horses extends Animal{
    void  walk(){
        System.out.println("walk on 4 leg");
    }
}
class Chickens extends Animal{
void walk(){
    System.out.println("walk on 2 leg");
}
}
