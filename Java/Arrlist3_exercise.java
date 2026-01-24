import java.util.*;
public class Arrlist3_exercise {
    public static int maxFrequency(ArrayList<Integer>list){
        Collections.sort(list);
        int maximaam=0;
        int result=list.get(0);
        for (int i = 0; i < list.size(); i++) {
             int freq = Collections.frequency(list, list.get(i));
            if (freq > maximaam) {
                maximaam = freq;
                result = list.get(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(17);
        list.add(19);
        list.add(17);
        list.add(19);
        list.add(17);
        list.add(17);
        System.out.println(maxFrequency(list));
    }
}
