import java.util.*;
public class inputarray {
    public static void main(String[] args) {
    int mark[]=new int[50];
    Scanner sc=new Scanner(System.in);
    System.out.println("length of array is: "+mark.length);
    System.out.println("enter mark of phy");
    mark[0]=sc.nextInt();
    System.out.println("enter mark of chem");
    mark[1]=sc.nextInt();
    System.out.println("enter mark of math");
    mark[2]=sc.nextInt();
    System.out.println("enter the mark of eng");
    int eng;
    eng=sc.nextInt();
    System.out.println("mark of physics"+mark[0]);
    System.out.println("mark of chemistry"+mark[1]);
    System.out.println("mark of math"+mark[2]);
    System.out.println("mark of eng"+eng);
    mark[2]=mark[2]+7;
    System.out.println("updated mark in math:"+mark[2]);
    int percentage=(mark[0]+mark[1]+mark[2]+eng)/4;
    System.out.println("percentage; "+percentage+"%");
}
}