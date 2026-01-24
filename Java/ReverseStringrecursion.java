public class ReverseStringrecursion {
    public static void reversing(String naam,int len){
        if(len<0){
          return;
        }
        System.out.print(naam.charAt(len));
        reversing(naam,len-1);
    }
    public static void main(String[] args) {
        String naam="Harshit";
        int len=naam.length();
        reversing(naam,len-1);

    }
}
