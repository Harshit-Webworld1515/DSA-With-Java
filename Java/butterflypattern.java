public class butterflypattern {
    public static void butterfly(int n){
        for (int i = 1; i <= n; i++) {
        //star=i
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }    
        //space=2*(n-1)
        for (int j = 1; j <= 2*(n-i); j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
        }
        //2nd half
        for (int i = n; i >=1; i--) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }    
            //space=2*(n-1)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterfly(40);
    }
}
