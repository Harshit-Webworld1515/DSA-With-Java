package PracticeArea;
import java.util.*;
public class Stackduplicate {
    public static boolean duplicateBracet(String exp){
        Stack<Character>st=new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            if ((exp.charAt(i)!=')')){
                st.push(exp.charAt(i));
            } else{
                int count=0;
                while (st.peek()!='(') {
                    count++;
                    st.pop();
                }
                st.pop();
                if (count==0) {
                return true;
                }
            }            
        }
        return false;
    }
    public static void main(String[] args) {
        String exp="((a)+(b)+c))";
        System.out.println(duplicateBracet(exp));
    }
}
