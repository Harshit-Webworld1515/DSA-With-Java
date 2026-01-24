import java.util.*;
public class dectobinary {
    public static void dectobinary(int decnum){
        int mynum=decnum;
        int pow=0;
        int binnum=0;
        while (decnum>0) {
            int reminder= decnum%2;
             binnum=binnum+(reminder*(int)Math.pow(10, pow));
             pow++;
             decnum=decnum/2;
        }
        System.out.println("binary of "+mynum+" is"+binnum);
    }
    public static void main(String[] args) {
        dectobinary(15);
    }
}
