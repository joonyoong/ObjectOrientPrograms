import java.io.*;
import java.util.*;

class Fishmain
{
    public static void main(String [] args)
    {
        Fish f,f2;
        f=new Fish("Angela","Blue","angelfish",5);
        f2=new Fish("Stephanie","green","stegasaurus",10);
        
        System.out.println(f);
        System.out.println(f2);

        System.out.println(f.getName()+" has color " +f.getColor());

        System.out.println("Oh no! Sharks are attacking!");
        if(f.getFins()<f2.getFins())
        {
            f2.sharkAttack();
        }
        else
        {
            f.sharkAttack();
        }
        System.out.println(f);
        System.out.println(f2);

        System.out.println("Radoiactive lunch time.");
        f.seaweed();
        f2.seaweed();
        System.out.println(f);
        System.out.println(f2);
    }
    
}