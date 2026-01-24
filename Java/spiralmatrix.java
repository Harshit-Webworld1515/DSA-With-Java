public class spiralmatrix {
    public static void printspiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endrow=matrix.length-1;
        int endCol=matrix[0].length-1;
        
     while (startRow<=endrow&&startCol<=endCol) {
        //top boundry
        for (int j = startCol; j <=endCol; j++) {
            System.out.print(matrix[startRow][j]+" ");
        }
        //right boundry
        for (int i = startRow+1; i <=endrow; i++) {
            System.out.print(matrix[i][endCol]+" ");
        }
        //bottom boundry
        for (int j = endCol-1; j >= startCol; j--) {
            if (startRow==endrow) {
                break;
            }
            System.out.print(matrix[endrow][j]+" ");
        }
        //left boundry
        for (int i = endrow-1; i >= startRow+1; i--) {
            if (startCol==endCol) {
                break;
            }
            System.out.print(matrix[i][startCol]+" ");
        }
        startCol++;
        startRow++;
        endCol--;
        endrow--;
     }
     System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        printspiral(matrix);
    }
}
