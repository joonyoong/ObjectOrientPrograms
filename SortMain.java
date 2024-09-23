import java.io.*;
import java.util.*;

/*
To make the built-in Comparable interface work:
1. Delete Comparable.class
2. Rename or hide Comparable.java
3. Recompile any code that uses the Comparable interface
*/

class SortMain
{
  public static Integer [] randomlist(int n)
  {
    Integer [] list=new Integer[n];
    for(int i=0; i<list.length; i++)
      { list[i]=new Integer((int)(n*Math.random())); }
    return list;
  }

  public static void main(String [] args)
  throws IOException
  {
    Integer [] list=randomlist(100);

    System.out.println("Original:");
    for(int i=0; i<list.length; i++)
      { System.out.print(list[i]+" "); }
    System.out.println("");

    Sorts.merge(list);
   
    System.out.println("Sorted:");
    for(int i=0; i<list.length; i++)
      { System.out.print(list[i]+" "); }
    System.out.println("");
/*
    Scanner fishfile=new Scanner(new FileReader("fishfile.txt"));
    int n=fishfile.nextInt();

    Fish [] school=new Fish[n];

    for(int i=0; i<school.length; i++)
    {
      school[i]=new Fish(fishfile);
    }

    System.out.println("Mr. Ray's roster:");
    for(int i=0; i<school.length; i++)
    {
      System.out.println(i+" "+school[i]);
    }

    Sorts.insertion(school,2,1);

    System.out.println("Mr. Ray's roster:");
    for(int i=0; i<school.length; i++)
    {
      System.out.println(i+" "+school[i]);
    }
*/

  }
}









