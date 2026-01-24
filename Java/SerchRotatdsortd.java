public class SerchRotatdsortd {
    public static int searchTarget(int arr[],int tar,int si,int ei){
        if (si>ei) {
            return -1;
        }
   //kaam
   int mid=si+(ei-si)/2;
   //case turant mil gya
   if (arr[mid]==tar) {
    return mid;
   }
   //mid on L1
   if (arr[si]<=arr[mid]) {
    //case A
    if (arr[si]<=tar&&tar<=arr[mid]) {
       return searchTarget(arr, tar, si, mid-1);
    }
    //caseB
    else{
       return searchTarget(arr, tar, mid+1, ei);
    }
   }
   //mid on l2
   else{
    //case C  right
    if (arr[mid]<=tar&&tar<=arr[ei]) {
        return searchTarget(arr, tar, mid+1, ei);
    }//case d left
    else{
     return searchTarget(arr, tar, si, mid-1);
    }
   }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;//output index=4aana chaiyhe
        int tarIdx=searchTarget(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}
