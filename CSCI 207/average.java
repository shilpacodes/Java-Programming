/*********
* Lab 1
* This program calculates the average of 3 integers that the user chooses
* Author: Shilpa Kannan
* Date: 1/14/2019
*********/

import java.util.Scanner; //Imports the Scanner class to the program

public class average{ 

  public static void main (String [] args){
  
  //Declaring and initializing the variables
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int average = 0;
    Scanner input = new Scanner(System.in);
    
  //Prompt for user input
    System.out.println("Enter first integer ");
    num1 = input.nextInt();
    System.out.println("Enter second integer ");
    num2 = input.nextInt();
    System.out.println("Enter third integer ");
    num3 = input.nextInt();
    
  //Calculates the average
    average = ( num1 + num2 + num3 )/3;
   
  //Prints the final output 
    System.out.println(average);
    
  }
}