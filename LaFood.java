import java.io.*;
import java.util.*;
// La Food Main
// 3/17/23
// JunyeongShin
public class LaFood
{
  public static void main(String [] args)
  throws IOException
  {  
        System.out.println("*** Welcome to the La Food Restaurant Simulator ***");
        
        // get a string/line of text from the user
		String line, filename;
		Scanner cin=new Scanner(System.in);
		System.out.print("Please enter a filename: ");
		filename=cin.nextLine();

        Queue waitingParties = new QueueLL();
        Queue availableTables = new QueueLL();
        
        // Read data from file and add parties to waiting queue
        try {
            Scanner file = new Scanner(new File(filename));

            while (file.hasNext()) 
            {
                String type = file.next();
                if (file.hasNextInt()) { 
                    int time = file.nextInt();
                if (type.equals("A")) 
                
                {
                    int size = file.nextInt();
                    String name = file.nextLine().trim();
                    waitingParties.enqueue(new Party(name, size, time));
                } 
                
                else if (type.equals("T")) {
                    availableTables.enqueue(new Table(time));
                }
            }
        }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            System.exit(1);
        }
        
        
        // Simulate seating parties and measuring waiting times
        int time = 0;
        int totalWait = 0;
        int numSeated = 0;
        while (!waitingParties.isEmpty() && time < 100)
         {
            // Check if any table becomes available
            while (!availableTables.isEmpty() && !waitingParties.isEmpty()) {
                Table table = (Table) availableTables.dequeue();
                Party party = (Party) waitingParties.dequeue();
                System.out.println("Table for "+party.name+"! (time="+party.arrivalTime+")");
                totalWait +=  party.arrivalTime- time;
                numSeated++;
                
            }
            // Check if any new party arrives
            while (!waitingParties.isEmpty() && ((Party) waitingParties.getFront()).arrivalTime == time) {
                
                Party party = (Party) waitingParties.dequeue();
                
                System.out.println("Please wait at the bar,"+party.name+"  party of "+party.size+" people. (time="+party.arrivalTime+")");
            time++;
        }
        
        
        // Print results
        System.out.println("** Simulation Terminated **");
        if (numSeated == 0) {
            System.out.println("No parties were seated.");
        } else {
            double avgWait = (double) totalWait / numSeated;
            System.out.println("The average waiting time was:"+avgWait);
            if (!waitingParties.isEmpty())
            {
                System.out.println("The following parties were never seated:");
                while (!waitingParties.isEmpty()) {
                    Party party = (Party) waitingParties.dequeue();
                    System.out.println("  party "+party.name+" of "+party.size+" people");
                }
            }
        }
        System.out.println("Have a nice meal!");
    }
  }
}
