package practice07;

public class Klass {
    private int num;
    private String displayName;

    public Klass( int number){
        num = number;
    }

    public int getNumber() {
        return num;
    }

    public String getDisplayName() {
        return "Class "+Integer.toString(num);
    }

}
