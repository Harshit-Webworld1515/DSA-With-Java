public class L_L_removecycle {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // public static void removeLoop(){
    // if (isCycle()) {
    // Node slow=head;
    // Node fast= head;
    // // Detect cycle using Floyd's algorithm
    // while (fast!=null&&fast.next!=null) {
    // slow=slow.next;
    // fast=fast.next.next;
    // if (slow==fast) {
    // break;
    // }
    // }
    // slow=head;
    // Node prev=null;
    // while (slow!=fast) {
    // prev=fast;
    // slow=slow.next;
    // fast=fast.next;
    // }
    // if (slow == head) {// Case 1: Loop starts at head (e.g., 1→2→3→1)
    // while (fast.next != slow) {
    // fast = fast.next;
    // }
    // fast.next = null;
    // } else { // Case 2: Loop starts elsewhere (e.g., 1→2→3→4→2)
    // prev.next = null;
    // }
    // }
    // } more optimized code than you
    public static void removeLoop() {
        if (head == null || head.next == null) {
            return; // No loop possible
        }
        Node slow = head;
        Node fast = head;
        boolean hasCycle = false;
        // Detect cycle using Floyd's algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) {
            return; // No cycle found
        }
        // Find the start of the cycle
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // Case 1: Loop starts at head (e.g., 1→2→3→1)
        if (slow == head) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            fast.next = null;
        }
        // Case 2: Loop starts elsewhere (e.g., 1→2→3→4→2)
        else {
            prev.next = null;
        }
    }

    public static void printLL() {
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

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(8);
        head.next.next = new Node(9);
        head.next.next.next = new Node(99);
        head.next.next.next.next = head.next;
        // System.out.println(isCycle());
        removeLoop();
        printLL();

    }
}
