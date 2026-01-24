public class StackimplementLL {
      class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
     class Stack{
        static Node head;
        public static boolean isEmpty(){
            return head==null;
        }//push operation
        public void push(int data){
            StackimplementLL sll=new StackimplementLL();
            StackimplementLL.Node newNode=sll.new Node(data);
            if (isEmpty()) {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        // pop opration
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        StackimplementLL sill=new StackimplementLL();
        StackimplementLL.Stack s=sill.new Stack();
        // Stack s =new Stack();
        s.push(1);
        s.push(3);
        s.push(9);
        while (!Stack.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }   
    }
}
