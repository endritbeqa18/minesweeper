import javax.swing.*;
import java.awt.*;

public class UpperPanel extends JPanel {
    ImageIcon flag = new ImageIcon("C:/Users/Besitzer/IdeaProjects/OOP dhe GUI/src/resources/flag.jpg");

    public JLabel minat = new JLabel("000");

    public JLabel koha = new JLabel("00:00");
    public JButton reset = new JButton(flag);


    public UpperPanel(Dimension d) {
        setPreferredSize(d);
        setLayout(new GridLayout(1, 3));
        add(minat);
        add(reset);
        add(koha);

    }
}