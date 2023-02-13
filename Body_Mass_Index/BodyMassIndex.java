// importing Scanner class
import java.util.Scanner;

public class BodyMassIndex {
   public static void main(String[] args) {
    // creating a scanner variable
    Scanner input = new Scanner(System.in);

    // asking user for inputs
    System.out.println("Enter your height and weight respectively.");
    System.out.println("Heght : ");
    double height = input.nextDouble();
    System.out.println("Weight : ");
    double weight = input.nextDouble();

    // calculating the Body Mass Index (BMI)
    double BMI = weight / (height * height);

    //  displaying results
    if (BMI < 18.5){
        System.out.println("Your BMI is " + BMI);
        System.out.println("Interpretation => Underweight");
    }
    if ((BMI >= 18.5) && (BMI <25.0) ){
        System.out.println("Your BMI is " + BMI);
        System.out.println("Interpretation => Normal");
    }
    if ((BMI >= 25.0) && (BMI < 30.0)){
        System.out.println("Your BMI is " + BMI);
        System.out.println("Interpretation => Overweight");
    }
    if (BMI >= 30.0){
        System.out.println("Your BMI is " + BMI);
        System.out.println("Interpretation => Obese");
    }
   } 
}
