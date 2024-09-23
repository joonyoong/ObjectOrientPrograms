import java.io.*;
import java.util.*;

public class CaveClass
{

static int arrowCount;
static int spiderRoom1;
static int spiderRoom2;
static int Pit1;
static int Pit2;
static int wumpusRoom;
static int supplyRoom;
static boolean hasUsedArrows=false;
static Random rand = new Random();
static Scanner input= new Scanner(System.in);

public static void StartGame()
throws IOException
{
    Room [] cave = setRooms();
    arrowCount=3;
    int currentRoom=1;
    System.out.println("Welcome to Hunt the Wumpus!");
    wumpusTurn(currentRoom, cave);
}

public static Room[] setRooms()
throws IOException
{
    Scanner caveLayout =new Scanner(new FileReader("Wumpusfile.txt"));
    int n=caveLayout.nextInt();
    Room [] cave=new Room[n];
    for(int i=0; i<cave.length; i++)
    {
        cave[i]=new Room(caveLayout);
    }

    int[] assignRoom = new int[cave.length];
    for(int i=0; i<cave.length-1; i++)
    {
        assignRoom[i]=i+2;
    }

    assignRoom= randomizingRoom(assignRoom);

    wumpusRoom=assignRoom[0];
    spiderRoom1=assignRoom[1];
    spiderRoom2=assignRoom[2];
    Pit1 =assignRoom[3];
    Pit2 =assignRoom[4];
    supplyRoom=assignRoom[5];
    return cave;
}

public static int[] randomizingRoom(int[] array)
{
    for(int i=0; i<array.length-1; i++)
    {
        int randomPos = rand.nextInt(array.length-2);
        int temp = array[i];

        array[i] = array[randomPos];
        array[randomPos] = temp;
    }
    return array;
}

public static void wumpusTurn(int currentRoom, Room[] cave)
throws IOException
{
    String a="";
    int responseRoom;

    System.out.println("You are in room "+currentRoom+".");
    System.out.println("You have "+arrowCount+" arrows.");
    System.out.println(cave[currentRoom-1].description);
    System.out.println("There are tunnels to "+cave[currentRoom-1].adjacent1 +", "+cave[currentRoom-1].adjacent2 +", "+cave[currentRoom-1].adjacent3 +".");

    if(wumpusCheck(cave[currentRoom-1].adjacent1) || wumpusCheck(cave[currentRoom-1].adjacent2) || wumpusCheck(cave[currentRoom-1].adjacent3))
    {
        System.out.println("You smell some nasty Wumpus.");
    }

    if(pitCheck(cave[currentRoom-1].adjacent1) || pitCheck(cave[currentRoom-1].adjacent2) || pitCheck(cave[currentRoom-1].adjacent3))
    {
        System.out.println("There is a black pool of water in the corner.");
    }

    if(spiderCheck(cave[currentRoom-1].adjacent1) || spiderCheck(cave[currentRoom-1].adjacent2) || spiderCheck(cave[currentRoom-1].adjacent3))
    {
        System.out.println("You hear a faint clicking noise.");
    }

        System.out.println("Your options are to move (m) or shoot (s). What will it be?");
        a=input.next();

    if(a.equals("m"))
    {
        wumpusMove(currentRoom, cave);
    }
    else if(a.equals("s"))
    {
        attackWumpus(currentRoom, cave);
    }
    else
    {
        System.out.println("What you're trying to do is illogical.");
        wumpusTurn(currentRoom, cave);
    }
}

//method return true if wumpus is available in the current room
public static boolean wumpusCheck(int currentRoom)
{
    if(currentRoom==wumpusRoom){return true;}
    else{return false;}
}

//method return true if pits is available in the current room
public static boolean pitCheck(int currentRoom)
{
    if(currentRoom== Pit1 || currentRoom== Pit2){return true;}
    else {return false;}
}

//method return true if spider is available in the current room
public static boolean spiderCheck(int currentRoom)
{
    if(currentRoom==spiderRoom1 || currentRoom==spiderRoom2){return true;}
    else {return false;}
}

//method return true if arrow is available in the current room
public static boolean supplyCheck(int currentRoom)
{
    if(currentRoom==supplyRoom){return true;}
    else {return false;}
}

public static void wumpusMove(int currentRoom, Room[] cave)
throws IOException
{
    int responseRoom=-1;

    System.out.println("Which room? ("+cave[currentRoom-1].adjacent1 +", "+cave[currentRoom-1].adjacent2 +", or "+cave[currentRoom-1].adjacent3 +")");
    responseRoom=input.nextInt();

    if(responseRoom==(cave[currentRoom-1].adjacent1) || responseRoom==(cave[currentRoom-1].adjacent2) || responseRoom==(cave[currentRoom-1].adjacent3))
    {
        move(responseRoom, cave);
    }
    else
    {
        System.out.println("That's not a room it's a wall.");
        wumpusMove(currentRoom, cave);
    }
}

public static void move(int currentRoom, Room[] cave)
throws IOException
{
    System.out.println("You are moving to "+currentRoom+".");

    if(supplyCheck(currentRoom))
    {
        if(hasUsedArrows==false)
        {
            System.out.println("You come across a room with extra arrows. You replenish your arrows.");
            arrowCount=3;
            hasUsedArrows=true;
        }
    }

    if(wumpusCheck(currentRoom))
    {
        System.out.println("The Wumpus got you!");
        endGame();
    }
    else if(pitCheck(currentRoom))
    {
        System.out.println("You fell down a pit!");
        endGame();
    }
    else if(spiderCheck(currentRoom))
    {
        System.out.println("You were attacked by spiders!");
        endGame();
    }
    else 
    {
        wumpusTurn(currentRoom, cave);
    }
}

public static void attackWumpus(int currentRoom, Room[] cave)
throws IOException
{
    int responseRoom;

    if(arrowCount==0)
    {
        System.out.println("Oh no! You've run out of arrows.");
        wumpusTurn(currentRoom, cave);
    }

    System.out.println("Which room? ("+cave[currentRoom-1].adjacent1 +", "+cave[currentRoom-1].adjacent2 +", or "+cave[currentRoom-1].adjacent3 +")");
    responseRoom=input.nextInt();

    if(responseRoom==(cave[currentRoom-1].adjacent1))
    {
        if(wumpusCheck(cave[currentRoom-1].adjacent1))
        {
            winGame();
        }
    }

    else if(responseRoom==(cave[currentRoom-1].adjacent2))
    {
        if(wumpusCheck(cave[currentRoom-1].adjacent2))
        {
            winGame();
        }
    }

    else if(responseRoom==(cave[currentRoom-1].adjacent3))
    {
        if(wumpusCheck(cave[currentRoom-1].adjacent3))
        {
            winGame();
        }
    }
    else
    {
        System.out.println("You can't shoot in that room.");
        attackWumpus(currentRoom, cave);
    }
    System.out.println("The arrow flies into room " +responseRoom+"...");
    arrowCount--;

    System.out.println("The arrow doesn't hit anything and is lost.");

    wumpusTurn(currentRoom, cave);
}

public static void winGame()
throws IOException
{
    String a;

    System.out.println("You arrow brings down the Wumpus!");
    System.out.println("You have won the game!");
    System.out.println("Play again? y or n");
    a=input.next();

    if(a.equals("y"))
    {
        {StartGame();}
    }
    else
    {}
}

public static void endGame()
throws IOException
{
    String a;

    System.out.println("GAME OVER");
    System.out.println("Try again? y or n");
    a=input.next();

    if(a.equals("y"))
    {
        {StartGame();}
    }
    else
    {}
}

public static void main(String[] args)
throws IOException
    {
        StartGame();
    }
}