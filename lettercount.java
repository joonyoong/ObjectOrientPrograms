import java.io.*;
import java.util.*;

class LetterCount
{
    static int numEs(String s)
    {
        int cnt= 0;
        for(int i =0; i<s.length();i++)
        {
            char letterthashere= charAt(i);
            if(letterthashere == 'E'|| letterthashere == 'e')
            { cnt++; }
        }
        return cnt;
    }
    public static void main (String [] args)
    throws IOException
    {
        String line, filename;
        Scanner cin=new Scanner(System.in);
        System.out.print("please enter some text:");
        filename = cin.nextLine();

        Scanner Harold;
        Harold=new Scanner(new FileReader(filename));


        int count = 0;
        while(Harold.hasNext())
        {
            line=Harold.nextLine();
            count= count+numEs(line);
        }
        System.out.println("There aere "+count+" Es in your text. ");
    }       
}