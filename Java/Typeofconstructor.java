public class Typeofconstructor {
    public static void main(String[] args) {
            Monster m1= new Monster();
            Monster m2=new Monster("radha",12);
            System.out.println(m2.name);
            System.out.println(m2.roll);
            Monster m3= new Monster(234);
            System.out.println(m3.roll);
    }
}
class Monster{
    String name;
    int roll;
    Monster(){
        System.out.println("king");
    }
    Monster( String name,int roll){
        this.name=name;
        this.roll=roll;

    }
    Monster(int roll){
        this.roll=roll;
    }
}
