public class Queue_linklist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public void add(int data) {
            Node newnNode = new Node(data);
            if (head == null) {
                head = tail = newnNode;
                return;
            }
            tail.next = newnNode;
            tail = newnNode;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front = head.data;
            // for removng single
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue_linklist qe = new Queue_linklist();
        Queue q = qe.new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        while (!Queue.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
// ham tail ko rear se replace ker sakte hainfor convention
