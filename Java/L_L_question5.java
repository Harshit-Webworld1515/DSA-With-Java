import java.util.*;
class ListNode {
   int val;
   ListNode next;
   
   ListNode(int val) {
       this.val = val;
   }
}
public class L_L_question5 {
    
    
    public ListNode mergeKLists(ListNode[] lists) {
        // Store all values in a list
        List<Integer> allValues = new ArrayList<>();
        
        // Traverse each linked list and collect values
        for (ListNode list : lists) {
            ListNode current = list;
            while (current != null) {
                allValues.add(current.val);
                current = current.next;
            }
        }
        
        // Sort the collected values
        Collections.sort(allValues);
        
        // Build the new merged linked list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        for (int val : allValues) {
            current.next = new ListNode(val);
            current = current.next;
        }
        
        return dummy.next;
    }
    
    // Helper method to create a linked list from array
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        
        return dummy.next;
    }
    
    // Helper method to print linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println("->NULL");
    }
    
    public static void main(String[] args) {
        L_L_question5 merger = new L_L_question5();
        
        // Create all lists from input [[1,4,5],[1,3,4],[2,6]]
        ListNode[] lists = new ListNode[3];
        lists[0] = createList(new int[]{1, 4, 5});
        lists[1] = createList(new int[]{1, 3, 4});
        lists[2] = createList(new int[]{2, 6});
        
        // Merge and print the result
        ListNode merged = merger.mergeKLists(lists);
        System.out.print("Merged List: ");
        printList(merged);
    }
}
