/***********
* Shilpa Kannan
* CSCI 206 Section 01
* Lab 8
************/
import java.util.Scanner;

public class SumItUp{

   public static void main (String [] args){
   
      // Initialize Variables
      int num = 0;
      int sum = 0;
      double itemsPrice = 0.0;
      double itemsTotal = 0.0;
      double moneyLeft = 0.0;
      Scanner input = new Scanner(System.in);
      
      // For loop for the user to input integers
      for(int i = 0; i < 6; i++){
      System.out.println("Please enter a number");
      num = input.nextInt();
      sum += num;
      }
      System.out.println("The sum of numbers is "+sum); // Prints out the output for the first part of the program
      System.out.println("**********************************");
      
      // For loop for the user to input the prices
      for(int i = 0; i < 5; i++){
      System.out.println("Please enter a price");
      itemsPrice = input.nextDouble();
         if(itemsTotal+itemsPrice <= 20){ // checks if there is enough balance
         itemsTotal += itemsPrice;  
         }
         else{
         moneyLeft = 20-itemsTotal;
         System.out.println("Your item is too expensive! You only have "+moneyLeft+" left.");
         System.out.println("Enter a price less than "+moneyLeft);
         continue; //continues the for loop without adding to the total
         }
      }
      
      System.out.println("Your items total is "+itemsTotal+" Good Job!!!");// Prints the output for the total of prices   
   }
  
 }
 
 