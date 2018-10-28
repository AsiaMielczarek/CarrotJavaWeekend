package inheritance;

public class Student extends Person {

    private String studentId;

    public Student(String name, String surname, String studentId) {
        super(name, surname);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String saySomething(String say) {
        return " Student says " + say;
    }

    @Override
    public String toString(){
        return super.toString() + " " + studentId;
    }


    @Override
    public void speak(String toSpeak) {

    }

    @Override
    public String speaker(String speaker) {
        return "Student " + speaker;
    }
}
