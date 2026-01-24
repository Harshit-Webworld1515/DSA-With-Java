//    implementation with ArrayList (go to last page of 2nd copy)
import java.util.ArrayList;
public class Stackintro {
    class Stack{
        static ArrayList<Integer>list=new ArrayList<>();
        public boolean isEmpty(){
            if (list.size()==0) {
                return true;
            }
            return false;
        }
        // push
        public  void push(int data){
            list.add(data);
        }
        // pop operation
        public  int pop(){
            if (list.isEmpty()) {
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // peek operation
        public static int peek(){
            if (list.isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }

    }
    public static void main(String[] args) {
        Stackintro si = new Stackintro();
        Stackintro.Stack s=si.new Stack();
        s.push(1);
        s.push(3);
        s.push(9);
        while (!s.isEmpty()) {
            System.out.println(Stack.peek());
            s.pop();
        }   
    }
}
