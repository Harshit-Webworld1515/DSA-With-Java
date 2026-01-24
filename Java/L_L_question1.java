import java.util.LinkedList;
public class L_L_question1 {
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(8);
        ll.addLast(4);
        ll.addLast(5);
        LinkedList<Integer>ll2=new LinkedList<>();
        ll2.addLast(5);
        ll2.addLast(6);
        ll2.addLast(1);
        ll2.addLast(8);
        ll2.addLast(4);
        ll2.addLast(5);  
        int ptr1=0;
        int ptr2=0;
        if (ll.size()>ll2.size()) {
            ptr1=ll.size()-ll2.size();
        }else{
            ptr2=ll2.size()-ll.size();
        }      
        while (ptr1!=ll.size()) {
            if (ll.get(ptr1).equals(ll2.get(ptr2))) {
                System.out.println(ll.get(ptr1));
                return;
            }
            ptr1++;
            ptr2++;
        }
    }    
}
