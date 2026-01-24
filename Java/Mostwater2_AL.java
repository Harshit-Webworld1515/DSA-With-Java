import java.util.ArrayList;
public class Mostwater2_AL {
    public static int storeWater(ArrayList<Integer>height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;
        while (lp<rp) {
            // calculate water area
            int ht=Math.min(height.get(rp), height.get(lp));
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(maxwater, currwater);
            // update pointer
            if (height.get(lp)>height.get(rp)) {
                rp--;
            } else {
                lp++;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}
