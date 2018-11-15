package practice10;

public class Teacher {

    private int myage;
    private String myname ;
    private Klass myclass ;
    private int id;

    public Teacher( int id_,String name, int age, Klass class_){
        myage = age;
        myname = name;
        myclass = class_;
        id = id_;
    }

    public Teacher( int id_, String name, int age){
        myage = age;
        myname = name;
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
