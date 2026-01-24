import java.util.*;
public class StackReverse {
    public static void pushatBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;            
        }
        int top = s.pop();
        pushatBottom(s, data);
        s.push(top);
    }
    
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushatBottom(s, top);
    }
    
    public static void printStack(Stack<Integer> s) {
        // Create a temporary stack to preserve the original stack
        Stack<Integer> temp = new Stack<>();
        temp.addAll(s);
        
        while (!temp.isEmpty()) {
            System.out.println(temp.pop());
        }
    }
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(3);
        s.push(5);
        
        System.out.println("Original stack:");
        printStack(s);  // Prints from top to bottom (5, 3, 1)
        
        reverseStack(s);
        
        System.out.println("Reversed stack:");
        printStack(s);  // Should print from top to bottom (1, 3, 5)
    }
}