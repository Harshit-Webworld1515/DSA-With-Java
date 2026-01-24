public class Methodovriding {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();
    }
}
class Anmal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Anmal{
    void eat(){
        System.out.println("eat grass");
    }
}
