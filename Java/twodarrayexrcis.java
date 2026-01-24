public class twodarrayexrcis {
 public static int secondrow_sum(int arr[][]){
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            if (i==1) {
               sum += arr[i][j];
            } else {
                break;
            }
        }
    }
    return sum;
 }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},
                  {5,6,7,8},
                  {9,10,11,12} };
                  System.out.println(secondrow_sum(arr));        
    }
}
