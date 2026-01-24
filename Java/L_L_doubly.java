public class L_L_doubly {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
        // add
        public void addFirst(int data){
            Node newNoda=new Node(data);
            size++;
            if (head==null) {
                head=tail=newNoda;
                return;
            }
            newNoda.next=head;
            head.prev=newNoda;
            head=newNoda;
        }
        public void addLast(int data){
            Node nyaNode=new Node(data);
            size++;
            if (head==null) {
                nyaNode=head=tail;
                return;
            }
            tail.next=nyaNode;
            nyaNode.prev=tail;
            tail=nyaNode;
        }
        public void printdll(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public int removeFirst(){
            if (head==null) {
                System.out.println("ll is null");
                return Integer.MIN_VALUE;
            }
            if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
            }
            int item=head.data;
            head=head.next;
            head.prev=null;
            size--;
            return item;
        }
        public int removeLaast(){
            if (head==null) {
                System.out.println("ll is null");
                return Integer.MIN_VALUE;
            }
            if (size==1) {
                tail=head=null;
                size=0;
            }
            int item=tail.data;
            tail=tail.prev;
            tail.next=null;
            size--;
            return item;
        }
    public static void main(String[] args) {
        L_L_doubly dll=new L_L_doubly();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.printdll();
        dll.addLast(6);
        dll.addLast(7);
        dll.addLast(8);
        dll.addFirst(1);
        System.out.println(size);
        dll.printdll();
        dll.removeFirst();
        dll.printdll();
        dll.removeLaast();
        dll.printdll();
    }
}
