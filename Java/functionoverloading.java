public class functionoverloading {//by parameter
    public static int addition(int a,int b){
        return a+b;
    }
    public static int addition(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(addition(6,5));
        System.out.println(addition(8,4,2));
    }
}
