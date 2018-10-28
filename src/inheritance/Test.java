package inheritance;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

//        Person p = new Person("hi", "c") {
//            @Override
//            public String saySomething(String say) {
//                return "Wewnętrzna klasa says " + say;
//            }
//        };

        // anonimowa klasa wewnętrzna

        Speakable speakable = new Speakable() {
            @Override
            public void speak(String toSpeak) {

            }

            @Override
            public String speaker(String speaker) {
                return null;
            }
        }; // ; średnik jako koniec definicji zmiennej

//      System.out.println(p.toString());

//      możliwość przypisania obiektu do obiektu klasy super

        Student s1 = new Student("Ala", "Kot", "000123");
        Person s2 = new Student("Kasia", "Kowalska", "2222");

        System.out.println(s1.toString() + s1.saySomething("yo"));

        Teacher t1 = new Teacher("Olo", "Jolo", 999.9f);
        Person t2 = new Teacher("Jan", "Kowalski", 1555f);

        System.out.println(t1.toString() + t1.saySomething("Good morning"));

        ArrayList<Person> people = new ArrayList<>();
//      people.add(p);
        people.add(s2);
        people.add(t1);

        for(Person person: people){
            System.out.println(person.toString() + person.saySomething("Hi! I'm " + person.getName()));
        }

        // /n nowa linia
        ArrayList<Speakable> speakables = new ArrayList<>();
        speakables.add(s1);
        speakables.add(t2);

        for(Speakable speaker: speakables){
            System.out.println(speaker.speaker("Hello!"));
        }
    }
}
