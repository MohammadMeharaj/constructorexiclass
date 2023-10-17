import java.util.Scanner;
    public class Studentcons
    {
        private int rollno;
        private String name;
    //creating default constructor
    public Studentcons() {
        rollno=12;
        name="JOHN";
    }
    //parameterized constructor
    public Studentcons(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
}
public static void main(String[]args){
    Studentcons s1 = new Studentcons();//default
    Studentcons s2 = new Studentcons(13,"IBRAHIM");//parameterized
    //accessing prop
    System.out.println("s1:rollno="+s1.rollno+",name="+s1.name);
    System.out.println("s2:rollno="+s2.rollno+",name="+s2.name);
}
}
