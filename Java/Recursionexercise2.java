public class Recursionexercise2 {
    public static void StringtoDigit(int n){
        if (n==0) {
            return;
        }
        String name []={"zero","one","two","three","four","five","six","seven","eight","nine"};
        StringtoDigit(n/10);
        System.out.println(name[n%10]);

    }
    public static void main(String[] args) {
    StringtoDigit(1947);
    }
}
