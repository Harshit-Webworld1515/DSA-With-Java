package PracticeArea;
import java.util.Stack;
public class GreaterNextel {
    public static void greaterElement(int nums[],int nge[]){
      Stack<Integer>st=new Stack<>();
      for (int i = 0; i < nums.length; i++) {
        for (int j = nums.length-1; j > i; j--) {
            if (nums[i]<nums[j]) {
                st.push(nums[j]);
            }
        }
        if (st.isEmpty()) {
            nge[i]=-1;
        } else {
            nge[i]=st.peek();
            while (!st.isEmpty()) {
                st.pop();
            }
        }
      }  
    }
    public static void main(String[] args) {
        int nums[]={4,5,2,25};
        int nge[]=new int[nums.length];
        greaterElement(nums,nge);
        for (int i = 0; i < nge.length; i++) {
            System.out.println(nge[i]);
        }
    }
}
