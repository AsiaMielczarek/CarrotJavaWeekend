package sunday;

import javax.swing.*;

public class LambdaTest {

    public static void main(String[] args) {

        JButton btn = new JButton("Text");

        // stary zapis
        btn.addActionListener(
                (actionEvent) -> { // implementacja ActionListenera
                    System.out.println("Click");
                });

        // nowy zapis
        btn.addActionListener(actionEvent -> System.out.println("Click")); // skrócony zapis powyższej wersji

        // stary zapis
        Functional fun = new Functional() {
            @Override
            public void method1() {
                System.out.println("1");
                System.out.println("2");
            }
        };
        fun.method1();

        // zapis z lambdą
        Functional lambdaFun = () -> { // jeśli metoda nie przyjmuje żadnych parametrów musi być ()
            System.out.println("1");
            System.out.println("2");
        };
        lambdaFun.method1();
    }
}
