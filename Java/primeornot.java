import java.util.*;
public class primeornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num==2) {
            System.out.println("number is prime"+num);
        } else {
            boolean isprime =true;
            //for (int i = 2; i < num; i++) {
            for(int i=2;i<Math.sqrt(num);i++){
                if (num%i==0){ 
                isprime =false;    
                }
            }            
            if (isprime == true ) {
                System.out.println("num is prime");
            } else {
                System.out.println("num is not prime");
            }
        }
    }
}
