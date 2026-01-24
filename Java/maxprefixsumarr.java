 public class maxprefixsumarr {
    public static void maxsubarr_sum(int num[]){ //prefix maxsubarray sum
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        int prefix[]=new int[num.length];
        //calculate prefix;
        prefix[0]=num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+num[i];
        }
        for (int i = 0; i < num.length; i++) {
            int start=i;
            for (int j = i; j < num.length; j++) {
                int end=j;
                currsum=0;
            currsum=start==0?prefix[end]:prefix[end]-prefix[start-1];             

            if (currsum>maxsum) {
                maxsum=currsum;
            }
            }
        }
        System.out.println("max sum = "+maxsum);
    }
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
    maxsubarr_sum(num);
    }
}


