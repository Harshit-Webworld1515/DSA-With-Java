public class countsetbit {
    public static int count1in_num(int num){
        int count =0;
        while (num>0) {
            if ((num &1) != 0) {
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(count1in_num(10));
    }
}//count number of one any binary number
