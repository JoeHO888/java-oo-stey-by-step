package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int num;
    private String displayName;
    private Student leader;
    private List<Student> classList = new ArrayList<>();

    public Klass( int number){
        num = number;
    }

    public int getNumber() {
        return num;
    }

    public String getDisplayName() {
        return "Class "+Integer.toString(num);
    }

    public void assignLeader(Student student) {
        if (classList.contains(student)){leader = student;}
        else{
            System.out.print("It is not one of us.\n");
        }

    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        classList.add(student);
    }

}