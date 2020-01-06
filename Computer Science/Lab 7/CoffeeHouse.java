/**********************
 * Shilpa Kannan
 * CSCI 206 Section 01
 * Lab 7 Coffee House
 * 10/24/2018
 **********************/

import java.util.Scanner;

public class CoffeeHouse {
  public static void main(String[] args) {
  
   //Declare variables
    int coffeeType;
    String order;
    int flavorNum = 0;
    
    Scanner input = new Scanner(System.in);
    //Prompt for order input
    System.out.println("Welcome to my Coffee Machine");
    System.out.println("What type of coffee would you like?");
    System.out.println("Enter 1 for dark roast, 2 for light roast, 3 for decaffeinated");
    coffeeType = input.nextInt();
    
    //switch statement to determine the order
    switch(coffeeType)  
    {
    case 1  :
    order = "Dark roast";
    break;
    case 2  :
    order = "Light roast";
    break;
    case 3  :
    order = "Decaf";
    break;
    default :
    order = "order";
    }
    //prompt for flavor input
    System.out.println("What flavour would you like?");
    System.out.println("Enter 1 for mocha, 2 for caramel and 3 for no flavor");
    flavorNum = input.nextInt();
    //switch statement that also prints output
    switch(flavorNum)
    {
    case 1  : 
    System.out.println("Here is your "+order+" with mocha");
    break;
    case 2  :
    System.out.println("Here is your "+order+" with caramel");
    break;
    case 3  :
    System.out.println("Here is your "+order+" with no flavor");
    break;
    default :
    System.out.println("Sorry, we could not understand your order. \nHere is your order with no order given");
   }    
   // ending message
   System.out.println("Come again soon!!");
   
  }
}