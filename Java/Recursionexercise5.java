public class Recursionexercise5 {
    public static void towerofHanoi(int n,String source,String helper,String dest){
    if (n==1) {
        System.out.println("transfer disk "+n+" from  "+source+"  to  "+dest);
        return;
    }
    towerofHanoi(n-1, source,dest,helper);
    System.out.println("transfer disk "+n+" from  "+source+"  to "+dest);
    towerofHanoi(n-1, helper, source, dest);
    }
    public static void main(String[] args) {
    int n=5;
    towerofHanoi(n,"s","h","d");
    }
}
