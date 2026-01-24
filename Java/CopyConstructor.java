public class CopyConstructor {
    public static void main(String[] args) {
        Topper t1=new Topper();
        t1.name="manju";
        t1.roll=345;
        t1.password="asdfg";
        t1.marks[0]=100;
        t1.marks[1]=90;
        t1.marks[2]=80;

        Topper t2=new Topper(t1);
        t2.password="osm";
        t1.marks[2]=100;
        System.out.println(t2.password);
        for (int i = 0; i < 3; i++) {
            System.out.println(t2.marks[i]);
        }
    }
}
class Topper{
    String name;
    int roll;
    String password;
    int marks[];
    // shallow copy constructor
 /*    Topper(Topper t1){
        this.name=t1.name;
        this.roll=t1.roll;
        marks=new int[3];
        this.marks=t1.marks;
    }*/
    //deep copy constuctor
    Topper(Topper t1){
        this.name=t1.name;
        this.roll=t1.roll;
        marks=new int[3];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i]=t1.marks[i];
        }
    }
    Topper(){
        System.out.println("constructor");
        marks=new int[3];
    }
}