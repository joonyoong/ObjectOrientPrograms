import java.io.*;
import java.util.*;
// CampPoisanivee
// 4/14/23
// JunyeongShin

class CampPoisanivee 
{
    public class Campers{

        static String commands[];
        static Camper BST;
        public int count;
        public Campers(){
        this.commands=new String[50];
        this.BST=null;
        this.count=0;
        }
        
        public void displayHelp(){
        System.out.println("H Help: print a list of commands \nE name age diet \nEnroll a new camper (insert)");
        System.out.println(" W name Withdraw a camper (delete)\nD name Display the age and diet of a camper\nA Print the average age of the campers");
        System.out.println("L List all campers names in alphabetical order\nV Print the number of vegan campers");
        System.out.println("P List all campers names in preorder\nQ Quit");
        }
        
        public void insertNode(Camper node){
        
        Camper root=BST;
        Camper parent=root;
        if(root==null){
        BST=node;
        
        }
        else{
        while(root!=null){
        
        if((root.getName()).compareToIgnoreCase(node.getName())>0){
        
        parent=root;
        root=root.left;
        }
        else{
        parent=root;
        root=root.right;
        }
        }
        if((parent.getName()).compareToIgnoreCase(node.getName())>0){
        parent.left=node;
        }
        else{
        parent.right=node;
        }
        }
        this.count++;
        }
        
        
        public void withdrawCamper(String name){
        
        }
        
        
        public void displayCamperWithName(String name){
        Camper root=BST;
        String temp;
        while(root!=null){
        temp=root.getName();
        temp.trim();
        name.trim();
        
        if(temp.equalsIgnoreCase(name)){
        System.out.println(root.getData());
        
        break;
        
        }else if (temp.compareToIgnoreCase(name)>0){
        root=root.left;
        }
        else{
        root=root.right;
        }
        }
        if(root==null){
        System.out.println("No record found..");
        }
        }
        
        public void displayAverageAge(){
        if(count==0){
        System.out.println("No campers ...");
        }
        else{
        float sum=add(BST);
        System.out.println("Average age :"+(sum/count));
        }
        }
        int add(Camper c){
        
        if(c==null){
        return 0;
        }
        else{
        
        return c.getAge()+add(c.left)+add(c.right);
        }
        }
        
        public void inOrderPrint(){
        inorder(BST);
        }
        void inorder(Camper r){
        if (r != null){
        inorder(r.getLeft());
        System.out.print(r.getData() +" \n");
        inorder(r.getRight());
        }
        }
        
        
        public void displayVegan(){
        System.out.println("Vegan Campers are : ");
        vegan(BST);
        }
        public void vegan(Camper c){
        if(c==null){
        return;
        }
        if((c.getDiet())==('V') | (c.getDiet())==('v')){
        System.out.println(c.getData());
        }
        vegan(c.right);
        vegan(c.left);
        }
        
        
        public void preOrderPrint(){
        preOrder(BST);
        }
        public void preOrder(Camper r){
        if (r != null){
        System.out.print(r.getData() +" \n");
        inorder(r.getLeft());
        inorder(r.getRight());
        }
        }
        
        public static void main(String[] args) {
        
        Camper temp;
        Campers obj=new Campers();
        
        try {
        File myObj = new File("input.txt");
        Scanner myReader = new Scanner(myObj);
        int i=0;
        while (myReader.hasNext()) {
        
        String data = myReader.next();
        obj.commands[i]=data;
        i++;
        }
        myReader.close();
        }
        catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
        
        for(int i=0;!(obj.commands[i].equals("Q")) && !obj.commands[i].equals(null) ;i++)
        {
        System.out.println("\n-------------------------------------------------------------------------");
        System.out.println("Next Command: "+obj.commands[i]);
        
        if(obj.commands[i].equals("H")){ //H Help: print a list of commands
        
        System.out.println("Help menu:");
        obj.displayHelp();
        
        }
        else if (obj.commands[i].equals("E")) { //E name age diet Enroll a new camper (insert)
        
        System.out.println("Enrolling Camper "+obj.commands[i+1]+" "+obj.commands[i+2]+" "+obj.commands[i+3]);
        temp=new Camper(obj.commands[i+1],Integer.parseInt(obj.commands[i+2]),obj.commands[i+3].charAt(0));
        obj.insertNode(temp);
        System.out.println("Camper "+obj.commands[i+1]+" Enrolled");
        i=i+3;
        
        }
        else if (obj.commands[i].equals("W")) { //W name Withdraw a camper (delete)
        
        System.out.println("Withdrawing camper "+obj.commands[i+1]);
        obj.withdrawCamper(commands[i++]);
        
        }
        else if (obj.commands[i].equals("D")) { //D name Display the age and diet of a camper
        
        System.out.println("Displaying camper "+obj.commands[i+1]);
        obj.displayCamperWithName(obj.commands[i+1]);
        i=i+1;
        
        }
        else if (obj.commands[i].equals("A")) { //A Print the average age of the campers
        
        System.out.println("Displaying Average ");
        obj.displayAverageAge();
        
        }
        else if (obj.commands[i].equals("L")) { //L List all campers names in alphabetical order i.e inorder
        
        System.out.println("Displaying Camper in Alphabetical Order\n");
        obj.inOrderPrint();
        
        }
        else if (obj.commands[i].equals("V")) { //V Print the number of vegan campers
        
        System.out.println("Displaying Camper With Vegan Diet:\n");
        obj.displayVegan();
        
        }
        else if (obj.commands[i].equals("P")) { //P List all campers names in preorder
        
        System.out.println("Displaying Camper in PreOrder \n");
        obj.preOrderPrint();
        
        }
        else if (obj.commands[i].equals("Q")) { //Q Quit
        
        System.out.println("Quit\n");
        break;
        
        }
        else{
        
        System.out.println("Invalid Command \n Exiting.....");
        break;
        
        }
        try{
        
        if(obj.commands[i+1].equals(null)) continue;
        
        }catch(NullPointerException e){
        
        break;
        
        }
        } //End of FOR LOOP
        System.out.println("-------------------------------------------------------------------------\nThank You.......\n");
        }
        }
    }
        
        