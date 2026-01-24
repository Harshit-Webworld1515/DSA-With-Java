public class shotstpathstring {
    public static float getshortestpath(String path){
        int x=0;
        int y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir=path.charAt(i);
            //south
            if (dir=='s') {
                y--;
                //north
            } else if (dir=='n') {
                y++;
               // west
            } else if (dir=='w') {
                x--;
                //east
            } else {
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return(float) Math.sqrt(X2+Y2);//ye double return krta h aur rturn type int h
    }
    public static void main(String[] args) {
        String path=("wneenesennn");
        System.out.println(getshortestpath(path));
    }
}
