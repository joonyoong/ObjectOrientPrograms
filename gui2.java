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

class gui2 extends JFrame
{
  public static void main(String [] args)
  {
    gui2 buttercake=new gui2();
    buttercake.setTitle("GUI2: Yummy buttercake from St. Louis");
    buttercake.addWindowListener(new dad());
    buttercake.setSize(700,700);
    buttercake.setVisible(true);
  }
}