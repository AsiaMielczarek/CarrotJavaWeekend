package saturday;

public class Doggo {

    // projectlombok - biblioteka, która
    // pola
    public String name;
    private int numberOfLegs = 4;

    // zachowania

    public Doggo() { // konstruktor domyślny
        this.numberOfLegs = 4;
    }

    public Doggo(String name) { // konstruktor - inicjalizacja obiektu
        this(); // wywołaj konstruktor bez parametrów
        this.name = name;
    }

    public int getNumberOfLegs() { // getter
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void bark(){ // zachowanie
        System.out.println("Hau hau.");
    }

    public static void sayHau(){
        System.out.println("Hau!");
    }

}
