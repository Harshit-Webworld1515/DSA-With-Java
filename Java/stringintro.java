import java.util.*;
public class stringintro {
    public static void printletter(String fullname2){
        for (int i = 0; i <fullname2.length(); i++) {
            System.out.print(fullname2.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char arr[]={'a','b','c','d'};
        String str="abcd";
        String str2=new String("xyz");
        System.out.println(str2);
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(name);
        System.out.println(str);
        //to find string length using function.length()
        String fullname="TONY STARK";
        System.out.println(fullname.length());
        //concatenation
        String firstname="Harshit";
        String lastname="Tiwari";
        String fullname2=firstname+" "+lastname;
        System.out.println(fullname2+"is this");
        System.out.println(fullname2.charAt(6));
        printletter(fullname2);
    }
}
