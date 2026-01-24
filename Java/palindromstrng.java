public class palindromstrng {
public static boolean ispalindrome(String str){
    int n=str.length();
    for (int i = 0; i < str.length()/2; i++) {
        if (str.charAt(i)!=str.charAt(n-i-1)) {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        String str="raCeCar";
        System.out.println(ispalindrome(str));
    }
}