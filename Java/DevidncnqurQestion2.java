//brute force technique
public class DevidncnqurQestion2 {
    public static int majorityElement(int nums[],int si,int ei){
        
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            for (int j = i; j < nums.length; j++) {
                if (nums[i]==nums[j]) {
                    count++;
                }
            }
            if (count>nums.length/2) {
                return nums[i];
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        int nums[]={3,7,4,5,7};
        int n=nums.length;
        int element=majorityElement(nums, 0, n-1);
         System.out.println(element);
    }
}
