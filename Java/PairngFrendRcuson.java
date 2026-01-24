public class PairngFrendRcuson {
 public static int friendsPairing(int n){
    if (n==1||n==2) {
        return n;
    }
    //choice[single]
    int fnm1=friendsPairing(n-1);
    //pair
    int fnm2=friendsPairing(n-2);
    int pairWays=(n-1)*fnm2;
    //totalway
    int totalway=fnm1+pairWays;
    return totalway;
 }
 public static void main(String[] args) {
    System.out.println(friendsPairing(3));
 }
}
