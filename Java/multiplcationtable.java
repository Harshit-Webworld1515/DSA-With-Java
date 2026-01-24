import java.util.*;
public class multiplcationtable {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int i=1;
        int table=0;
        int num=sc.nextInt();
        while (i<=10) {
            table=num*i;
            i++;
            System.out.println(table);
        }

    }
}
