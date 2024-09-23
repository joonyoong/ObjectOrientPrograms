import java.io.*;
import java.util.*;

class guess
{
    public static void main (String [] args)
    {
        // building a scanner to read the keyboard
        Scanner cin;
        cin= new Scanner(System.in);
        int n; 
        n= cin.nextInt();
          
        System.out.println ("***Welcome to the GUESSING GAME!!***");
        System.out.println ("I have a number between 1 and 100.");
        System.out.println ("Can you guess it?");
        System.out.print ("Make a guess please:");
       
        int r;
            r = (int)(1+100*Math.random());
        while(n!=r)
        {
            System.out.print ("Make a guess please:");
            
            if(r == n)
            {
                System.out.println ("You are Correct!");
                i = 10;
            }
            else if (n <r)
            {
                System.out.println ("You are too low dum dum!");
                System.out.println ( "Try again!");
            }
            else if (n > r)
            {
                System.out.println("You are too high get smaller!");
            }
        }
        
    }
}
