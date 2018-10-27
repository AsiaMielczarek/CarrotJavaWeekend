package saturday;

public class StringArrays {

    public static void main(String[] args) {

        String[] arrayOfString = {"Ala", "ma", "kota"};
        int sum = 0;

        for(String word: arrayOfString){
            System.out.println(word.toLowerCase());
            System.out.println(word.length());
            sum += word.length();
        }

        System.out.println(sum);
    }
}
