import java.util.ArrayList;
public class ArrList_exercise {
    public static Boolean getAns(ArrayList<Integer>list){
        if (list.get(0)<list.get(1)) {
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i)>list.get(i+1)) {
                    return false;                    
                }
            }
        }else{
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i)<list.get(i+1)) {
                    return false;                    
                }
            }
        }
    return true;
}
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(19);
        list.add(18);
        list.add(11);
        list.add(10);
        list.add(9);
        list.add(8);
        System.out.println(getAns(list));
    }
}

