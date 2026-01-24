public class Recursionexercise1 {
    public static void printIndices(int arr[],int key,int i){
        if (i==arr.length) {
            return;
        }
        if (arr[i]==key) {
            System.out.println(i);
        }    
         printIndices(arr, key, i+1);
        
    } 
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        System.out.println("index of 2 is:");
       printIndices(arr,2,0);
    }
}
