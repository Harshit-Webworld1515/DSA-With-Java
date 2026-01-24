public class Recursionexercise3 {
    public static int CountLength(String name){
        if (name.isEmpty()) {
            return 0;
        } else {
            return 1 + CountLength(name.substring(1));
        }

    }
    public static void main(String[] args) {
        String name="radheshyam";
        int result=CountLength(name);
        System.out.println("no. of letter in this string : "+result);
    }
}
