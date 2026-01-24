import java.util.*;
public class infiniteloop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int range=sc.nextInt();
        int num=1;
        while(num<range){
            System.out.println(num+" ");
           num++ ;
        }
    }
}
