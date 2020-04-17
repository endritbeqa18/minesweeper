import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;

public class PaintPanel extends JPanel {

    Font f= new Font("Times New Roman",Font.BOLD,70);
    private BufferedImage image;
    int[][] grid;
    boolean[][] opened;


    { try{image= ImageIO.read(getClass().getResource("/resources/mine.png"));}
    catch(Exception e){ e.printStackTrace();}}

    public void setGrid(int[][] a)
    {
        grid=a;
    }

    public void paintComponent(Graphics g)
    {Graphics2D g2=(Graphics2D)g;
      g2.setColor(Color.BLUE);
      g2.setFont(f);
        for(int i=1; i<grid.length-1; i++)
        {for(int j=1; j<grid.length-1; j++) {
            int x=(i-1)*50;
            int y=(j)*50;
            switch(grid[i][j])
            {

                case(-1):{g2.drawImage(image,x,y-50,null); break;}
                case(1):{g.drawString("1",x,y); break;}
                case(2):{g.drawString("2",x,y); break;}
                case(3):{g.drawString("3",x,y); break;}
                case(4):{g.drawString("4",x,y); break;}
                case(5):{g.drawString("5",x,y); break;}
                case(6):{g.drawString("6",x,y); break;}

            }
          }
         }
    }


public PaintPanel(int i,int j,Dimension d,int[][] grid)
{
    setGrid(grid);
    setPreferredSize(d);
}



}
