import java.io.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import java.awt.event.*;
import java.awt.*;

public class JerryTacToe extends JFrame implements ActionListener
{ 
  myPanel panel;
  JLabel jtt;
  Random random = new Random();
  JFrame frame = new JFrame();
  JPanel title_panel = new JPanel();
  JPanel button_panel = new JPanel();
  JLabel textfield = new JLabel();
  JButton[] buttons = new JButton[9];
  boolean player1_turn;
 
  JerryTacToe()
  {
    panel = new myPanel();

    frame.add(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
    frame.getContentPane().setBackground(new Color(25,25,25));
    frame.add(textfield);

    textfield.setText("Jerry-Tac-Toe");
    textfield.setHorizontalTextPosition(JLabel.CENTER);
    textfield.setVerticalTextPosition(JLabel.TOP);
    textfield.setHorizontalAlignment(JLabel.CENTER);
    textfield.setVerticalAlignment(JLabel.TOP);
    textfield.setBackground(Color.DARK_GRAY);
    textfield.setOpaque(true);
    textfield.setForeground(new Color(25,255,0));
    textfield.setFont(new Font("MV Boli",Font.BOLD,50));
    textfield.setBounds(800,0,50,50);
    
    title_panel.setLayout(new BorderLayout(0, 0));
    title_panel.setBounds(0, 0, 400, 100);
    title_panel.add(textfield);


    frame.add(title_panel,BorderLayout.NORTH);

    button_panel.setLayout((new FlowLayout()));
    button_panel.setBounds(0,700, 800, 50);
    
		for(int i=0;i<9;i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,10));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
    }
  


    frame.add(button_panel,BorderLayout.SOUTH);
		frame.add(button_panel);
    frame.add(panel);
    
   
  
    firstTurn();
  }

  public void actionPerformed(ActionEvent e)
   {
		
		for(int i=0;i<9;i++) {
			if(e.getSource()==buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						player1_turn=false;
						textfield.setText("O turn");
						check();
					}
				}
				else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						player1_turn=true;
						textfield.setText("X turn");
						check();
					}
				}
			}			
		}
	}
  public void firstTurn()
  {
    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		if(random.nextInt(2)==0) {
			player1_turn=true;
			textfield.setText("X turn");
		}
		else {
			player1_turn=false;
			textfield.setText("O turn");
		}
	}
  public void check()
  {
    if(
        (buttons[0].getText()== "X") && 
        (buttons[1].getText()== "X") && 
        (buttons[2].getText()== "X")
      )
    {
      player1wins(0,1,2);
    }
    if(
        (buttons[3].getText()== "X") && 
        (buttons[4].getText()== "X") && 
        (buttons[5].getText()== "X")
      )
    {
      player1wins(3,4,5);
    }
    if(
      (buttons[6].getText()== "X") && 
      (buttons[7].getText()== "X") && 
      (buttons[8].getText()== "X")
      )
    {
      player1wins(6,7,8);
    }
    if(
      (buttons[0].getText()== "X") && 
      (buttons[4].getText()== "X") && 
      (buttons[8].getText()== "X")
      )
    {
      player1wins(0,4,8);
    }
    if(
      (buttons[0].getText()== "X") && 
      (buttons[3].getText()== "X") && 
      (buttons[7].getText()== "X")
      )
    {
      player1wins(0,3,7);
    }
    if(
      (buttons[1].getText()== "X") && 
      (buttons[3].getText()== "X") && 
      (buttons[6].getText()== "X")
      )
    {
      player1wins(1,3,6);
    }
    if(
      (buttons[1].getText()== "X") && 
      (buttons[5].getText()== "X") && 
      (buttons[8].getText()== "X")
      )
    {
      player1wins(1,5,8);
    }
    if(
      (buttons[2].getText()== "X") && 
      (buttons[4].getText()== "X") && 
      (buttons[6].getText()== "X")
      )
    {
      player1wins(2,4,6);
    }
    if(
      (buttons[2].getText()== "X") && 
      (buttons[5].getText()== "X") && 
      (buttons[7].getText()== "X")
      )
    {
      player1wins(2,5,7);
    }

      if(
        (buttons[0].getText()== "X") && 
        (buttons[1].getText()== "X") && 
        (buttons[2].getText()== "X")
      )
    {
      player1wins(0,1,2);
    }
    if(
        (buttons[3].getText()== "X") && 
        (buttons[4].getText()== "X") && 
        (buttons[5].getText()== "X")
      )
    {
      player1wins(3,4,5);
    }
    if(
      (buttons[6].getText()== "X") && 
      (buttons[7].getText()== "X") && 
      (buttons[8].getText()== "X")
      )
    {
      player1wins(6,7,8);
    }
    if(
      (buttons[0].getText()== "X") && 
      (buttons[4].getText()== "X") && 
      (buttons[8].getText()== "X")
      )
    {
      player1wins(0,4,8);
    }
    if(
      (buttons[0].getText()== "X") && 
      (buttons[3].getText()== "X") && 
      (buttons[7].getText()== "X")
      )
    {
      player1wins(0,3,7);
    }
    if(
      (buttons[1].getText()== "X") && 
      (buttons[3].getText()== "X") && 
      (buttons[6].getText()== "X")
      )
    {
      player1wins(1,3,6);
    }
    if(
      (buttons[1].getText()== "X") && 
      (buttons[5].getText()== "X") && 
      (buttons[8].getText()== "X")
      )
    {
      player1wins(1,5,8);
    }
    if(
      (buttons[2].getText()== "X") && 
      (buttons[4].getText()== "X") && 
      (buttons[6].getText()== "X")
      )
    {
      player1wins(2,4,6);
    }
    if(
      (buttons[2].getText()== "X") && 
      (buttons[5].getText()== "X") && 
      (buttons[7].getText()== "X")
      )
    {
      player1wins(2,5,7);
    }

      if(
        (buttons[0].getText()== "O") && 
        (buttons[1].getText()== "O") && 
        (buttons[2].getText()== "O")
      )
    {
      player2wins(0,1,2);
    }
    if(
        (buttons[3].getText()== "O") && 
        (buttons[4].getText()== "O") && 
        (buttons[5].getText()== "O")
      )
    {
      player2wins(3,4,5);
    }
    if(
      (buttons[6].getText()== "O") && 
      (buttons[7].getText()== "O") && 
      (buttons[8].getText()== "O")
      )
    {
      player2wins(6,7,8);
    }
    if(
      (buttons[0].getText()== "O") && 
      (buttons[4].getText()== "O") && 
      (buttons[8].getText()== "O")
      )
    {
      player2wins(0,4,8);
    }
    if(
      (buttons[0].getText()== "O") && 
      (buttons[3].getText()== "O") && 
      (buttons[7].getText()== "O")
      )
    {
      player2wins(0,3,7);
    }
    if(
      (buttons[1].getText()== "O") && 
      (buttons[3].getText()== "O") && 
      (buttons[6].getText()== "O")
      )
    {
      player2wins(1,3,6);
    }
    if(
      (buttons[1].getText()== "O") && 
      (buttons[5].getText()== "O") && 
      (buttons[8].getText()== "O")
      )
    {
      player2wins(1,5,8);
    }
    if(
      (buttons[2].getText()== "O") && 
      (buttons[4].getText()== "O") && 
      (buttons[6].getText()== "O")
      )
    {
      player2wins(2,4,6);
    }
    if(
      (buttons[2].getText()== "O") && 
      (buttons[5].getText()== "O") && 
      (buttons[7].getText()== "O")
      )
    {
      player2wins(2,5,7);
    }
  }
  public void player1wins(int a, int b, int c )
  {
    buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("X wins");
    textfield.setText("Player 1 wins");
  }
  public void player2wins(int a, int b, int c )
  {
    buttons[a].setBackground(Color.GREEN);
		buttons[b].setBackground(Color.GREEN);
		buttons[c].setBackground(Color.GREEN);
		
		for(int i=0;i<9;i++) {
			buttons[i].setEnabled(false);
		}
		textfield.setText("O wins");
    textfield.setText("Player 2 wins");
  } 


  public static void main(String [] args)
    {
    JerryTacToe jerrytactoe = new JerryTacToe(); 
    }
}
