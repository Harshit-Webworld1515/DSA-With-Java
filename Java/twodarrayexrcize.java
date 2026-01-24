  public class twodarrayexrcize {
    public static void frequency(int arr[][],int key){
        int count=0;
        int m=arr.length;
        int n=arr[0].length;
        for (int i = 0;i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]==key) {
                    count++;
                    
                }
            }
        }
        System.out.println(count);
     } 
    public static void main(String[] args) {
        int arr[][]={{3,4,5,6},
                     {4,7,3,2},
                     {4,8,1,4}};
                     int key=3;
     frequency(arr, key);
    }
}
