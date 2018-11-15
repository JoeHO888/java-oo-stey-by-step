package practice07;

public class Teacher {

    private int myage;
    private String myname ;
    private Klass myclass ;

    public Teacher( String name, int age, Klass class_){
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

    public Klass getKlass() {
        return myclass;
    }

    public String introduce() {
        if (myclass !=null) {
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Teacher. I teach "+ myclass.getDisplayName() + ".";
        }else{
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Teacher. I teach No Class." ;
        }
    }

    public String introduceWith(Student student) {
        if (myclass ==student.getKlass()) {
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Teacher. I teach "+student.getName()+ ".";
        }else{
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Teacher. I don't teach "+student.getName()+"." ;
        }
    }

}
