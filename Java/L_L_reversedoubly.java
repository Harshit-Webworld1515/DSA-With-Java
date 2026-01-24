public class L_L_reversedoubly {
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
        public  Node head;
        public  Node tail;
        public  int size;
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
            public void printdll(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+"<->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public Node reverseDoubly() {
            // MENTOS JINDGI
            Node curr=head;
            Node prev=null;
            Node next;
            while (curr!=null) {
                next=curr.next;
                curr.prev=next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            return head=prev;
        // // STEP 1: Swap head and tail OF AAM JINDGI
        // Node temp = head;
        // head = tail;
        // tail = temp;
        // // STEP 2: Start from new head (old tail)
        // Node current = head;
        // Node tempPrev=null;
        // // STEP 3: Traverse and swap next/prev pointers
        // while (current != null) {
        //     // Store original prev (temp variable zaroori hai)
        //     tempPrev = current.prev;
        //     // Swap next and prev
        //     current.prev = current.next;
        //     current.next = tempPrev;
        //     // Move to next node (original prev)
        //     current = tempPrev;
        // }
        // // STEP 4: Return new head
        // return head;
}
        public  static void main(String[] args) {
            L_L_reversedoubly revs=new L_L_reversedoubly();
            revs.addFirst(5);
            revs.addFirst(4);
            revs.addFirst(3);
            revs.addFirst(2);
            revs.addFirst(1);
            revs.printdll();
            revs.reverseDoubly();
            revs.printdll();

        }
}
