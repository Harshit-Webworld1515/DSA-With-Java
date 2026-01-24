public class L_L__Search {
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
public int searchIterative(int key){
    Node temp=head;
    for (int i = 0; i < size; i++) {
        if (key==temp.data) {
            return i;
        }
        temp=temp.next;
    }
    return -1;
}
public int searchRecursive(int key,int idx,Node temp){
    if (temp == null) {  // Base case: key not found
        return -1;
    }
    if (key==temp.data) {
        return idx;
    }
    return searchRecursive(key, idx+1, temp.next);
}
public static void main(String[] args) {
    L_L__Search link=new L_L__Search();
    link.addFirst(11);
    link.addFirst(9);
    link.addFirst(7);
    link.addFirst(5);
    System.out.println(size);
   System.out.println(link.searchIterative(11));
   System.out.println(link.searchRecursive(141, 0, head));   

}
}
