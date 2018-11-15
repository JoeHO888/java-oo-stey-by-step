package practice03;

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
        return "I am a Worker. I have a job.";
    }

}
