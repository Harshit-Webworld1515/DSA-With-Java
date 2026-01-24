public class L_L_question4 {
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
    public void oddaftrEven(){
        if (head == null || head.next == null) {
        return;
    }
         // ऑड और इवन नोड्स के लिए अलग-अलग पॉइंटर्स
        Node oddHead = null, oddTail = null;
        Node evenHead = null, evenTail = null;
        Node current = head;
        while (current!=null) {
            if (current.data%2==0) {
                if (evenHead==null) { 
                    evenHead=evenTail=current;
            }else{
                evenTail.next=current;
                evenTail=evenTail.next;
            }
            }else{
                 if (oddHead == null) {
                oddHead = oddTail = current;
            } else {
                oddTail.next = current;
                oddTail = oddTail.next;
            }
            }
            current=current.next;
        }
       if(evenHead!=null) {
        head=evenHead;
        evenTail.next=oddHead;
       }else{
        head=oddHead;
       }
       // लिस्ट का अंत सही से करें
     if (oddTail != null) {
        oddTail.next = null;
        tail = oddTail;
    } else {
        tail = evenTail;
    }
    }
    public static void main(String[] args) {
        L_L_question4 llq=new L_L_question4();
        llq.addLast(1);
        llq.addLast(2);
        llq.addLast(3);
        llq.addLast(4);
        llq.addLast(5);
        llq.addLast(6);
        llq.addLast(7);
        llq.addLast(8);
        llq.oddaftrEven();
        llq.printLL();
    }
}
