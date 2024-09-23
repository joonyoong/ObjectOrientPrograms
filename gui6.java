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

class gui6 extends JFrame implements ActionListener
{
  class art extends JPanel
  {
    public boolean day;

    public art() { day=true; }

    public void night() { day=false; }

    public void paintComponent(Graphics g)
    {
      setSize(1000,800);
      // sky
      if(day) { g.setColor(Color.blue);}
      else { g.setColor(Color.black); }
      g.fillRect(0,0, 1000,800);
      // grass
      g.setColor(Color.green);
      g.fillRect(0,600, 1000,200);
      // house
      g.setColor(Color.magenta);
      g.fillRect(300,300, 400,400);
      // roof
      g.setColor(Color.orange);
      int [] x={275,500,725};
      int [] y={300,250,300};
      g.fillPolygon(x,y,3);
      // sun
      if(day) { g.setColor(Color.yellow); }
      else { g.setColor(Color.white); }
      g.fillOval(750,50, 100,100);
      if(!day)
      {
        g.setColor(Color.black);
        g.fillOval(720,50, 100,100);
      }
    }
  }

  art davinci;
  JButton gd,self;
  JTextField le;

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==gd)
    {
      le.setText("We want to stay forever!");
    }
    if(e.getSource()==self)
    {
      davinci.night();
      davinci.repaint(); // force a screen refresh
    }
  }

  public gui6()
  {
    setTitle("GUI6: Yummy buttercake from St. Louis");
    addWindowListener(new dad());
    setSize(1200,1000);

    // get the content pane
    Container T=getContentPane();

    T.setLayout(new BorderLayout()); // set layout manager

    JPanel judge=new JPanel();
    judge.setLayout(new BorderLayout());
    T.add( judge, "North");
    
    davinci=new art();
    T.add( davinci,"Center" );

    gd= new JButton("Get Drink");
    gd.addActionListener(this);
    T.add(gd,"East" );
    T.add( new JTextArea("Help"), "West" );
    T.add( new JTextField("Kiss Kiss"), "South");

    self= new JButton("Self-destruct");
    judge.add(self, "North");
    self.addActionListener(this);

    judge.add( new JButton("Gavel"),"East");
    judge.add( new JLabel("Night court"),"Center");
    le=new JTextField("We want to finish early.");
    judge.add(le,"South");

    setVisible(true);
  }

  public static void main(String [] args)
  {
    gui6 buttercake=new gui6();
  }
}