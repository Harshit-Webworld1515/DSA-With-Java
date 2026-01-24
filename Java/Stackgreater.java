import java.util.Stack;
public class Stackgreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer>s=new Stack<>();
        int greaterElement[]=new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            // while loop
            while (!s.isEmpty()&&arr[s.peek()]<arr[i]) {
                s.pop();
            }//if else 
            if (s.isEmpty()) {
                greaterElement[i]=-1;
            } else {
                greaterElement[i]=arr[s.peek()];

            }//push in s
            s.push(i);
        }
        System.out.print("finally we got our Array is: ");
        for (int i = 0; i < greaterElement.length; i++) {
            System.out.print(greaterElement[i]+",");
        }
    }
}
