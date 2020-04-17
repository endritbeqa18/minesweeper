import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtonPanel extends JPanel {

    public MyButton[][] buttons;

    public MouseAdapter mouseAdapter;

    Icon flagIcon = new ImageIcon("C:/Users/Besitzer/IdeaProjects/OOP dhe GUI/src/resources/flag.jpg");
    Icon questionmarkIcon = new ImageIcon("C:/Users/Besitzer/IdeaProjects/OOP dhe GUI/src/resources/questionmark.jpg");



    public ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ((MyButton) actionEvent.getSource()).setVisible(false);
            repaint();
        }
    };

    public void buttonPressed(boolean[][] opened)
    {
        for(int i=1; i<opened.length-1; i++)
        {for(int j=1; j<opened.length-1; j++) {

            if(opened[i][j]){buttons[i-1][j-1].setVisible(false);}

    }
        }
        repaint();
        }


    public ButtonPanel(Dimension d, int i, int j,MouseAdapter ma) {
        setPreferredSize(d);
        mouseAdapter=ma;

        setLayout(new GridLayout(i, j));
        buttons = new MyButton[i][j];
        fillButtons();

    }


    public void fillButtons() {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[0].length; j++) {
                MyButton button = new MyButton(i, j);
                buttons[i][j] = button;
               // button.addActionListener(al);
                button.addMouseListener(mouseAdapter);
                add(button);
            }
        }
    }


    public class MyButton extends JButton {
        public int flagOrQuestion=0;
        int i;
        int j;

        public MyButton(int i, int j) {
            this.i = i;
            this.j = j;
        }

    }
}