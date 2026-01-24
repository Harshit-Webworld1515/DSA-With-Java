 package PracticeArea;
public class MaxareaHisto {
    public static int maxHistogram(int height[]){
        int maxi=Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            int ht=height[i];
            for (int j = i; j < height.length; j++) {
                ht= Math.min(ht, height[j]);
                int wd=j-i+1;
                int area=ht*wd;
                maxi=Math.max(area, maxi);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int height[]={3,1,1,1,1,7};
        System.out.println(maxHistogram(height));
    }
}