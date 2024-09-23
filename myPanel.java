import java.io.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.*;

public class myPanel extends JPanel{
    myPanel(){
        this.setPreferredSize(new Dimension(800,800));
    }
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
       
        //lines of the board row 1
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(75,120,425,120);

        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(150,275,350,275);

        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(70,420,425,420);
        //diagonal lines from circle 1
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(75,120,425,420);

        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(75,120,240,420);

        //diagonal lines from circle 2
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(245,120,420,420);

        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(245,120,85,420);

         //diagonal lines from circle 3
         g2D.setStroke(new BasicStroke(5));
         g2D.drawLine(420,120,240,420);
 
         g2D.setStroke(new BasicStroke(5));
         g2D.drawLine(420,120,85,420);
 

        //circles on the board row 1
        g2D.setPaint(Color.BLUE);
        g2D.fillOval(50 , 100, 50, 50);

        g2D.setPaint(Color.BLUE);
        g2D.fillOval(225 , 100, 50, 50);

        g2D.setPaint(Color.BLUE);
        g2D.fillOval(400 , 100, 50, 50);
        //circles on the board row 2
        g2D.setPaint(Color.BLUE);
        g2D.fillOval(125 , 250, 50, 50);

        g2D.setPaint(Color.BLUE);
        g2D.fillOval(225 , 250, 50, 50);

        g2D.setPaint(Color.BLUE);
        g2D.fillOval(325 , 250, 50, 50);
        //circles on the board row 3
        g2D.setPaint(Color.BLUE);
        g2D.fillOval(50 , 400, 50, 50);

        g2D.setPaint(Color.BLUE);
        g2D.fillOval(225 , 400, 50, 50);

        g2D.setPaint(Color.BLUE);
        g2D.fillOval(400 , 400, 50, 50);

        //label numbers row 1
        g2D.setPaint(Color.BLACK);
        g2D.setFont((new Font("MV Boli",Font.BOLD,25)));
        g2D.drawString("1", 65,130);

        g2D.setPaint(Color.BLACK);
        g2D.setFont((new Font("MV Boli",Font.BOLD,25)));
        g2D.drawString("2", 240,130);

        g2D.setPaint(Color.BLACK);
        g2D.setFont((new Font("MV Boli",Font.BOLD,25)));
        g2D.drawString("3", 415,130);

        //label numbers row 2
        g2D.setPaint(Color.BLACK);
        g2D.setFont((new Font("MV Boli",Font.BOLD,25)));
        g2D.drawString("4", 140,280);

        g2D.setPaint(Color.BLACK);
        g2D.setFont((new Font("MV Boli",Font.BOLD,25)));
        g2D.drawString("5", 240,280);

        g2D.setPaint(Color.BLACK);
        g2D.setFont((new Font("MV Boli",Font.BOLD,25)));
        g2D.drawString("6", 340,280);    
        
         //label numbers row 3
         g2D.setPaint(Color.BLACK);
         g2D.setFont((new Font("MV Boli",Font.BOLD,25)));
         g2D.drawString("7", 65,430);
 
         g2D.setPaint(Color.BLACK);
         g2D.setFont((new Font("MV Boli",Font.BOLD,25)));
         g2D.drawString("8", 240,430);
 
         g2D.setPaint(Color.BLACK);
         g2D.setFont((new Font("MV Boli",Font.BOLD,25)));
         g2D.drawString("9", 415,430);
    }
}

