package sunday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Asia", "Bartek", "Zosia", "Wojtek");
        List<String> filtered = new ArrayList<>();

        for(String name: names){
            if(name.startsWith("A")){
                filtered.add(name.toUpperCase());
            }
        }

        System.out.println(filtered);

        List<String> lambdaFiltered = names
                .stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase) // metoda r
                .collect(Collectors.toList());

        System.out.println(lambdaFiltered);
    }
}
