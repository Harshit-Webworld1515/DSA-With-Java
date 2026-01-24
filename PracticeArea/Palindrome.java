package PracticeArea;

class Palindrome {
    public class Node {
        char data;
        Node next;
        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addLast(char data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node reverseLL(Node head) {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head = prev;
    }

    public static boolean isPalindrome(Node head) {
        Node hd1 = findMid(head);
        Node hd2 = reverseLL(hd1.next);
        hd1 = head;
        while (hd2 != null) {
            if (hd1.data == hd2.data) {
                hd1 = hd1.next;
                hd2 = hd2.next;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.addLast('a');
        ll.addLast('b');
        ll.addLast('d');
        ll.addLast('b');
        ll.addLast('a');
        ll.printList();
        System.out.println(size);
        if (isPalindrome(head)) {
            System.out.println("yes it is palindrome");
        } else {
            System.out.println("no its not palindrome");
        }
    }
}