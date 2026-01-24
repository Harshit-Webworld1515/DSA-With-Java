public class clear_ith_bit {
    public static int clear_ith(int num,int i){
        int bitmask=~(1<<i);
        return num&bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear_ith(10, 1));
    }
}
