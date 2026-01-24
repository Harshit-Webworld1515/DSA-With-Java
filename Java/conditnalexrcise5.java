import java.util.Scanner;
public class conditnalexrcise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year: ");
        int year=sc.nextInt();
        if (((year%100)!=0)&&(year%4==0)) {
            System.out.println("year is leap");
        }
        else if((year%400==0)&&(year%100==0)) {
           System.out.println("year is leap");
        }
        else {
            System.out.println("year is not leap");
        }
    }
}
