package practice07;

public class Student {

    private int myage;
    private String myname ;
    private Klass myclass ;

    public Student( String name, int age, Klass class_){
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

    public Klass getKlass() {
        return myclass;
    }

    public String introduce() {
        return "My name is "+myname+". I am "+myage+ " years old."+" I am a Student. I am at Class "+myclass.getNumber()+".";
    }

}
