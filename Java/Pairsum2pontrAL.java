import java.util.ArrayList;
public class Pairsum2pontrAL {
    public static boolean twoPointer(ArrayList<Integer>list,int  target){
        int lp=0;
        int rp=list.size()-1;
        while (rp>lp) {
            if (list.get(lp)+list.get(rp)==target) {
                System.out.println(list.get(lp)+","+list.get(rp));
                return true;                
            }
            if(list.get(lp)+list.get(rp)<target){
            lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(9);
       System.out.println( twoPointer(list, 3));
    }
}
