public class DevidncnqurQestion {
    public static void printArr(String words[]){
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
    }
    public static void stringSortMerge(String words[],int si,int ei){
        if (si>=ei) {
            return;
        }
        int mid=si+(ei-si)/2;
    stringSortMerge(words, si, mid);
    stringSortMerge(words, mid+1, ei);
     finalArray(words, si, mid, ei);
    }
    public static void finalArray(String words[],int si,int mid,int ei){
     String result[]=new String[ei-si+1];
     int i=si;
     int j=mid+1;
     int k=0;
     while (i<=mid&&j<=ei) {
        if (words[i].compareTo(words[j])<0) {
            result[k]=words[i];
            i++;
        }else{
            result[k]=words[j];
            j++;
        }
        k++;
     }
     while (i<=mid) {
        result[k++]=words[i++];
     }
     while (j<=ei) {
        result[k++]=words[j++];
     }
     for (i=si, k = 0; k < result.length;i++, k++) {
        words[i]=result[k];
     }
    }
    public static void main(String[] args) {
        String words[]={"sun","earth","mars","mercury"};
        stringSortMerge(words, 0, words.length-1);
        printArr(words);
    }
}
