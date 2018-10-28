package sunday;

import java.io.*;

public class FileStreamMain {

    public static void main(String[] args) {

        // strumienie bajtowe

//        // dłuższa wersja (starsza)
//        FileOutputStream out = null;
//        try {
//            out = new FileOutputStream("text.txt");
//            out.write("Hello World!".getBytes());
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        } finally {
//            if (out != null) {
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        // wersja dostępna od javy7
//        try (FileOutputStream out1 = new FileOutputStream("text1.txt")){
//            out1.write("Hi!".getBytes());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (FileInputStream input = new FileInputStream("text.txt")) {
//            int b = input.read();
//            while(b != -1){
//                System.out.print((char) b);
//                b = input.read();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e){
//            e.printStackTrace();
//        }

        // FileReader i FileWriter - strumienie znakowe

        // BufferedReader i BufferedWriter strumienie buferowane

        try (PrintWriter out1 = new PrintWriter(new FileWriter("text2.txt"))) {
            out1.println("Hello");
        } catch (IOException e){
            e.printStackTrace();
        }

        try (BufferedReader in = new BufferedReader(new FileReader("text2.txt"))) {
            String line = null;
            while((line = in.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
