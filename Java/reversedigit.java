public class reversedigit {
    public static void main(String[] args) {
        int n=1086799;
        int rev =0;
        while (0<n) {
        int ld=n%10;
        rev=(rev*10)+ld;
        n=n/10;    
        }
        System.out.println("rev digit is"+rev);
    }
}
