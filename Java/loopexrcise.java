import java.util.*;
public class loopexrcise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int choice;
        int num;
        int evensum=0;
        int oddsum=0;
        do {
            System.out.println("enter your num:");
            num=sc.nextInt();
            if (num%2==0) {
                evensum += num;
            } else {
                 oddsum += num;
            }
            System.out.println("do you want to continue for yes press 1 for no 2");
            choice=sc.nextInt();
        } while (choice==1);
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}
