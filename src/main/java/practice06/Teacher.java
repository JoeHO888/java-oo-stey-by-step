package practice06;

public class Teacher {

    private int myage;
    private String myname ;
    private int myclass ;

    public Teacher( String name, int age, int class_){
        myage = age;
        myname = name;
        myclass = class_;
    }

    public Teacher( String name, int age){
        myage = age;
        myname = name;
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
        if (myclass !=0) {
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Teacher. I teach Class " + myclass + ".";
        }else{
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Teacher. I teach No Class." ;
        }
    }

}
