public class callbyvalue {
    public static void swap(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap(a,b);//yhi a,b ki value formal parameter me storeho jayegi
        System.out.println(a);//lekin jaise hicontrol me ayegi yah value ki orginal copy print hogi
        System.out.println(b);
    }
}
