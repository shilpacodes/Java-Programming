/************
Shilpa Kannan
CSCI 206 Section 01
Lab 10
11/15/2019
*************/

import java.util.Scanner; //imports Scanner class

// Opens class
public class Biography {
   public static void main (String [] args){ //main method
   
   //declare variables
   String firstName = "";
   String lastName = "";
   String name = "";
   int age = 0;
   char gender = 0;
   String homeTown = "";
   String school = "";
   String major = "";
   String music = "";
   String title = "";
   Scanner input = new Scanner(System.in);
   
   //get user input
      System.out.print("Please enter your name (first last) ");
   firstName = input.next();  //assigns the first word to firstName
   lastName = (input.nextLine()).trim(); //assigns the next word to lastName
      System.out.print("Please enter your age ");
   age = input.nextInt();
      System.out.print("Please enter your gender ");
   gender = input.next().charAt(0); //uses the first letter of the input
   input.nextLine();
      System.out.print("Please enter your hometown ");
   homeTown = input.nextLine();
      System.out.print("Please enter your school name " );
   school = input.nextLine();
      System.out.print("Please enter your major ");
   major = input.nextLine();
      System.out.print("Please enter the type of music you listen to ");
   music = input.nextLine();
   
   //determines the length of first and last names
   int lengthFirst = firstName.length();
   int lengthLast = lastName.length();
   
   //compares the lengths
   if(lengthFirst > lengthLast){
      System.out.println(firstName+" is longer than "+lastName);
   }
   else if(lengthLast > lengthFirst){
      System.out.println(lastName+" is longer than "+firstName);
   }
   else{
      System.out.println(firstName+" is the same length as "+lastName);
   }
   
   //assigns firstName to lastName if there is no last name given
   if(lastName.length() == 0){
   lastName = firstName;
   }
   
   //determines what title to use
   if((gender == 'M')||(gender == 'm')){
      title = "Mr.";
   }
   else if((gender == 'F')||(gender == 'f')){
      title = "Ms.";
   }
   else
      title = "Mx.";
   
   //print the biography
      System.out.println("***************************");
      System.out.println("Here's the Biography for "+firstName);
      System.out.println();
      System.out.println(firstName+ " is "+age+" and from "+homeTown);
      System.out.println(title+" "+lastName+" is currently majoring in "+major+ " at "+school);
      System.out.println(title+" "+lastName+" enjoys listening to "+music+ " when not attending class.");
      System.out.println("****************************"); 
   
   }
}