public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student("Shyam kab aaoge");
        System.out.println(s1.name);
    }
}
class Student{
    String name;
    int rollnum;
    Student(String name){
        this.name=name;
    }
}
