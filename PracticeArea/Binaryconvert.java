package PracticeArea;
import java.util.*;
public class Binaryconvert {
    public static void reverseQu(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void binNum(int numb) {
        Queue<Integer> q = new LinkedList<>();
        while (numb != 0) {
            int prev = numb % 2; // remainder nikala (0 ya 1)
            q.add(prev);
            numb = numb / 2;
        }
        reverseQu(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        binNum(13);
        Scanner sc = new Scanner(System.in); // Scanner object banaya
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            binNum(i);
        }
        sc.close();
    }
}
