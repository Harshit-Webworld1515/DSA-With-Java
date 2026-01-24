import java.util.*;
public class largestinarray {
    public static int getlargest(int num[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest<num[i]) {
             largest=num[i];   
            }
            if (smallest>num[i]) {
                smallest=num[i];
            }
        }
        System.out.println(smallest);
        return largest;
    }
public static void main(String[] args) {
    int num[]={8,2,6,3,5};
    System.out.println("the largest number is:" +getlargest(num));
}
}
