public class Interfaceeg {
    public static void main(String[] args) {
        Bear jama=new Bear();
        jama.eat();
       jama.eats();
    }
}
interface Harbivores{
    void eat();
}
interface Carnivores{
    void eats();
    
}
class Bear implements Harbivores,Carnivores{
    public void eat(){
        System.out.println("eat grass");
        System.out.println("eat chicken");
    }
    public void eats(){
       System.out.println("eat meat");
    }
}

