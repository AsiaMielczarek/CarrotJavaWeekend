package inheritance;

public class Teacher extends Person {

    private float salary;

    public Teacher(String name, String surname, float salary) {
        super(name, surname);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String saySomething(String say) {
        return " Teacher says " + say;
    }

    @Override
    public String toString(){
        return super.toString() + " " + salary;
    }

    @Override
    public void speak(String toSpeak) {

    }

    @Override
    public String speaker(String speaker) {
        return "Teacher " + speaker;
    }
}
