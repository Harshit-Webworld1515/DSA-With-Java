public class ispoweroftwobit {
    public static boolean ispoweroftwo(int num){
        return (num&(num-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(ispoweroftwo(34));
    }
}
