package sunday;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalMain {

    public static void main(String[] args) {

        Function<String, Integer> numberOfChars = (text) -> text.length(); // metoda liczenia znaków w stringu - Function przyjmuje jeden typ i zwraca określony inny

        int chars = numberOfChars.apply("Kot ma Alę");
        System.out.println(chars);

        BiFunction<Integer, Integer, Integer> sumOf = (n1, n2) ->  n1 + n2;
        System.out.println(sumOf.apply(2,4));


    }
}
