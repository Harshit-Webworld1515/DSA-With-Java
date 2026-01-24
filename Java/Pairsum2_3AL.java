// sorted and rotated to find target
import java.util.ArrayList;
public class Pairsum2_3AL {
    public static boolean findValues(ArrayList<Integer>list,int target){
        int maximum=Integer.MIN_VALUE;
        for (int j = 0; j < list.size()-1; j++) {
            if(list.get(j)> list.get(j+1)){
               maximum= Math.max(maximum, j);
            }            
        }
        int i=maximum;
        int rp=i;
        int lp=i+1;
        while (lp!=rp) {
            if (list.get(lp)+list.get(rp)==target) {
                System.out.println(list.get(lp)+","+list.get(rp));
                return true;                
            }
            if(list.get(lp)+list.get(rp)<target){
            lp=(lp+1)%list.size();
            }
            else{
                rp=(list.size()+rp-1)%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        System.out.println(findValues(list, 16));
    }
}
