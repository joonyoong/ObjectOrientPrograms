import java.io.*;
import java.util.*;

class eraFile

{
    public static void main(String[]args)
    throws IOException
    {
        int n;
        System.out.print("Enter you prime limit number please:");
        Scanner cin =new Scanner(System.in);
        n=cin.nextInt();
        
        //setting up an array
        boolean[] notlame;
        notlame=new boolean[n+1];
        notlame[0]=notlame[1]=false;
        for(int i =2;i<notlame.length;i++)
        {
            notlame[i]=true;
        }
        //crossing off part
        for(int p =2; p<=Math.sqrt(n);p++)
        {
            if(notlame[p])//make sure that p hasn't been  crossed off
            {
                for(int q=2*p;q<=n;q=q+p)
                {
                    notlame[q]=false;
                }
            }
        }
        PrintWriter outfile;
        outfile=new PrintWriter(new FileWriter("primes.txt"));
        //list the primes
        for(int i=2; i<notlame.length;i++)
        {
            if(notlame[i])
            {
                outfile.print(i+" ");
            }
        }
        outfile.println(" ");

        outfile.close();
    }
}