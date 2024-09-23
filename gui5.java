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

class gui5 extends JFrame implements ActionListener
{
  JButton gd;
  JTextField le;

  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==gd)
    {
      le.setText("We want to stay forever!");
    }
  }

  public gui5()
  {
    setTitle("GUI5: Yummy buttercake from St. Louis");
    addWindowListener(new dad());
    setSize(700,700);

    // get the content pane
    Container T=getContentPane();

    T.setLayout(new BorderLayout()); // set layout manager

    JPanel judge=new JPanel();
    judge.setLayout(new BorderLayout());
    T.add( judge, "North");
    
    T.add( new JLabel("Bartender"),"Center" );
    gd= new JButton("Get Drink");
    gd.addActionListener(this);
    T.add(gd,"East" );
    T.add( new JTextArea("Help"), "West" );
    T.add( new JTextField("Kiss Kiss"), "South");

    judge.add( new JButton("Self-destruct"), "North");
    judge.add( new JButton("Gavel"),"East");
    judge.add( new JLabel("Night court"),"Center");
    le=new JTextField("We want to finish early.");
    judge.add(le,"South");

    setVisible(true);
  }

  public static void main(String [] args)
  {
    gui5 buttercake=new gui5();
  }
}