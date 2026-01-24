import java.util.*;
public class continue2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("enter your number:");
            int i=sc.nextInt();
           if (i%10 == 0) {
            continue;
           } 
             System.out.println("number input was"+i);
        } while (true);
    }
}
