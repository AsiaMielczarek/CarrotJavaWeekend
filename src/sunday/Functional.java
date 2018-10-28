package sunday;

@FunctionalInterface
public interface Functional {

    void method1(); // jedna metoda abstrakcyjna

    default void method2(){ // metoda domyślna (jedna z wielu możliwych)

    }
}
