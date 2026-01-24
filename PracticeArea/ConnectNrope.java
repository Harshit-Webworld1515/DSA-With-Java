/* Connect n ropes with minimum cost
 Given are N ropes of different lengths, the task is to connect these ropes into one rope with
 minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths. */
package PracticeArea;
import java.util.*;
public class ConnectNrope { 
    public static int nRope(int arr[]){
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (pq.size()>1) {
            int num1=pq.poll();
            int num2=pq.poll();
            int adds=num1+num2;
            result+=adds;
            pq.add(adds);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,2,6};
        System.out.println(nRope(arr));
    }
}
