import java.util.Scanner;
public class LetterCounter{
   public static void main (String [] args){
      String phrase = "";
      String letter = "";
      int count = 0;
   Scanner input = new Scanner(System.in);
   System.out.println("Input a phrase ");
   phrase = input.nextLine();
   System.out.println("Input a letter ");
   letter = input.next();
   
      for(int i = 0; i < phrase.length(); i++){
         if((phrase.substring(i,i+1)).equalsIgnoreCase(letter)){
         count++;
         }
      }
    System.out.println("There are "+count+" instances of the letter \""+letter+"\" in the phrase "+phrase);
   }
}