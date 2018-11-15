package practice05;

public class Worker {

    private int myage;
    private String myname ;

    public Worker( String name, int age){
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
        return "My name is "+myname+". I am "+myage+ " years old."+" I am a Worker. I have a job.";
    }

}
