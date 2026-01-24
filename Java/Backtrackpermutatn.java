public class Backtrackpermutatn {
    public static void permuTation(String str,String repl){
        // base case
        if (str.length()==0) {
            System.out.println(repl);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            permuTation(newstr, repl+curr);
        }
    }
    public static void main(String[] args) {
    String str="abcd";
    permuTation(str, "");
    }
}
