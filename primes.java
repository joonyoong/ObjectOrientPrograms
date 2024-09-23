import java.io.*;
import java.util.*;

class primes
{
    public static void main (String [] args)
    {
        // building a scanner to read the keyboard
        Scanner cin;
        cin= new Scanner(System.in);
        
        int n; 
        System.out.print ("Enter a number please:");
        n= cin.nextInt();
        boolean isprime=true; 
        // loop to check for divisors
        for(int d=2; d<n; d++)
        {
            //check to see if d divides n
            // n%d for the remainder from n/d
            if(n%d == 0) // then d divides n
            {
                isprime=false;
            }
        }
            if(isprime && n>1)
            {
                System.out.println("PRIME!");
            }
            else
            {
                System.out.println("Not prime.");
            }
   }
}
