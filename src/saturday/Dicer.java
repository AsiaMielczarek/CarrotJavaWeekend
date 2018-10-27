package saturday;

import java.util.Arrays;
import java.util.Random;

public class Dicer {

    private int quantity;

    public Dicer(int quantity) {
        this.quantity = quantity;
    }

    public void throwDiceArray(){

        if (quantity > 0 && quantity < 7) {
            Random r = new Random();
            int[] result = new int[quantity];
            for (int i = 0; i < result.length; i++) {
                result[i] = r.nextInt(6) + 1;
            }
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("Podaj liczbę kostek od 1 do 6.");
        }
    }

    public String throwDiceString() {

        if (quantity > 0 && quantity < 7) {
            Random r = new Random();
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < quantity; i++) {
                sb.append(r.nextInt(6) + 1).append(", ");
            }
            sb.delete(sb.lastIndexOf(", "), sb.length());
            sb.append("]");

            return sb.toString();
        }

        return "Podaj liczbę kostek od 1 do 6.";
    }
}
