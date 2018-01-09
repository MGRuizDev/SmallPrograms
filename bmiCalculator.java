 import java.util.*;
 //Miguel Gomez
 // Use the weight in kilograms, and divide it by the square of their height.

public class bmiCalculator {
    public static void main(String[] args){
    Scanner keyword = new Scanner(System.in);
   
    double weight;
    double height;
    
    System.out.println("Type your weight in kilograms");
    weight = keyword.nextDouble();
    System.out.println("Type your height in meters");
    height = keyword.nextDouble();
   
    System.out.println("Your BMI is:  " + (weight/(height*height)));
    
    
   }
}