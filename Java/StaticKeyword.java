public class StaticKeyword {
    public static void main(String[] args) {
     Students s1=new Students();
     s1.Schoolname="JNV AYODHYA";
     Students s2=new Students();
     System.out.println(s2.Schoolname);
     Students s3=new Students();
     s3.Schoolname="abc";
     System.out.println(s2.Schoolname);
    }
}
class Students{
    String name;
    int roll;
    static String Schoolname;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    //static function
    static int marks(int physics,int chem,int math){
        return(physics+chem+math)/3;
    }
}
