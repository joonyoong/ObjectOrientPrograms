import java.io.*;
import java.util.*;

class SortedListMain
{
  public static void main(String [] args)
  throws IOException
  {
    Scanner fishfile=new Scanner(new FileReader("fishfile.txt"));
    int n=fishfile.nextInt();

    SortedList L=new SortedListLLR();

    for(int i=0; i<n; i++)
    {
      L.insert(new Fish(fishfile));
    }
    System.out.println("list size="+L.size());
    System.out.println("is list full="+L.isFull());
    System.out.println("is list empty="+L.isEmpty());

    for(int i=0; i<L.size(); i++)
      { System.out.println(L.get(i)); }

    Fish key=new Fish("","","",5);
    Fish answer=(Fish)L.lookup(key);
    if(answer!=null)
      System.out.println("We looked up this: "+answer);
    else
      System.out.println("No such fish.");
  }
}
