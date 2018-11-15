package practice09;

public class Student {

    private int myage;
    private String myname;
    private Klass myclass;
    private int id;

    public Student(int id_, String name, int age, Klass class_) {
        myage = age;
        myname = name;
        myclass = class_;
        id = id_;
    }

    public String getName() {
        return myname;
    }

    public int getAge() {
        return myage;
    }

    public Klass getKlass() {
        return myclass;
    }

    public String introduce() {
        if (myclass.getLeader() == this) {
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Student. I am Leader of Class " + myclass.getNumber() + ".";
        } else {
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Student. I am at Class " + myclass.getNumber() + ".";
        }

    }
}
