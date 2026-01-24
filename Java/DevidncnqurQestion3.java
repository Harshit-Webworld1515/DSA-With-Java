//devide and conquer
public class DevidncnqurQestion3 {
    public static void majorityDnQ(int arr[],int si,int ei){
      if (si==ei) {
        return;
      }
      int mid=si+(ei-si)/2;
    majorityDnQ(arr, si, mid);
    majorityDnQ(arr, mid+1, ei);
    majorElement(arr,si,ei);
    }
    public static void majorElement(int arr[],int si,int ei){
    for (int i = si; i < ei; i++) {
      int count=1;
      for (int j = si+1; j <=ei; j++) {
        if (arr[i]==arr[j]) {
         count++; 
        }
      }
      if (count>arr.length/2) {
        System.out.println(arr[i]);
        return;
      }
    }
    return;
    }
    public static void main(String[] args) {
        int arr[]={4,3,5,4,4};
      majorityDnQ(arr,0,arr.length-1);
  
    }
}
