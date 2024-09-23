import java.io.*;
import java.util.*;

class QueueMain
{
  public static void main(String [] args)
  throws IOException
  {
    Scanner fishfile=new Scanner(new FileReader("fishfile.txt"));
    int n=fishfile.nextInt();

    //Queue Q=new QueueDonut(100);
    Queue Q=new QueueLL();

    for(int i=0; i<n; i++)
    {
      Q.enqueue(new Fish(fishfile));
    }
    System.out.println("Queue size="+Q.size());
    System.out.println("Queue front="+Q.getFront());
    System.out.println("is Queue full="+Q.isFull());
    System.out.println("is Queue empty="+Q.isEmpty());

    ((Fish)Q.getFront()).sharkAttack();

    while(!Q.isEmpty())
    {
      System.out.println("Dequeueing: "+Q.dequeue());
    }
    System.out.println("Queue size="+Q.size());
    System.out.println("Queue front="+Q.getFront());
    System.out.println("is Queue full="+Q.isFull());
    System.out.println("is Queue empty="+Q.isEmpty());

  }
}

