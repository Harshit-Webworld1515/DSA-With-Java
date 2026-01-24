public class FibonaciRcursion {
    public static int fibonacci(int n){
        if (n==0||n==1) {
            return n;
        }
       int  f1=fibonacci(n-1);
       int f2=fibonacci(n-2);
        int fn=f1+f2;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonacci(n));
    }
}
