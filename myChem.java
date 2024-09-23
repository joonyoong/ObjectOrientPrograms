import java.io.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.*;

public class myChem extends JPanel{
    myChem(){
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        //body
        g2D.setPaint(new Color(212,175,55));
        g2D.fillRect(175, 110, 125 , 250);
        g2D.setPaint(Color.BLACK);
        g2D.drawRect(175, 110, 126 , 251);
        //face
        g2D.setPaint(new Color(212,175,55));
        g2D.fillOval(160, 0, 150 , 150);
        g2D.setPaint(Color.BLACK);
        g2D.drawOval(160, 0, 150, 150);
          //helmet
          g2D.setPaint(Color.BLACK);
          g2D.drawArc(175, 20, 120, 20, 0, 180);
        //nose
        g2D.setPaint(Color.BLACK);
        g2D.drawArc(230, 70, 10, 20, 210, 90);
        //mouth 
        g2D.setPaint(Color.BLACK);
        g2D.drawArc(220, 100, 40, 10, 180, 180);
        //eye
        g2D.setPaint(Color.BLACK);
        g2D.fillOval(210, 50, 20 , 10);
        g2D.setPaint(Color.BLACK);
        g2D.fillOval(250, 50, 20 , 10);
        //arm left
        g2D.setPaint(Color.BLACK);
        g2D.drawArc(175, 150, 40, 100, 210, 90);

        g2D.setPaint(Color.BLACK);
        g2D.drawArc(175, 140, 40, 100, 210, 90);
        //arm right

        g2D.setPaint(Color.BLACK);
        g2D.drawArc(245, 135, 40, 100, 270, 90);

        g2D.setPaint(Color.BLACK);
        g2D.drawArc(250, 145, 40, 100, 270, 90);
        //hands left
        g2D.setPaint(Color.BLACK);
        g2D.drawRect(210, 230,10,5);
        g2D.setPaint(Color.BLACK);
        g2D.drawRect(210, 235,10,5);
        g2D.setPaint(Color.BLACK);
        g2D.drawRect(210, 240,10,5);
        //hands right
        g2D.setPaint(Color.BLACK);
        g2D.drawRect(250, 230,10,5);
        g2D.setPaint(Color.BLACK);
        g2D.drawRect(250, 235,10,5);
        g2D.setPaint(Color.BLACK);
        g2D.drawRect(250, 240,10,5);
        //legs
        g2D.setPaint(new Color(212,175,55));
        g2D.fillRect(175, 360, 40 , 100);
        g2D.setPaint(Color.BLACK);
        g2D.drawRect(175, 360, 41 , 101);

        g2D.setPaint(new Color(212,175,55));
        g2D.fillRect(260, 360, 40 , 100);
        g2D.setPaint(Color.BLACK);
        g2D.drawRect(260, 360, 41 , 101);
        //feet
        g2D.setPaint(new Color(212,175,55));
        g2D.fillOval(260, 460, 45 , 10);
        g2D.setPaint(Color.BLACK);
        g2D.drawOval(260, 460, 45 , 10);

        g2D.setPaint(new Color(212,175,55));
        g2D.fillOval(175, 460, 45 , 10);
        g2D.setPaint(Color.BLACK);
        g2D.drawOval(175, 460, 45 , 10);
      

    }
}