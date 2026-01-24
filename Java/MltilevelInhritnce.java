public class MltilevelInhritnce {
    public static void main(String[] args) {
        Doggy dhruv=new Doggy();
        dhruv.legs=4;
        System.out.println(dhruv.legs);
        dhruv.eat();
        }
}
class Anymal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Mammals extends Anymal{
    int legs;
}
class Doggy extends Mammals{
    String breed;
}