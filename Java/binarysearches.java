public class binarysearches {
    public static int binary_search(int num[],int key){
    int start=0;int end=num.length-1;
    while (start<=end)  {
        int mid=(start+end)/2;
            if (key==num[mid]) {
           return mid;     
            }
            if (key>num[mid]) {
                start=mid+1;
            
        }
          else {
            end=mid-1;
        }
    }
    return -1;
        
    }
    public static void main(String[] args) {
        int num[]={3,4,5,6,7,8,9};
        int key=7;
        System.out.println(binary_search(num, key));
    }
}
