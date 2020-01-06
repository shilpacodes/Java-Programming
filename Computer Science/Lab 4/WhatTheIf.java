/*****************
* Shilpa Kannan
* 3/10/2018
* CSCI 206 Lab Section 1
* Lab 4
*****************/

import java.util.Scanner;

public class WhatTheIf {

   public static void main (String args[])
      {
        //Mountain Climber
        int elevation = 0; // declares variable
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is your elevation?"); 
        elevation = input.nextInt(); //assigns the input to the variable
        
        //if statements to determine the elevation
        
        if(elevation > 26000)
        System.out.println("Death Zone!");
        else if (elevation > 7000)
        System.out.println("High!");
        else
        System.out.println("Meh, not that high!");
        
        //Magic 8ball
        
        int number = 0; // declares variable
         
        System.out.println("Welcome to the magic 8 ball!!!");
        System.out.println("Think of a question");
        System.out.println("Now enter a number between 1 and 1000");
        number = input.nextInt(); // assigns input value to the variable
        
        // Determines the outcome depending on the divisibility
        
        if(number%8 == 0)
        System.out.println("Maybe.. maybe not");
        else if(number%7 == 0)
        System.out.println("YES!!!");
        else if (number%5 == 0)
        System.out.println("Hard luck :((");
        else
        System.out.println("Doesn't look so good");
        
        //Calculation
        
        // declares variables
        int yards = 0; 
        int feet = 0;
        int inches = 0;
        
        System.out.println("Enter some number of yards");
        yards = input.nextInt(); // assigns input value to the variable
        feet = yards*3;
        inches = feet*12;
        
        System.out.println("You entered "+yards+" yards \nThis is equivalent to "+feet+" feet and "+inches+" inches");
      
      }
}