/****************
Shilpa Kannan
CSCI 206 Section 01
Lab 11
11/29/2018
*****************/
import java.util.Scanner;

public class Methods {
   //method to calculuate the mean
   public static double mean(double x1, double x2, double x3, double x4, double x5){
   
   //returns the mean
   return (x1+x2+x3+x4+x5)/5.0;   
   }
   
   //method to calculate the standard deviation
   public static double standDev(double x1, double x2, double x3, double x4, double x5){
   double x = mean(x1, x2, x3, x4, x5); //assigns mean value to x
   //returns the standard deviation
   return Math.sqrt((Math.pow((x1-x),2)+Math.pow((x2-x),2)+Math.pow((x3-x),2)+Math.pow((x4-x),2)+Math.pow((x5-x),2))/5);
   }
   
   // main method
   public static void main (String [] args){
      double x1 = 0;
      double x2 = 0;
      double x3 = 0;
      double x4 = 0;
      double x5 = 0;
      double mean = 0;
      double standDev = 0;
      
      //takes user input
      Scanner input = new Scanner(System.in);
   System.out.print("Please enter a number : ");
   x1 = input.nextDouble();
   System.out.print("Please enter a number : ");
   x2 = input.nextDouble();
   System.out.print("Please enter a number : ");
   x3 = input.nextDouble();
   System.out.print("Please enter a number : ");
   x4 = input.nextDouble();
   System.out.print("Please enter a number : ");
   x5 = input.nextDouble();
   
      //calling the methods to assign to the variables
      mean = mean(x1, x2, x3, x4, x5);
      standDev = standDev(x1,x2,x3,x4,x5);
      
   //Prints final output   
   System.out.println("You entered: "+x1+", "+x2+", "+x3+", "+x4+", "+x5);
   System.out.println("The average of these numbers is "+mean);
   System.out.println("The standard deviation of these numbers is "+standDev);
   
   }
}