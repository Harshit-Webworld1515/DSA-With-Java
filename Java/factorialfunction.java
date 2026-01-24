import java.util.*;
public class factorialfunction {
    public static int factorial(int num) {
        int fact=1;
        for (int i = 1; i <=num; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int fact=factorial(num);
        System.out.println("factorial of number"+fact);
    }
}
