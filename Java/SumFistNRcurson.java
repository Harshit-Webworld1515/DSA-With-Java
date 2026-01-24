public class SumFistNRcurson {
    public static int sumofn(int n){
     if (n==1) {
        return 1;
     }
     sumofn(n-1);
     int fn=n+sumofn(n-1);
     return fn;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("sum of first n number is:["+sumofn(n)+"]");
    }
}
