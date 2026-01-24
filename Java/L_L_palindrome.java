public class L_L_palindrome {
    public static Node head;
    public static Node tail;
    public static int size;
    class  Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public void addFirst(int data){
    Node nod=new Node(data);
    size++;
    if (head==null) {
        head=tail=nod;
        return;
    }
    nod.next=head;
    head=nod;
    return ;
}
private Node findmidNode(Node head){
    Node slow=head;
    Node fast=head;
    while (fast!=null&&fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
    }
return slow;
}
public boolean checkPalindrome(){
    if (head==null||head.next==null) {
        return true;
    }
    // step 1st--find mid
    Node mid=findmidNode(head);
// reverse 2nd half
    Node curr=mid;
    Node prev=null;
    Node next;
    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;// Update prev to current node
        curr=next;
    }
    Node right=prev;// This is the head of the reversed second half
    Node left=head;
    while (right!=null) {
        if (left.data!=right.data) {
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;
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
    L_L_palindrome llist=new L_L_palindrome();
    llist.addFirst(3);
    llist.addFirst(8);
    llist.addFirst(5);
    llist.addFirst(4);
    llist.addFirst(3);
    llist.printLL();
   System.out.println(llist.checkPalindrome());
}
}
