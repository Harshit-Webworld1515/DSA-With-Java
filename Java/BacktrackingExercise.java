//rat in maze
public class BacktrackingExercise {
    public static void main(String[] args) {
        int maze[][]={
        {1,1,0,0},
        {1,1,0,1},
        {1,1,0,0},
        {0,1,1,1}
      };
        int n= maze.length;
        int[][]sol=new int[n][n];
        if(solvetheMaze(maze,0,0,sol,n)){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sol[i][j]);
            }
            System.out.println();
        }
    }
    else{
            System.out.println("path not available");
        }
    }
    public static boolean solvetheMaze(int maze[][],int x,int y,int[][]sol,int n){
        if (x==n-1&&y==n-1&& maze[x][y]==1) {
            sol[x][y]=1;
            return true;
        }
        if (isSafe(maze,x,y,n)) {
            sol[x][y]=1;
            //x-direction
            if (solvetheMaze(maze, x+1, y, sol, n)) { 
                return true;
            }
            //y direction
            if (solvetheMaze(maze, x, y+1, sol, n)) {
                return true;
            }
            //backtracking
            sol[x][y]=0;
            return false;
        }
        return false;
    }
    public static boolean isSafe(int[][]maze,int x,int y,int n){
        return(
            x>=0&&x<n&&y>=0&&y<n&&maze[x][y]==1
        );
    }
}