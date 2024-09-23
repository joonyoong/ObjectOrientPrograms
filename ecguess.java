import java.io.*;
import java.util.*;

class extraguess
{
    static void insult(int n,int r)
    {
        if(n>r)
        {
            System.out.println ("You are too high");
            System.out.println ( "Try again cheeto!");
        }
        else if(n<r)
        {
          
            System.out.println ("You are too low dum dum!");
            System.out.println ( "Try again!");
        }
        
    }
    public static void main (String [] args)
    {
        // building a scanner to read the keyboard
       
        int n; 
        Scanner cin;
        cin= new Scanner(System.in);
        boolean End;
        End= false;
        
        System.out.println ("***Welcome to the GUESSING GAME!!***");
        System.out.println ("I have a number between 1 and 100.");
        System.out.println ("Can you guess it?");
       
       int r;
            r = (int)(1+100*Math.random());
        while(!End)
        {
            System.out.print ("Make a guess please:");
            n= cin.nextInt();

        if (n == r)
            {
                System.out.println("You are correct!");
                End = true;
            }
        else 
        {
        insult(n,r);
        }
        }
        
    }
}
    


