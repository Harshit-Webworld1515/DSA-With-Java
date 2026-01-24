import java.util.*;
public class vrblexercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen =sc.nextFloat();
        float pencil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float totalcost=pen+pencil+eraser;
        System.out.println(totalcost);
        float finalbill=(float)(totalcost+totalcost*0.18);
        System.out.println(finalbill);
    }
}
