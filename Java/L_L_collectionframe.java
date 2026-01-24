import java.util.LinkedList;
public class L_L_collectionframe {
    public static void main(String[] args) {
        // creat a ll
        LinkedList<Integer>ll=new LinkedList<>();
        // add
        ll.addLast(4);
        ll.addLast(3);
        ll.addFirst(2);
        // print ll
        System.out.println(ll);
        // delete
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
    }
}