import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args) {
        // Classname objectname=new Classname();
        ArrayList<Integer>list=new ArrayList<>();
        // ArrayList<Boolean>list2=new ArrayList<>();
        // ArrayList<String>list3=new ArrayList<>();
        // add operation
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(9);
        list.add(2, 12);//special type of add function
        System.out.println(list);
        // get operation return the value at index given by you
        int element=list.get(3);
        System.out.println(element);
        //delete
        list.remove(1);
        System.out.println(list);
        //set
        list.set(2, 23);
        System.out.println(list);
        //contains
        System.out.println(list.contains(23));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
           System.out.print( list.get(i)+", ");
        }
    }
}
