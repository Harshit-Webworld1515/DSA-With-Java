import java.util.*;

public class QueuebyDeque {
    static class Queue {
        Deque<Integer> dqe = new LinkedList<>();

        public void add(int data) {
            dqe.addLast(data);
        }

        public int remove() {
            return dqe.removeFirst();
        }

        public int peek() {
            return dqe.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue qu = new Queue();
        for (int i = 10; i < 40; i += 5) {
            qu.add(i);
        }
        System.out.println(qu);
        System.out.println(qu.dqe);
        while (!qu.dqe.isEmpty()) {
            System.out.println("Front = " + qu.peek());
            qu.remove();
        }
    }
}
