public class intro_oops {
    public static void main(String[] args) {
        Pencil p1=new Pencil();
            p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tipsize);
        p1.color="yellow";
        System.out.println(p1.color);
    }
}
 class Pencil{
     String color;
     int tipsize;
    void setcolor(String newcolor){
        color=newcolor;
    }
    void settip(int newtipsize){
        tipsize=newtipsize;
    }
}
