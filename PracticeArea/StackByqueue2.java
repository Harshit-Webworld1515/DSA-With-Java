package PracticeArea;
import java.util.*;
public class StackByqueue2 {
    static class  MyStack{
        Queue<Integer>q1= new LinkedList<>();
        Queue<Integer>q2= new LinkedList<>();
        public boolean isNull(){
            return q1.isEmpty();
        }
        public  void push(int data){
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(data);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }
        //remove
        public int pop(){
            if (q1.isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            return q1.remove();
        }
        public int peek(){
            if (q1.isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            return q1.peek();
        }
    }

    public static void main(String[] args) {
        MyStack mq = new MyStack();
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
