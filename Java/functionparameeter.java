import java.util.*;
public class functionparameeter {
 public static void printhelloworld() {
    System.out.println("hello world");
    System.out.println("hello world");
 }
 public static void calculatesum() {
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println("sum is:"+sum);
 }   
 public static void main(String[] args) {
    calculatesum();
 }
}
