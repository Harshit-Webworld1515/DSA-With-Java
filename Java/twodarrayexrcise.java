public class twodarrayexrcise {
    public static void transposematrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[0].length; j++) {
          System.out.print(" "+matrix[i][j]+" ");
        }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                       {9,10,11,12}};
    transposematrix(matrix);
     System.out.println("transpose is");
    int arr[][]=new int[matrix[0].length][matrix.length];
    for (int j = 0; j < matrix[0].length; j++) {
        for (int i = 0; i < matrix.length; i++) {
            arr[j][i]=matrix[i][j];
            System.out.print(" "+arr[j][i]+" ");
        }
        System.out.println();
    }
            
    }
}
