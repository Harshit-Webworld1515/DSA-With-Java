public class multiplyfunction {
    public static int multiply(int num1,int num2){
        int prod=num1*num2;
        return prod;
    }
    public static void main(String[] args) {
        int a=6;
        int b=7;
        int prod=multiply(a, b);
        System.out.println("the multiplication ofa&b is:"+prod);
        prod =multiply(32,4);
        System.out.println(prod);
    }
}
