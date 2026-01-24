import java.util.Stack;

public class StackHistogrm {
    public static void maxArea(int arr[]) {
        int maxarea = 0;
        int nsl[] = new int[arr.length];
        int nsr[] = new int[arr.length];
        // Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
                s.pop();
            }
            if (s.empty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
                s.pop();
            }
            if (s.empty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        } 
        // current Area
        for (int i = 0; i < arr.length; i++) {
            int ht = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currarea = ht * width;
            maxarea = Math.max(maxarea, currarea);
        }
        System.out.println("the maxArea of a histogram: " + maxarea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };// height of histogram
        maxArea(arr);
    }
}
