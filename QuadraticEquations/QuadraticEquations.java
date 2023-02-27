import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        // general quadratic equation: a^2 + bx + c = 0
        // first_root, x1 = -b + root(b^2 - 4ac)/2a and second_root, x2 = -b - root(b^2
        // - 4ac)/2a

        Scanner input = new Scanner(System.in);

        // declaring variables
        double a, b, c, x1, x2;
        System.out.println("Enter the coefficient of x^2: ");
        a = input.nextDouble();
        System.out.println("Enter the coefficient of x: ");
        b = input.nextDouble();
        System.out.println("Enter the constant term: ");
        c = input.nextDouble();

        // defining the determinant
        double det = Math.pow(b, 2) - (4 * a * c);

        if (det > 0) {
            x1 = (-b + Math.sqrt(det)) / (2 * a);
            x2 = (-b - Math.sqrt(det)) / (2 * a);
            System.out.println("Has two real roots.");
            System.out.println("First root: " + x1 + "  Second root: " + x2);
        } else if (det == 0) {
            x1 = (-b + Math.sqrt(det)) / (2 * a);
            System.out.println("Has only one root: " + x1);
        } else if (det < 0) {
            det = (-1 * det);
            double real = (-1 * b) / (2 * a);
            double img = Math.sqrt(det) / (2 * a);
            System.out.println("Has complex roots");
            System.out.println("First root : " + real + " + " + img + "i");
            System.out.println("First root : " + real + " - " + img + "i");
        }

        input.close();
    }
}
