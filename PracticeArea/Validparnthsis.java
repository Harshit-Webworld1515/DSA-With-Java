package PracticeArea;
import java.util.Stack;
public class Validparnthsis {
    public static boolean isValid(String str){
        Stack<Character>s=new Stack<>();
        String open="({[";
        // String close=")}]";
        for (int i = 0; i < str.length(); i++) {
            if (open.contains(String.valueOf(str.charAt(i)))){
                s.push(str.charAt(i));
            }else{
                s.pop();
            }
        }
        if (s.empty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="({[]}())";
        System.out.println(isValid(str));
    }
}
