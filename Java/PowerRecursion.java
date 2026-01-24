public class PowerRecursion {
    public static int power(int x,int n){
        if (n==0) {
            return 1;
        }
        power(x, n-1);
        int fn=x*power(x, n-1);
        return fn;
        //return x*power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
