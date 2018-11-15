package practice05;

public class Person {

    private int myage;
    private String myname ;

    public Person( String name, int age){
        myage = age;
        myname = name;
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
