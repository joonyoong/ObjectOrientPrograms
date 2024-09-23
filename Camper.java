import java.io.*;
import java.util.*;
// CampPoisanivee
// 4/14/23
// JunyeongShin
//Camper information
//Camper class will hold all details of a single Camper
public class Camper{

    String name;
    int age;
    char diet;
    Camper left,right;
    
    //Public constructor to initialize Camper
    public Camper(String name,int age,char diet){
    this.name=name;
    this.age=age;
    this.diet=diet;
    this.left=null;
    this.right=null;
    }
    //Getter and Setter methods of Camper
    public String getName(){
    return this.name;
    }
    public int getAge(){
    return this.age;
    }
    public char getDiet(){
    return this.diet;
    }
    Camper getLeft(){
    return this.left;
    }
    Camper getRight(){
    return this.right;
    }
    String getData(){
    return this.name+" "+this.age+" "+this.diet;
    }
    }
