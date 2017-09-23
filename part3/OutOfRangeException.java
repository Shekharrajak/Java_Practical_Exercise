 import java.io.*;

 public class OutOfRangeException extends Exception 
 {
   private int grade;
   public OutOfRangeException(int grade)
   {
      this.grade = grade;
   } 
   public int getGrade()
   {
      return grade;
   }
 }