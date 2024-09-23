import java.io.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import java.awt.event.*;
import java.awt.*;

public class ChemProj extends JFrame{

    myChem panel;
    JFrame frame = new JFrame();
    ChemProj(){

        panel = new myChem();

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(25,25,25));

    }
    public static void main(String [] args)
    {
    ChemProj chemproj = new ChemProj(); 
    }

}