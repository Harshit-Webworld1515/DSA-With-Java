public class TilingRecursion {
    public static int tilingproblem(int n){
        if (n==0||n==1) {//base case
            return 1;
        }
        //vertical choice(kaam)
        int fnm1=tilingproblem(n-1);
        //horizontal choice
        int fnm2=tilingproblem(n-2);
        int totlways=fnm1+fnm2;
        return totlways;
    }
    public static void main(String[] args) {
        System.out.println(tilingproblem(3));
    }
}
