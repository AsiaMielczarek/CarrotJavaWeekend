package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    public MyFrame(){ // tu inicjalizujemy naszego frame'a
        super("My frame"); // wywołanie konstruktora JFrame, tytuł (pasek na górze)

        setDefaultCloseOperation(EXIT_ON_CLOSE); // zakończenie działania programu wraz z X

        setSize(300, 300); // ustalenie wielkości

        JButton btn = new JButton("ok"); // String - wartość przycisku
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Click");
            }
        });

        JButton btn1 = new JButton("nope"); // String - wartość przycisku

        JPanel panel = new JPanel(new GridLayout(2,2)); // panel domyślnie jest siatką
        panel.add(btn);
        panel.add(btn1);
        panel.add(new JLabel("etykieta"));

//        add(btn, BorderLayout.NORTH); // dodanie przycisku, BorderdLayout (i wiele innych) do ustawiania elementów, jes
        add(panel);


        setVisible(true); // widoczność okienka, zawsze na końcu
    }

}
