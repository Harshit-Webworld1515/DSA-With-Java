package PracticeArea;
import java.util.*;
public class Queue2Stack2 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public boolean isEmpty(){
            return s1.isEmpty();
        }
        //add operation O(n)
        public void add(int data){
            s1.push(data);
        }//remove operation O(1)
        public int remove(){
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
           int del =s2.pop();
           while (!s2.empty()) {
            s1.push(s2.pop());
           }
           return del;
        }
        //peekO(1)
        public int peek(){
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
             while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
           int top =s2.peek();
           while (!s2.empty()) {
            s1.push(s2.pop());
           }
           return top;
        }
    }

    public static void main(String[] args) {

        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
