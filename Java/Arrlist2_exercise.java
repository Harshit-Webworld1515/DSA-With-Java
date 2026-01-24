// You are given an integer arraylist nums.A number x is lonely when it appear only once ,and
//  no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
//  Return all lonely numbers in nums. You may return the answer in any order
import java.util.ArrayList;
import java.util.Collections;
// nakal kiye ho
public class Arrlist2_exercise {
    public static ArrayList<Integer> lonelyNumber(ArrayList<Integer> list) {
        ArrayList<Integer> lonelyNumbers = new ArrayList<>();
        Collections.sort(list); // Sort to easily check adjacent numbers
        
        for (int i = 0; i < list.size(); i++) {
            boolean isLonely = true;
            // Check if current number appears more than once
            if (Collections.frequency(list, list.get(i)) > 1) {
                isLonely = false;
            }
            // Check adjacent numbers
            if (i > 0 && list.get(i - 1) == list.get(i) - 1) {
                isLonely = false;
            }
            if (i < list.size() - 1 && list.get(i + 1) == list.get(i) + 1) {
                isLonely = false;
            }
            if (isLonely) {
                lonelyNumbers.add(list.get(i));
            }
        }
        return lonelyNumbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(17);
        list.add(11);
        list.add(5);
        list.add(10);
        list.add(16);
        System.out.println(lonelyNumber(list));
    }
}