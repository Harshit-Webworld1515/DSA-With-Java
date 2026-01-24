public class Methodovrlodng{
public static void main(String[] args) {
    Calculater calk=new Calculater();
    System.out.println(calk.sum(7, 8));
    System.out.println(calk.sum((float)1.5,(float)9.5));
    System.out.println(calk.sum(1, 4,5  ));
}
}
class Calculater{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}