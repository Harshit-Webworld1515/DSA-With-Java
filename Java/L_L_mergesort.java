public class L_L_mergesort {
    public static Node head;
    public static Node tail;
    public static int size;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node nod = new Node(data);
        size++;
        if (head == null) {
            head = tail = nod;
            return;
        }
        nod.next = head;
        head = nod;
        return;
    }

    private Node findmidNode(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void printLL() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node mergeSort(Node head) {
        // Base case: if list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }
        // Find the middle node of the list
        Node mid = findmidNode(head);
        // Split the list into two halves
        Node rightHead = mid.next; // Head of right half
        mid.next = null; // Break the link to split
        // Recursively sort the left and right halves
        Node newLeft = mergeSort(head); // Sort left half
        Node newRight = mergeSort(rightHead); // Sort right half
        // Merge the two sorted halves
        return merge(newLeft, newRight);
    }

    private Node merge(Node head1, Node head2) {
        // Create a dummy node to build the merged list
        Node mergedLL = new Node(-1);
        Node temp = mergedLL; // Pointer to build the new list
        // Merge nodes while both lists have elements
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1; // Take node from first list
                head1 = head1.next; // Move first list pointer
            } else {
                temp.next = head2; // Take node from second list
                head2 = head2.next; // Move second list pointer
            }
            temp = temp.next; // Move the builder pointer
        }
        // Attach remaining elements from first list (if any)
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        // Attach remaining elements from second list (if any)
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        // Return the merged list (skip dummy node)
        return mergedLL.next;
    }

    public static void main(String[] args) {
        L_L_mergesort ll = new L_L_mergesort();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLL();
        head = ll.mergeSort(head);
        ll.printLL();
    }
}
