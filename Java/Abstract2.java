public class Abstract2 {
    public static void main(String[] args) {
        Mustang myhorse=new Mustang();
        //Animal->Horse->Mustang(order of constructor calling)
       Horse h =new Horse();
       // System.out.println( h.color);
        h.changecolor();
    }
}
abstract class Animal{
    String color;
    Animal(){
    color="brown";
    System.out.println("animal constructor is called");
    }
    void eat(){
        System.out.println("animal eat");
    }
    abstract void  walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is called");
    }
        void changecolor(){
            color="dark brown";
            System.out.println(color);
        }
        void walk(){
            System.out.println("walk on 4 leg");
        }
    }
        class Mustang extends Horse{
            Mustang(){
                System.out.println("Mustang constructor called");
            }
        }
    class Chicken extends Animal{
        void changecolor(){
            color="yellow";
        }
        void walk(){
            System.out.println("2 leg");
        }
    }
