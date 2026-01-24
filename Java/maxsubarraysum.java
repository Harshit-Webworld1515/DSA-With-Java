public class maxsubarraysum {
        public static void maxsubarr_sum(int num[]){
            int maxsum=Integer.MIN_VALUE;
            int currsum=0;
            for (int i = 0; i < num.length; i++) {
                int start=i;
                for (int j = i; j < num.length; j++) {
                    int end=j;
                    currsum=0;
                     for (int k = start; k <= end; k++) {
                        currsum+=num[k];
                    }
                    System.out.println(currsum);
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
    

