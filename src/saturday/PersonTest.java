package saturday;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person("Asia");
        Person p2 = new Person("Ania", "Kowalska", 26, Gender.FEMALE);
        Person p3 = new Person("Ania", "Kowalska", 26, Gender.FEMALE);
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
    }
}
