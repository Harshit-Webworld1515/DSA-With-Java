public class SuperKeyword {

    public static void main(String[] args) {
        Sparrow joe=new Sparrow();
        System.out.println(joe.color);
    }
}
class Birds{
    String color;
    Birds(){
        System.out.println("bird constructor is called");
    }
}
class Sparrow extends Birds{
    Sparrow(){
        super.color="brown";
        System.out.println("sparrow constructor is called");
        // this.color="brown";
    }
}