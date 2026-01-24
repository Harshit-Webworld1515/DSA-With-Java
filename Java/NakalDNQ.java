public class NakalDNQ {
    private static int countInRange(int nums[],int num,int lo,int hi){
    int count=0;
    for (int i = 0; i <= hi; i++) {
        if (nums[i]==num) {
            count++;
        }
    }
    return count;
  }
    private static int majoritElement(int nums[],int lo,int hi){
        if (lo==hi) {
            return nums[lo];
        }
        int mid=(hi-lo)/2+lo;
        int left=majoritElement(nums, lo, mid);
        int right=majoritElement(nums, mid+1, hi);
        if (left==right) {
            return left;   
        }
        int leftcount=countInRange(nums, left, lo, hi);
        int rightcount=countInRange(nums, right, lo, hi);
        return leftcount>rightcount?left:right;
    }  
    public static int majorElementRec(int nums[]){
        return majoritElement(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorElementRec(nums));
    }
}
