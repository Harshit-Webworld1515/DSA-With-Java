public class Checksortedrcurson {
      public static void sortedArray(int ramji[],int idx){
       if (idx==ramji.length-1) {
        System.out.println("array is sorted");
        return;
       }
       if (ramji[idx]<ramji[idx+1]) {
        sortedArray(ramji, idx+1);
       }else{
        System.out.println("array is not sorted");
        return;
       }
      }
    public static void main(String[] args) {
        int ramji[]={1,2,3,4,5,6,8};
        sortedArray(ramji,0);

    }
}