import java.util.ArrayList;
public class MultiD_arraylist {
public static void main(String[] args) {
    ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
    ArrayList<Integer>list1=new ArrayList<>();
    list1.add(3);
    list1.add(7);
    ArrayList<Integer>list2=new ArrayList<>();
    list2.add(9);
    list2.add(8);
    mainList.add(list2);
    mainList.add(list1);
    System.out.println(mainList);
    for (int i = 0; i < mainList.size(); i++) {
        ArrayList<Integer>currlist=mainList.get(i);
        for (int j = 0; j < currlist.size(); j++) {
            System.out.print(currlist.get(j)+" ");
        }
        System.out.println();
    }
}
}