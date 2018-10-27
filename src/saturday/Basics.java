package saturday;

public class Basics {

    public static void main(String[] args) {

        // typy proste - int - 32 bity
        int i;
        i = 13;
        int j = 13;
        long numberOfNothing = 22222L;
        float a = 9.5f;
        double b = 6.5;
        char c = 'c';
        boolean isFun = true;

        System.out.println("Hello World!");

        // konwersja - obojętne, którą zmienną rzutujemy na inny typ

        int firstOne = 5;
        int secondOne = 3;

        System.out.println("Divide 5 by 3: " + (double)firstOne/secondOne);

        // String

        String newOne = "Hi";
        System.out.println(newOne);

        // tablice

        int[] arrayOfInt = {1, 3, 5};
        int[] arrayOfInt2 = new int[3];
        arrayOfInt2[0] = 1;
        System.out.println(arrayOfInt[1]);

        int[][] arrayOfInt3 = new int[3][];
        arrayOfInt3[0] = new int[5];
        arrayOfInt3[1] = new int[3];
        arrayOfInt3[2] = new int[1];
        arrayOfInt3[1][2] = 3;

        // if

        int oneIf = 33;
        if(oneIf%2 == 0){
            System.out.println("yay!");
        } else {
            System.out.println("so sad...");
        }

        if(oneIf > 0 && oneIf < 5){
            System.out.println("too big");
        } else if (oneIf > 30 && oneIf < 35){
            System.out.println("on point");
        } else {
            System.out.println("nada.");
        }

        // instrukcja wyboru

        switch (oneIf){
            case 1:
                System.out.println("1");
                break; // kończy przechodzenie przez warunki
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("something"); // dochodzi do default, jeśli nie pasuje do żadnego innego warunku lub jeśli nie ma break'ów wcześniej
        }

        // pętle

        int k = 0;
        while(k < 10){
            System.out.println(k);
            k++;
        }

        do {
            System.out.println(k);
            k++;
        } while(k < 10);


    }
}


