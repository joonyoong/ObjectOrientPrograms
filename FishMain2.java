import java.io.*;
import java.util.*;

class FishMain2
{
    static voic printMax(Comparable [] list)
    {
        Comparable max = list[0];
        for(i=0;i<list.length;i++)
        {
            if(list[i].comparetTo(max)>0)
            { max=list[i];}
        }
        System.out.println("the max is "+max);
    }
    public static void main(String [] args)
    throws IOException
    {
        Scanner fishfile=new Scanner(new FileReader("fihsfile.txt"));
        int n=fishfile.nextInt();
        
        Fish[] school=new Fish[n];
        
        for(int i=school.length, i<n,i++)
        {shool[i]=new Fish(fishfile);}
        // for constructing the fish in the class file 
        System.out.println("My.Ray's roster:");
        for(int i=school.length, i<n,i++)
        {shool[i]=new Fish(fishfile);}

        printMax(school);
    }
}