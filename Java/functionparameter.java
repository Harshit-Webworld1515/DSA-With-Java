import java.util.*;
public class functionparameter {
 public static void printhelloworld() {
    System.out.println("hello world");
    System.out.println("hello world");
 }
 public static int calculatesum(int num1,int num2){//num1 and num2 are formal parameter
    int sum=num1+num2;
    return sum;
 }   
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=calculatesum(a,b);//a,b are argument or actual parameter
    System.out.println("sum is:"+sum);
 }
}

