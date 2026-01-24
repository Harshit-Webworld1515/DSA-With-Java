 package PracticeArea;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class QueueReverse {
    public static void reverseQueue(Queue<Integer>qn){
        Stack<Integer>st=new Stack<>();
        while (!qn.isEmpty()) {
            st.push(qn.remove());
        }
        while (!st.isEmpty()) {
            qn.add(st.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer>qn=new LinkedList<>();
        for (int i = 10; i < 40; i+=5) {
            qn.add(i);
        }
        reverseQueue(qn);
        while (!qn.isEmpty()) {
            System.out.print(qn.peek()+",");
            qn.remove();
        }
    }
}