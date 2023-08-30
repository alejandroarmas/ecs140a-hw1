package src;


public abstract class AbstractStudent {

    public String first_name;
    public String last_name;
    protected int id;
    protected int age;
    protected int credits_enrolled;

    public AbstractStudent(String first, String last, int _id, int _age, int credits) {
        this.first_name = first;
        this.last_name = last;
        this.age = _age;
        this.id = _id;
        this.credits_enrolled = credits;
    }

    abstract public int computeFees();
    abstract public void printData();
}
