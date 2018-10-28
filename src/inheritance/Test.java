package inheritance;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Person p = new Person("Asia", "Mielczarek");
        System.out.println(p.toString());

//      możliwość przypisania obiektu do obiektu klasy super

        Student s1 = new Student("Ala", "Kot", "000123");
        Person s2 = new Student("Ola", "Kowalska", "2222");

        System.out.println(s1.toString());

        Teacher t1 = new Teacher("Olo", "Jolo", 999.9f);
        Person t2 = new Teacher("Jan", "Kowalski", 1555f);

        System.out.println(t1.toString());

        ArrayList<Person> people = new ArrayList<>();
        people.add(p);
        people.add(s2);
        people.add(t1);

        for(Person person: people){
            System.out.println(person.toString());
        }

    }
}
