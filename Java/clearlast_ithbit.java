public class clearlast_ithbit {
    public static int clearlast_ithbit(int num,int i){
        int bitmask=(~0)<<i;
        return num&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clearlast_ithbit(15, 2));
    }
}
