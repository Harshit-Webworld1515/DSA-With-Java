public class Linkedlist_intro {
     class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        //step 1st=create new node
        Node newNode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;//head and 
            return;
        }
        // step 2nd=nye node ka next purane head ko point kre
        newNode.next=head;
        //step 3rd= nye node ko head bna do
        head=newNode;
    } 
    public void addMiddle(int idx,int data){
        if (idx==0) {
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
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
    public int removeFirst(){
        if (head==null) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }else{
            int val=head.data;
            head=head.next;
            size--;
            return val;
        }
    }
        public int removeLast(){
            if (size==0) {
                System.out.println("nulla h ll");
                return Integer.MIN_VALUE;
            }
            else if(size==1){
                int val=tail.data;
                head=tail=null;
                size=0;
                return val;
            }
            else{
                Node prev=head;
            for (int i = 0; i <size-2; i++) {
                prev=prev.next;
            }
            int val=tail.data;
            prev.next=null;
            tail=prev;
            size--;
            return val;
            }
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
        public void reverseLL(){
            Node prev =null;
            Node curr= tail=head;
            Node next;
            while (curr!=null) {
                next=curr.next;
                curr.next=prev;//main line
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        public void deleteNthfromEnd(int n){
            // pehla kam to calculate size of LL
            if (n==size) {//jab idx from end n==size ho jaye
                head=head.next;//head ko head ka next bna do
                return;
            }
            int i=1;
            int aageseprev=size-n;
            Node prev=head;
            while (i<aageseprev) {
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;
        }
    public static void main(String[] args) {
        Linkedlist_intro ll=new Linkedlist_intro();
        // ll.head=ll.new Node(1); //in dono line ke likhne se 
        // ll.head.next=new Node(2);//boht bda ho jayega program
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(1, 8);   
        ll.printLL();     
        System.out.println(size);
        // ll.removeFirst();
        // ll.printLL();
        // ll.removeLast();
        ll.printLL();
        ll.reverseLL();
        ll.printLL();
        ll.deleteNthfromEnd(3);
        ll.printLL();
       System.out.println(ll.searchIterative(4));
    }
}