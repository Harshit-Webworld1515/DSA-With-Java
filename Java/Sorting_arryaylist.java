import java.util.*;
public class Sorting_arryaylist {
    public static void main(String[] args) {
       ArrayList<Integer>list=new ArrayList<>();
        list.add(13);
        list.add(4);
        list.add(50);
        list.add(19);
        System.out.println(list);
       Collections.sort(list);
       System.out.println(list);
       Collections.sort(list, Collections.reverseOrder());
    // desending order
       System.out.println(list);
    }
}