public class Backtrack_Gridways {
    public static int countWays(int i,int j,int m,int n){
        if (i==m-1&&j==n-1) {//condition for last call 
            return 1;
        }else if(i==m||j==n){//condition for boundry cross
           return 0; 
        }
        int w1=countWays(i+1, j, m, n);
        int w2=countWays(i, j+1, m, n);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=4;
        int m=3;
        System.out.println(countWays(0,0,m,n)); 
    }
}
