/***************
* Shilpa Kannan
* CSCI 206 Section 01
* Lab 05
* 10/9/2018
***************/
import java.util.Scanner;

public class LoopyNumbers
 {  
    public static void main (String [] args)
      {
      
      // Assign variables
      
      int startingNumber = 0;
      int endingNumber = 0;
      int increment = 0;
      
      // Scanner to get user input
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter starting number");
      startingNumber = input.nextInt();
      
      System.out.println("Enter ending number");
      endingNumber = input.nextInt();
      
      System.out.println("Enter increment");
      increment = input.nextInt();
      
      // loop to begin operation
      
      while(startingNumber < endingNumber)
         {
          if(startingNumber % 2 == 0)
          System.out.println("The number "+startingNumber+" is even");
          else
          System.out.println("The number "+startingNumber+" is odd");
          
          startingNumber += increment;                       
       }
       
       //Thank you message / end of the program
       
       System.out.println("Thank you for playing!!");
            
  }

}