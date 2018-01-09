import java.util.*;
 //Miguel Gomez
 //PROJECT 2 PART 1
 //This program will ask for scores, and will retrive the sum and percentage of each score, the total percentage of the cource and the grade.
 
public class scoresWizard{
   public static void main(String[] args){
   Scanner keyword = new Scanner(System.in);
   Grading object = new Grading();
   int quizz1;
   int quizz2;
   int midterm;
   int finalexam;
//Request the information from the user.
   System.out.println("Please Type your First Quizz points");
   quizz1 = keyword.nextInt();
   System.out.println("Please Type your Second Quizz points");
   quizz2 = keyword.nextInt();
   System.out.println("Please Type your MidTerm Exam points");
   midterm = keyword.nextInt();
   System.out.println("Please Type your Final Exam points");
   finalexam = keyword.nextInt();
//Pass the information to the method gradeSet of the class Grading through the object.
   object.gradeSet(quizz1, quizz2, midterm, finalexam);
   System.out.println ();
   System.out.println ();
   System.out.println ();
   System.out.println ();
   System.out.println ("The list and percentage of your Grades are:");
   object.getPercent();          //Call method with grading information.
   System.out.println ("Your Total percentage Score is: " + object.retScore() + "% and your grade is: "+ object.retLetter());
  
   }   




public static class Grading {

   int q1;
   int q2;
   int mT;
   int fE;
   int sum;
   double totalScore;
   char letter;

   public void gradeSet(int quizz1, int quizz2, int midterm, int finalexam){
//Set information passed into variables|create the variables to sum all points and to get the Total percentage score.
      q1 = quizz1;
      q2 = quizz2;
      mT = midterm;
      fE = finalexam;
      sum = q1 + q2 + mT + fE;
      totalScore = (sum * 100)/ 220;
   }
   
   public void getLetter(double a){    //get the grade through the totalScore variable.
      double totalScore = a;
      if (totalScore >= 90){
         letter = 'A';
      }
      else if (totalScore >= 80 && totalScore <= 89){
         letter = 'B';
      }
      
      else if (totalScore >= 70 && totalScore <= 79){
         letter = 'C';
      }
      
      else if (totalScore >= 60 && totalScore <= 69){
         letter = 'D';
      }  
      else {
         letter = 'F';
      }
   }
   public void getPercent(){
            System.out.println("Your quizz 1 points obtained are: " + q1 + ". With a grade percentage of: " + (((q1 * 100)/10)*0.125) +"%");
            System.out.println("Your quizz 2 points obtained are: " + q2 + ". With a grade percentage of: " + (((q2 * 100)/10)*0.125) +"%");
            System.out.println("Your Mid Term Exam points obtained are: " + mT + ". With a grade percentage of: " + (((mT * 100)/100)*0.25) +"%");
            System.out.println("Your Final Exam points obtained are: " + fE + ". With a grade percentage of: " + (((fE * 100)/100)*0.5) +"%");
            System.out.println("Your Total Score is: " + sum );
   
   }
   
   public double retScore(){     //return total score.
      
      return totalScore;
   
   }
   public char retLetter(){      //Return the Grade obtained
      getLetter(totalScore);
      return letter;

   }

}
}