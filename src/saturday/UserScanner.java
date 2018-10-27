package saturday;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserScanner {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // wejście do skanera '.in'

        try {
            System.out.println("Podaj liczbę do podzielenia: ");
            int firstFromUser = sc.nextInt();

            System.out.println("Podaj dzielnik:");
            int secondFromUser = sc.nextInt();

            if (secondFromUser != 0) {
                System.out.println("Wynik dzielenia: " + (double) firstFromUser / secondFromUser);
            } else {
                System.out.println("Nie możesz dzielić przez 0");
            }
        } catch (InputMismatchException e){
            System.out.println("Podaj liczbę!");
        }

        sc.close();
    }

}
