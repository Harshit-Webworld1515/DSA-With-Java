public class Recursionexercise4 {
    public static int Countstring(String shri[],int index,int count){
        if (count ==index) {
            return 0;
        }
         int currcount=0;
        if (shri[index].charAt(0)==shri[index].charAt(shri[index].length()-1)) {
        currcount=1;    
        }
     return currcount+Countstring(shri, index+1, count);

    }
    public static void main(String[] args) {
        String stir="abcab";
        String shri[]=new String[26];
        int index=0;
        for (int i = 0; i < stir.length(); i++) {
            for (int j = i;j < stir.length(); j++) {
                shri[index]=stir.substring(i, j+1);
                 index++;
            }
        }
        for (int i = 0; i < index+1; i++) {
            System.out.println(shri[i]);
        }
       int result= Countstring(shri,0,index);
       System.out.println("No. of first and of last string same substring : "+result);
       }
}
