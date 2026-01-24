package PracticeArea;
import java.util.*;

public class StackByqueue {
    static class MyQueue {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        static int size=0;
        public void push(int data){
            q1.add(data);
            size++;
        }
        public boolean isNull(){
            return q1.isEmpty();
        }
        public int pop(){
            if (isNull()) {
                System.out.println("sorry ur stack is emty");
                return -1;
            }
            for (int i = 0; i <= size-2; i++) {
            q2.add(q1.remove());
            }
            int del=q1.remove();
            size--;
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
            return del;
        }
        // peek
        public int peek(){
            if (isNull()) {
                System.out.println("sorry ur stack is emty");
                return -1;
            }
            for (int i = 0; i <= size-2; i++) {
            q2.add(q1.remove());
            }
            int top=q1.peek();
            q2.add(q1.remove());
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
            return top;
        }
    }

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.push(41);
        mq.push(28);
        mq.push(32);
        mq.push(21);
        mq.push(19);
        while (!mq.isNull()) {
            System.out.println(mq.peek());
            mq.pop();
        } 


    }
}
