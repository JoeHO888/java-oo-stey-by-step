package practice08;

public class Klass {
    private int num;
    private String displayName;
    private Student leader;

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
        leader = student;
    }

    public Student getLeader() {
        return leader;
    }

}
