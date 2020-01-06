/**********
* Shilpa Kannan
* CSCI 206 Section 01
* Lab 09
* 11/9/2018
***********/
import java.util.Scanner; // imports Scanner class

public class Beer {

   public static void main (String args[]){
   Scanner input = new Scanner(System.in);
   
   // initialize variables
   int age = 0;
   double cashGiven = 0;
   int yearsRequired = 0;
   double cashRequired = 0;
   
   // ask for user input
   System.out.println("Please type customer age");
   age = input.nextInt();
   System.out.println("Please enter cash amount");
   cashGiven = input.nextDouble();
   cashRequired = 5.0-cashGiven;
   yearsRequired = 21- age;
   
   // if statement determines whether or not they get a beer
   if(cashGiven >= 5.0 && age >= 21) {
   System.out.println("Congratulations!! You get a beer!");
          }      
   else {
      if(cashGiven < 5.0 && age >= 21){     
      System.out.printf("%s%2.2f%s%n","Sorry! \nYou need $",cashRequired," more");  
      }
      else if(cashGiven < 5.0 && age < 21){
      System.out.printf("%s%2.2f%s%2d%s%n","No beer for you! \nYou need $",cashRequired," more \nCome back with it in ",yearsRequired," years");  
      }
      else{
      System.out.println("No beer for you! \nCome back in "+yearsRequired+" years"); 
      }
   }
   
   // Concluding message
   System.out.println("Thank you for your patronage!!");
 }
}
