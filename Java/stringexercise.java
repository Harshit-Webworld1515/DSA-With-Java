import java.util.*;
public class stringexercise {
    public static int vowelscount(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if ( ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        System.out.println(vowelscount(str));
    }
}
