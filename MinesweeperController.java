import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MinesweeperController {

    public MouseAdapter ma = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {

            if (e.getButton() == java.awt.event.MouseEvent.BUTTON3) {

                switch (((ButtonPanel.MyButton)e.getSource()).flagOrQuestion)
                {
                    case(0):{ ((ButtonPanel.MyButton)e.getSource()).setIcon(buttonPanel.flagIcon);
                        ((ButtonPanel.MyButton)e.getSource()).flagOrQuestion++; buttonPanel.repaint(); break;}

                    case(1):{ ((ButtonPanel.MyButton)e.getSource()).setIcon(buttonPanel.questionmarkIcon);
                        ((ButtonPanel.MyButton)e.getSource()).flagOrQuestion++; buttonPanel.repaint(); break;}

                    case(2):{ ((ButtonPanel.MyButton)e.getSource()).setIcon(null);
                        ((ButtonPanel.MyButton)e.getSource()).flagOrQuestion=0; buttonPanel.repaint(); break;}

                }
            }
            if(e.getButton()== MouseEvent.BUTTON1){
                buttonPanel.buttonPressed(model.squareClicked(((ButtonPanel.MyButton)e.getSource()).i+1,((ButtonPanel.MyButton)e.getSource()).j+1));
            }
        }

    };


Dimension d= new Dimension(500,500);


    public MinesweeperModel model= new MinesweeperModel(10,10,10);
    ButtonPanel buttonPanel= new ButtonPanel(d,10,10,ma);
    UpperPanel upperPanel= new UpperPanel(new Dimension(500,100));
    public PaintPanel paintPanel= new PaintPanel(10,10,d,model.getGrid());
    {paintPanel.repaint();}

    public JPanel ZorderPanel= new JPanel();
    {
     ZorderPanel.setLayout(null);
     ZorderPanel.add(paintPanel);
     ZorderPanel.add(buttonPanel);
    }


    public Minesweeper mineview= new Minesweeper(upperPanel,buttonPanel,paintPanel);




public static void main(String[] args)
{
   MinesweeperController m= new MinesweeperController();
}


}
