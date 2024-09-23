import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class dad extends WindowAdapter
{
  public void windowClosing(WindowEvent e)
  {
    System.out.println("Dad is closing the window.");
    System.exit(0); // stop the program
  }
}

class gui7 extends JFrame implements ActionListener
{
  class fish
  {
    int x,y;
    int size;
    Color color;

    public fish(int xin,int yin,int sizein,Color colorin)
    {
      x=xin; y=yin; size=sizein; color=colorin;
    }

    public void swim()
    {
      x=x+5+size/8;
      if(x>1200) { x= -size; }
    }

    public void morph()
    {
      color=
          new Color(
            (int)(256*Math.random()),
            (int)(256*Math.random()),
            (int)(256*Math.random())
          );
    }

    public void draw(Graphics g)
    {
      // draw a fish!!!
      g.setColor(color);
      g.fillOval(x,y, size,size/3);
      int [] xtail={x-4,x-4,x+size/2};
      int [] ytail={y-3,y+3+size/3,y+size/6};
      g.fillPolygon(xtail,ytail,3);

      int eyex=x+3*size/4;
      int eyey=y+size/10;
      int eyesize=12+size/10;
      g.setColor(Color.white);
      g.fillOval(eyex,eyey,eyesize,eyesize);
      g.setColor(Color.black);
      g.fillOval(eyex+5,eyey+5,eyesize-10,eyesize-10);
    }
  }
  class ocean extends JPanel
  {
    fish [] school;

    public ocean()
    {
      school=new fish[25];
      for(int i=0; i<school.length; i++)
      {
        school[i]=new fish(
          (int)(1200*Math.random()), // x
          (int)(900*Math.random()), // y
          50+(int)(200*Math.random()), // size
          new Color(
            (int)(256*Math.random()),
            (int)(256*Math.random()),
            (int)(256*Math.random())
          )
        );
      }
    }

    public void swim()
    {
      for(int i=0; i<school.length; i++)
        { school[i].swim(); }
    }

    public void morph(int i)
    {
      school[i].morph();
    }

    public void paintComponent(Graphics g)
    {
      setSize(1200,900);
      g.setColor(Color.blue);
      g.fillRect(0,0, 12000,900);

      for(int i=0; i<school.length; i++)
        { school[i].draw(g); }
    }
  }

  ocean pacific;
  JButton swim,morph;
  JTextField tf;

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==swim)
    {
      pacific.swim();
      pacific.repaint();
    }
    if(e.getSource()==morph)
    {
      int i=Integer.parseInt(tf.getText());
      pacific.morph(i);
      pacific.repaint();
    }
  }

  public gui7()
  {
    setTitle("GUI7: The Pacific");
    addWindowListener(new dad());
    setSize(1200,1000);

    // get the content pane
    Container T=getContentPane();

    T.setLayout(new BorderLayout()); // set layout manager

    JPanel control=new JPanel();
    control.setLayout(new BorderLayout());

    swim=new JButton("Swim");
    swim.addActionListener(this);
    morph=new JButton("Change Color");
    morph.addActionListener(this);
    tf=new JTextField("0");

    control.add(morph,"East" );
    control.add(swim, "West" );
    control.add( tf, "Center");

    pacific=new ocean();
    T.add( control, "South");
    T.add( pacific,"Center" );

    setVisible(true);
  }

  public static void main(String [] args)
  {
    gui7 aquarium=new gui7();
  }
}