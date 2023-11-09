package calculator;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
public class PanelDesign extends JPanel {
    public static int x=0;
    @Override
    public void paintComponent(Graphics g)
    {
        
        if(x==0)
        {
        super.paintComponent(g);
        //g.setColor(Color.black)ponent(g);
        g.setColor(new Color(23,25,112));
        g.fillOval(0,165, 1000, 1200);
        //g.fillOval(0,165, 1000, 700);
        //g.fillOval(0, 200, 900, 1300);
        }
        if (x==1)
        {
            super.paintComponent(g);
            //g.setColor(Color.white);
        }
    }

}
