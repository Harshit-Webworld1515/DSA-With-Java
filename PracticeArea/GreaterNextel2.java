package PracticeArea;
import java.util.Stack;
public class GreaterNextel2 {
    public static void nextGreater(int arr[],int result[]){
        Stack<Integer>s=new Stack<>();
        result[arr.length-1]=-1;
        s.push(arr.length-1);
        for (int i = arr.length-2; i>=0; i--) {
            while (!s.isEmpty()&&(arr[i]>arr[s.peek()])) {
                s.pop();
            }
            if (s.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = arr[s.peek()];
            }
             s.push(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int result[]=new int[arr.length];
        nextGreater(arr,result);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
