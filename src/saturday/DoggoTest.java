package saturday;

public class DoggoTest {

    // static - coś wspólnego dla wszystkich obiektów (kontekst statyczny)

    public static void main(String[] args) {

        Doggo mokka = new Doggo("Mokka");

        mokka.bark();

        System.out.println(mokka.getNumberOfLegs());
        mokka.setNumberOfLegs(3);
        System.out.println(mokka.getNumberOfLegs());

        Doggo.sayHau(); // wywołanie metody statycznej
        mokka.sayHau(); // nie powinno się wywoływać na obiekcie tylko na klasie ^
    }
}
