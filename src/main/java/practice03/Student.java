package practice03;

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
        return "I am a Student. I am at Class "+myclass+".";
    }

}
