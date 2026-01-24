public class L_L_question3 {//nakalchi bandar
    class Node {
        int data;
        Node next;        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }    
    private Node head;
    private Node tail;    
    // Add node to the end of list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }    
    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }    
    // Swap nodes method
    public void swapNodes(int key1, int key2) {
        // If both keys are same, no need to swap
        if (key1 == key2) return;
        // Search for key1 and keep track of previous and current nodes
        Node prev1 = null, curr1 = head;
        while (curr1 != null && curr1.data != key1) {
            prev1 = curr1;
            curr1 = curr1.next;
        }
        // Search for key2 and keep track of previous and current nodes
        Node prev2 = null, curr2 = head;
        while (curr2 != null && curr2.data != key2) {
            prev2 = curr2;
            curr2 = curr2.next;
        }
        // If either key1 or key2 not found, return
        if (curr1 == null || curr2 == null) 
        return;
        // If key1 is not head of linked list
        if (prev1 != null) {
            prev1.next = curr2;
        } else { // make key2 the new head
            head = curr2;
        }
        // If key2 is not head of linked list
        if (prev2 != null) {
            prev2.next = curr1;
        } else { // make key1 the new head
            head = curr1;
        }
        // Swap next pointers
        Node temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;        
        // Update tail if necessary
        if (curr1.next == null) {
            tail = curr1;
        }
        if (curr2.next == null) {
            tail = curr2;
        }
    }
    public static void main(String[] args) {
        L_L_question3 ll = new L_L_question3();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);        
        System.out.println("Original list:");
        ll.printList();  // 1->2->3->4->5->null        
        System.out.println("\nSwapping 2 and 4:");
        ll.swapNodes(2, 4);
        ll.printList();  // 1->4->3->2->5->null        
        System.out.println("\nSwapping 1 and 5 (head and tail):");
        ll.swapNodes(1, 5);
        ll.printList();  // 5->4->3->2->1->null        
        System.out.println("\nSwapping adjacent nodes 3 and 2:");
        ll.swapNodes(3, 2);
        ll.printList();  // 5->4->2->3->1->null        
        System.out.println("\nAttempting to swap same nodes:");
        ll.swapNodes(4, 4);
        ll.printList();  // No change        
        System.out.println("\nAttempting to swap non-existent nodes:");
        ll.swapNodes(10, 20);
        ll.printList();  // No change
    }
}