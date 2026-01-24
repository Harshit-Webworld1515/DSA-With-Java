// //  Delete N Nodes After M Nodes of a Linked List
//  We have a linked list and two integers M and N. Traverse the linked list such that you retain M
//  nodes then delete next N nodes, continue the same till end of the linked list. Difficulty Level:
//  Rookie.
//  Sample Input 1 : M=2 N=2    LL: 1->2->3->4->5->6->7->8
//  Sample Output 1 : 1->2->5->6
import java.util.LinkedList;
public class L_L_question2 {
    public static LinkedList<Integer> deleteNafterM(LinkedList<Integer>ll) {
        LinkedList <Integer>deleteNafterM=new LinkedList<>(); 
        int n= Integer.MAX_VALUE;
        for (int i = 0; i < ll.size(); i++) {
            if (i==n*3||i==n*4) {
                continue;
            }
            deleteNafterM.add(ll.get(i));
        }
        return deleteNafterM;
    }
    public static void main(String[] args) {
        LinkedList <Integer>ll=new LinkedList<>();
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(8);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        System.out.println(deleteNafterM(ll));
        
    }
}