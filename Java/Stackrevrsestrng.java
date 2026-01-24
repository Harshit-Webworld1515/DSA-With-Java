import java.util.*;
public class Stackrevrsestrng {
    public static String reverseString(String str){
        int idx=0;
        Stack<Character>sc=new Stack<>();
        while(idx<str.length()){
            sc.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb=new StringBuilder("");
        while (!sc.isEmpty()) {
            Character result=sc.pop();
            sb.append(result);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="jai maa bhawani";
        System.out.println(reverseString(str));
    }
    
}
