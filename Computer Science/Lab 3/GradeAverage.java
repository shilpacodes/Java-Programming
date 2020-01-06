/*********************
* Shilpa Kannan
* 09/25/2018
* Lab 3 CSCI 206 Section 1
**********************/


import java.util.Scanner;
public class GradeAverage
   {
    public static void main (String [] args)
     {
     // initializing variables 
     
      int grade1 = 0;
      int grade2 = 0;
      int grade3 = 0;
      int grade4 = 0;
      int grade5 = 0;
      
      double gradeAverage = 0.0;
      String letterGrade = "";
      
     // getting user input
      Scanner input = new Scanner(System.in);     
      System.out.println("Enter grade 1");
         grade1 = input.nextInt();
             
      System.out.println("Enter grade 2");
         grade2 = input.nextInt();

      System.out.println("Enter grade 3");
         grade3 = input.nextInt();
  
      System.out.println("Enter grade 4");
         grade4 = input.nextInt();
  
      System.out.println("Enter grade 5");
         grade5 = input.nextInt();
     // find average   
      gradeAverage = (grade1+grade2+grade3+grade4+grade5)/5.0;
      
     // determining the letter grade
     
      if(gradeAverage >= 90)
      {
       letterGrade = "A";
      }     
      else if (gradeAverage >= 85)
      {
       letterGrade ="B+";
      }
      else if (gradeAverage >= 80)
      {
       letterGrade = "B";
      }
      else if (gradeAverage >= 75)
      {
       letterGrade = "C+";
      }
      else if (gradeAverage >= 70)
      {
       letterGrade = "C";
      }
      else if (gradeAverage >= 65)
      {
       letterGrade = "D+";
      }
      else if (gradeAverage >= 60)
      {
       letterGrade = "D";
      }
      else 
      {
       letterGrade = "F";
      }
      
      System.out.println("Your letter grade is "+letterGrade);    
      
      }
   
   }