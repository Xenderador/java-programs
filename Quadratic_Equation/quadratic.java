/* Program to print the all real solutions to the quadratic equation ax2+bx+c=0 */

package Quadratic_Equation;
import java.util.Scanner;
public class quadratic {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // value a, b, and c
        System.out.print("Enter a, b and c: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        scan.close();

        double root1, root2;

        double d = b * b - 4 * a * c;

        if (d > 0) {
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("root1 = " + root1 + " and root2 = " + root2);
        }

        else if (d == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("root1 = root2 = " + root1);
        }

        // if d is less than zero
        else {
            System.out.println("There are no real solutions!");
        }
    }
}
