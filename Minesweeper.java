import javax.swing.*;


public class Minesweeper extends JFrame {


    public Minesweeper(JPanel up,JPanel bp,JPanel p) {
        JFrame frame = new JFrame();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(up);
        frame.add(p);
        frame.add(bp);
                // frame.setComponentZOrder(p,1);
        //frame.setComponentZOrder(bp,0);
        frame.setVisible(true);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
