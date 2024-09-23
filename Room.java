import java.io.*;
import java.util.*;
// Wumpus Room Class
// 2/24/23
// JunyeongShin
public class Room
{
    int start;
    int adjacent1;
    int adjacent2;
    int adjacent3;
    String description;


//room class scanner to scan the room
    public Room(Scanner s)
    {
        start=s.nextInt();
        adjacent1 =s.nextInt();
        adjacent2 =s.nextInt();
        adjacent3 =s.nextInt();

        s.nextLine();
        description=s.nextLine();
    }

//to string method to display the location
    public String toString()
    {
        String a=(start+" adjacent1="+ adjacent1 +" adjacent2="+ adjacent2 +" adjacent3="+ adjacent3 +" description="+description);
        return a;
    }
}