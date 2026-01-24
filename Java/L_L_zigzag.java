public class L_L_zigzag {
    class  Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
    public static Node head;
    public static Node tail;
    public  void zigZag(){
        // find mid
    Node slow=head;
    Node fast=head.next;
    while (fast!=null&&fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;
    // reverse 2nd half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;// Update prev to current node
        curr=next;
    }
    Node left=head;
    Node right=prev;
    Node nextL,nextR;
    // zig zag merge
    while (left!=null&&right!=null) {
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;
        // update
        left=nextL;
        right=nextR;
        
    }
    }
    public void addLast(int data){
        Node newNode=new Node(data);
            if (head==null) {
            head=tail=newNode;//head and 
            return;
            }
        tail.next=newNode;
        tail=newNode;
    }
    public void printLL(){
        if (head==null) {
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        L_L_zigzag lis=new L_L_zigzag();
        lis.addLast(1);
        lis.addLast(2);
        lis.addLast(3);
        lis.addLast(4);
        lis.addLast(5);
        lis.printLL();
        lis.zigZag();
        lis.printLL();
    }
}
