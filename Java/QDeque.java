import java.util.*;
public class QDeque {
    public static void main(String[] args) {
        Deque<Integer>dq=new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);//[2, 1, 3, 4]
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        System.out.println("first element of deque: "+dq.getFirst());
        System.out.println("last item of deque: "+dq.getLast());

    }
}
