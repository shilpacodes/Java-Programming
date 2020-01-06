public class Student{
    String name;
    int finalGrade;
   
   public Student(String givenName, int givenFinalGrade){
      name = givenName;
      finalGrade = givenFinalGrade;
   }
   
   public void display(){
      System.out.println(name+": "+finalGrade);
   }
}