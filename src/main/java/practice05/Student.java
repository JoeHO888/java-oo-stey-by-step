package practice05;

public class Student {

    private int myage;
    private String myname ;
    private int myclass ;

    public Student( String name, int age, int class_){
        myage = age;
        myname = name;
        myclass = class_;
    }

    public String getName() {
        return myname;
    }

    public int getAge() {
        return myage;
    }

    public int getKlass() {
        return myclass;
    }

    public String introduce() {
        return "My name is "+myname+". I am "+myage+ " years old."+" I am a Student. I am at Class "+myclass+".";
    }

}
