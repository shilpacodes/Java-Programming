public class TypoFinder{
String error = "";
String [] array= new String[0];
String correction = "";
 public TypoFinder(String inputError, String [] inputArray){
 error = inputError;
 array = inputArray;
   }


   public String correctNoun(){
   
   
        for(int i = 0; i < array.length; i++){
       
          if((error.trim()).contains(array[i])){
            correction = array[i];
            break;
         }
         else{
            correction = "invalid";
            continue;
         }          
      }
      return correction;
   }
}