package inheritance;

public interface Speakable {

    String FIELD = "field";     // nazwy pisane jak enumy, z dużych liter, wszystkie są public static final

    void speak(String toSpeak); // metoda zawsze będzie public abstract
    String speaker(String speaker); //
}
