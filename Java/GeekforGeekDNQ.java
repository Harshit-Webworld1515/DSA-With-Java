public class GeekforGeekDNQ {
    public static int binarySearch(int arr[],int si,int ei,int key){
        if (si>ei) {
            return -1;
        }
        int mid =si+(ei-si)/2;
        if (arr[mid]==key) {
            return mid;
        }
        if (arr[mid]>key) {
            return binarySearch(arr, si, mid-1, key);
        }else{
            return binarySearch(arr, mid+1, ei, key);
        }
        
    }
    public static void main(String[] args) {
        int arr[]={11,22,33,44,55};
        int key=15;
   int result= binarySearch(arr, 0,arr.length-1,key);
   if (result!=-1) {
    System.out.println("key found at "+result);
   } else {
    System.out.println("key not found");
   }
    }
}