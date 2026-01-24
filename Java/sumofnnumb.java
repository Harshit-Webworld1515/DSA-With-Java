import java.util.*;
public class sumofnnumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int i=1;
        while (n>=i) {
            sum+=i;
         i++;
        }
        System.out.println("sum is:"+sum);
    }
}
