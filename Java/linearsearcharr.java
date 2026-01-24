public class linearsearcharr {

    public static int linearsearch(int num[],int key){
        for (int i = 0; i < num.length; i++) {
            if (num[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={11,22,33,44,55,86,77,88,99,90,};
        int key=77;
        int index=linearsearch(num, key);
        if (index==-1) {
            System.out.println("not found");
        } else {
            System.out.println("num is at"+index);
        }
}
}