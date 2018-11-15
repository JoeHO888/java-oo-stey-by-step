package practice09;

public class Person {

    private int myage;
    private String myname ;
    public int id ;


    public Person( int id_,String name, int age){
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

    public String introduce() {
        return "My name is "+myname+". I am "+myage+ " years old.";
    }

}
