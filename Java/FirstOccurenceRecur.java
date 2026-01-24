public class FirstOccurenceRecur {
    public static int first_occurence(int arr[],int i,int key){
        if (i==arr.length) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
       return first_occurence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        int key=5;
        System.out.println(first_occurence(arr,0,5));
    }
}
