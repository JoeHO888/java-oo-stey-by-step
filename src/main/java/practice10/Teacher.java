package practice10;

import java.util.LinkedList;

public class Teacher {

    private int myage;
    private String myname ;
    private Klass myclass ;
    private int id;
    private LinkedList mylinkList;
    private String dummyString = "";

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

    public Teacher(int id_, String name, int age, LinkedList linkList){
        myage = age;
        myname = name;
        id = id_;
        mylinkList = linkList;
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
        if (myclass != null && mylinkList == null ) {
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Teacher. I teach " + myclass.getDisplayName() + ".";
        } else if (myclass == null && mylinkList != null ) {
            return "123";
        }else {
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Teacher. I teach No Class.";
        }


    }

    public String introduceWith(Student student) {
        if (myclass ==student.getKlass() || mylinkList.contains((student.getKlass()))) {
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Teacher. I teach "+student.getName()+ ".";
        }else{
            return "My name is " + myname + ". I am " + myage + " years old." + " I am a Teacher. I don't teach "+student.getName()+"." ;
        }
    }

    public LinkedList getClasses(){
        return mylinkList;
    }

    public boolean isTeaching(Student student){
        return mylinkList.contains(student.myclass);
    }

}
