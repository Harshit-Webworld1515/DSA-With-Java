public class arrayasfunction {
    public static void function(int mark[]) {
        int nonchng=10;
        for (int i = 0; i < mark.length; i++) {
            mark[i]=mark[i]+1;
        }
       // System.out.println(nonchng);
    }
    public static void main(String[] args) {
        int mark[]={97,98,99};
        int nonchng=5;
        function(mark);
       System.out.println(nonchng);
        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }
    }
}
