import java.io.*;
import java.util.*;

class age
{
    public static void main (String [] args)
    {
        // building a scanner to read the keyboard
        Scanner cin;
        cin= new Scanner(System.in);

        int years; //age in years
        System.out.print ("How old are you?");
        years = cin.nextInt();

        if(years<60)
        {
            System.out.println ("You are young!"); //print makes it all in one line println makes new line
        }
        else
        {
            System.out.println ("You are old!");
        }

    }
}