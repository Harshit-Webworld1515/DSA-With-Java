import java.util.ArrayList;
public class Reverse_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer>score=new ArrayList<>();
        score.add(82);
        score.add(34);
        score.add(44);
        score.add(110);
        score.add(104);
        for (int i = score.size()-1; i >=0; i--) {
            System.out.print(score.get(i)+" , ");
        }
        System.out.println();
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < score.size(); i++) {
          max=Math.max(max, score.get(i));
        }
        System.out.println(max);
        
    }
}
