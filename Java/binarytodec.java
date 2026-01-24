import java.util.*;
public class binarytodec {
    public static void bintodec(int binnum){
        int mynum=binnum;
        int pow=0;
        int decnum=0;
        while (binnum>0) {
            int last=binnum%10;
            decnum=decnum+(last*(int)Math.pow(2, pow));
            pow++;
            binnum=binnum/10;
            
        }
        System.out.println("decimalof"+mynum+" ="+decnum);

    }
    public static void main(String[] args) {
        bintodec(101);
    }
}
