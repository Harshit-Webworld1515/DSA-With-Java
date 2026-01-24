import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("enter the num: ");
        int fact =1;
        int i=1;
        while (num>=i) {
            fact*=i;
            i++;
        }
        System.out.println("the factorial of"+num+"is"+fact);
    }
}
