public class update_ithbit {
    public static int clear_ith(int num,int i){
        int bitmask=~(1<<i);
        return num&bitmask;
    }
    public static int setting_ith(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static int updatation_ithbit(int n, int i,int newbit){
        //if (newbit==0) {
          //  return clear_ith(n, i);
        //} else {
          //  return setting_ith(n, i);
        //}
        n=clear_ith(n, i);
        int bitmask=newbit<<i;
        return n|bitmask;
    }
    public static void main(String[] args) {
        System.out.println(updatation_ithbit(10, 2,1));
    }
}
