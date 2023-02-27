
// importing the Scabber class
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // creating a scanner variable
        Scanner input = new Scanner(System.in);

        // asking user for year input
        System.out.println("Enter the year :");
        int year = input.nextInt();

        // leap year is divisible by 4 but not 100 or by 400
        boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // displaying output
        if (leapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        input.close();
    }
}
