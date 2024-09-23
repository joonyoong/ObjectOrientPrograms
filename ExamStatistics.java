import java.io.*;
import java.util.*;
class ExamStatistics
{
    
    static void high(double [] grades,int count)
    {
        double max=0;
        for(int i=0; i<grades.length;i++)
        {
            if(grades[i]>max)
            {
                max=grades[i];
            }
        }
        System.out.println("Maximum Score: " +max);

    }
    static void low(double [] grades,int count)
    {
        double min=200;
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]<min)
            {
                min=grades[i];
            }
        }
        System.out.println("Minimum Score: " +min);
    }
    static void average(double [] grades,int count)
    {
        double avg=0;
        double sumofgrades=0;
        for(int i=0;i<grades.length;i++)
        {
            sumofgrades=sumofgrades+grades[i];
        }
        avg=sumofgrades/count;
        System.out.println("Average Score: " +avg);
    }
    static void cntLG(double [] grades,int count)
    {
        int [] gradeCounts ={0,0,0,0,0};
        for(int i=0;i < grades.length;i++)
	{	
		if(grades[i] >= 90)
		{
			gradeCounts[0] ++;
		}
		else if(grades[i] >= 80)
		{
			gradeCounts[1] ++;
		}		
		else if(grades[i] >= 70)
		{
			gradeCounts[2] ++;
		}	
		else if(grades[i] >= 60)
		{
			gradeCounts[3] ++;
		}		
		else 
		{
			gradeCounts[4] ++;
		}	
	}
        System.out.println("Number of scores by letter grade: ");
        System.out.println("Number of A's: " +gradeCounts[0]);
        System.out.println("Number of B's: " +gradeCounts[1]);
        System.out.println("Number of C's: " +gradeCounts[2]);
        System.out.println("Number of D's: " +gradeCounts[3]);
        System.out.println("Number of F's: " +gradeCounts[4]);
    }
    static void median(double [] grades,int count)
    {
        
        for(int i=0;i<grades.length;i++)
        {
            if(grade[i])
        }
    }
    public static void main (String [] args)
    throws IOException
    {
        System.out.print(" ***Welcome to the Exam Statistics Program!!*** ");
        String line, filename;
        Scanner cin= new Scanner(System.in);
        System.out.print("Please enter the name of your data file:");
        filename=cin.nextLine();
        
        Scanner fileopener=new Scanner(new FileReader(filename));

        int n =fileopener.nextInt();
        
        double [] grades;
        grades=new double[n];

        int count =0;
        for(int i=0; i<grades.length; i++)
        {
            grades[i]= (fileopener.nextInt());
            count ++;
        }
        
        average(grades,count);
        high(grades,count);
        low(grades,count);
        cntLG(grades,count);
        median(grades,count);

        System.out.println("There are "+count+" scores.");
        
        
    }
}