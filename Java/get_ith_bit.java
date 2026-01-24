public class get_ith_bit {
    public static int getting_ith(int n ,int i){
        int bitmask=1<<i;
        if ((n&bitmask)==0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println("number is:  "+getting_ith(12, 2));
    }
}
//we know in binary10=1010 at 2nd place ans should be 0
