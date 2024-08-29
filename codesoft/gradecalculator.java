ackage codsoft;

//import the scanner class for taking input from user.
import java.util.Scanner;
//design class for grade calculation of the marks.
public class GradeCalculator 
{
  public static void main(String[] e) 
  {
      Scanner SC = new Scanner(System.in);

      // please Give number of subjects
      System.out.print("Please enter the number of subjects: ");
      
      int numSub = SC.nextInt();

      // Initializing zero to total marks
      int totMarks = 0;

      // please give marks of each subject out of 100
      for (int inxsub = 1; inxsub <= numSub; inxsub++) 
      {
          System.out.printf("Please enter marks %d (out of 100):- ", inxsub);
          
          int marks=0;
          
          while ( marks < 0 || marks > 100);
          {
              marks = SC.nextInt();
              
              if (marks < 0 || marks > 100)
              {
                  System.out.println("wrong input  please input in between 0-100:-");
              }
          } 
          totMarks = totMarks + marks;
      }

      //Now calculate and display average percentage
      double avgPer = (double) totMarks / numSub;
      
      System.out.printf("Average Percentage of subject's is:%.2f%% \n", avgPer);

      // Now calculate and display grade
      char grade;
      
      if (avgPer >= 90) 
      {
          grade = 'A';
      } 
      else if (avgPer >= 75) 
      {
          grade = 'B';
      }
      else if (avgPer >= 60)
      {
          grade = 'C';
      }
      else if (avgPer >= 55) 
      {
          grade = 'D';
      }
      else if (avgPer >= 40) 
      {
          grade = 'E';
      }
      else 
      {
          grade = 'F';
      }
      
      //Now prints your grade
      
      System.out.println("Your's Grade is:- " + grade);

      SC.close();
  }
}