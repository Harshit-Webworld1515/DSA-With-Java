package PracticeArea;
import java.util.Stack;
public class DecodeStrng {
    public static String decodeString(String str){
        Stack<Character>charSt=new Stack<>();
        Stack<Integer>intSt=new Stack<>();
        String temp="";
        String result="";
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            count=0;
            if (Character.isDigit(str.charAt(i))) {  
                count=0;
                while (Character.isDigit(str.charAt(i))) {
                    count=count*10+str.charAt(i)-'0';
                    i++;
                }
                i--;
                intSt.push(count);
            }
            else if (str.charAt(i)==']') {
                count=0;
                temp="";
                if (!intSt.isEmpty()) {
                    count=intSt.pop();
                }
                while (charSt.peek()!='[') {
                    temp = charSt.pop() + temp;
                }
                charSt.pop();
                result="";
                for (int j = 0; j < count; j++) {
                    result = result + temp; 
                }
                for (int j = 0; j <result.length(); j++) {
                    charSt.push(result.charAt(j));
                }

            }
            else{
                if (str.charAt(i)=='[') {
                    charSt.push(str.charAt(i));
                }else{
                charSt.push(str.charAt(i));
            }
            }
        } 
        result = ""; // 👈 final build ke liye reset kar
        while (!charSt.isEmpty()) {
            result = charSt.pop() + result;
        }     
        return result;
    }  
     public static void main(String args[]) {
        String str = "3[b2[ca]]";
        System.out.println(decodeString(str)); // Output: bcacabcacabcaca
    }     
}

/*
import java.util.Stack;
class Solution {
    static String decode(String str) {
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();
        String temp = "", result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            // Agar digit mila
            if (Character.isDigit(str.charAt(i))) {
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--; // ek step peeche
                integerstack.push(count);
            }

            // Agar closing bracket mila
            else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;

                if (!integerstack.isEmpty()) {
                    count = integerstack.peek();
                    integerstack.pop();
                }

                while (!stringstack.isEmpty() && stringstack.peek() != '[') {
                    temp = stringstack.peek() + temp;
                    stringstack.pop();
                }

                if (!stringstack.empty() && stringstack.peek() == '[')
                    stringstack.pop();

                result = "";
                for (int j = 0; j < count; j++)
                    result = result + temp;

                for (int j = 0; j < result.length(); j++)
                    stringstack.push(result.charAt(j));
            }
            // Agar opening bracket mila
            else if (str.charAt(i) == '[') {
                stringstack.push(str.charAt(i));
            }

            // Normal character
            else {
                stringstack.push(str.charAt(i));
            }
        }

        // Final result nikalo
        while (!stringstack.isEmpty()) {
            result = stringstack.peek() + result;
            stringstack.pop();
        }

        return result;
    }

    public static void main(String args[]) {
        String str = "3[b2[ca]]";
        System.out.println(decode(str)); // Output: bcacabcacabcaca
    }
}

 */