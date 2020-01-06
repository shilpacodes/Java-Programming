import java.util.Scanner;
public class CodeMachine{
   
   public static void main (String [] args){
      int cents = 0;
      int quarters = 0;
      int dimes = 0;
      int nickels = 0;
      int pennies = 0;
   Scanner input = new Scanner(System.in);
   System.out.println("Enter number of cents.");
   cents = input.nextInt();
      quarters = cents/25;
      cents = cents%25;
      dimes = cents/10;
      cents = cents%10;
      nickels = cents/5;
      cents = cents%5;
      pennies = cents;
   System.out.println(quarters+" quarters");
   System.out.println(dimes+" dimes");
   System.out.println(nickels+" nickels");
   System.out.println(pennies+" pennies");
   
   }
}