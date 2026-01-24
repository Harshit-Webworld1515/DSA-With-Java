public class Acessmodferoops {
    public static void main(String[] args) {
        Bankaccount  myacc=new Bankaccount();
        myacc.username="harshit tiwari";
        System.out.println(myacc.username);
        myacc.setpassword("asdfghjkl");       
    }
}
class Bankaccount{
public String username;
 private String password;
 public void setpassword(String pwd){
    password=pwd;
    System.out.println(password);
 }
}
