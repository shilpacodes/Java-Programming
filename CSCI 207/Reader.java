import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Reader{
   public static void main(String[] args) throws Exception{
      ArrayList<String> array = new ArrayList<String>();
      
      String object = "";
      File file = new File("C:\\Users\\kanni_000\\Desktop\\Shilpa Classes Sem2\\Computer Science\\recycle.txt");
      
      Scanner input = new Scanner(file);
      while(input.hasNextLine()){
      String next = input.nextLine();
         array.add(next);        
      }
      String [] arr = array.toArray(new String[0]);
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter an object");
      object = userInput.nextLine();
      
      TypoFinder find = new TypoFinder(object, arr);
      for(String i : arr){
         if((object.trim()).contains(i)){
            if(!(object.equalsIgnoreCase(i))){
               object = find.correctNoun();
               break;
            }
         }              
      }
      System.out.println(object);       
   }  
}