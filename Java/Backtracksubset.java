public class Backtracksubset {
    public static void find_Subset(String str,String ans,int i){
        // base case
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
            }
            else{
            System.out.println(ans);
        }
            return;
        }
        // YES CHOICE
        find_Subset(str, ans+str.charAt(i), i+1);
        // no choice
        find_Subset(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str="abc";
        find_Subset(str,"",0);
    }
}
