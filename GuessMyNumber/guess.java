/* 
  Build a program called “GuessMyNumber.” The computer will generate a random number between 1 and 10. 
  The user types in a number and the computer replies “lower” if the random number is lower than the guess,
  “higher” if the random number is higher, and “correct!” if the guess is correct. 
  The player can continue guessing until the guess is right.
*/

package GuessMyNumber;

import java.util.Random;
import java.util.Scanner;
public class guess {
  public static void main(String[] args) {
    Random rd = new Random();
    int min = 1;
    int max = 10;
    int rnum = rd.nextInt(min + max) + min;
    Scanner sc = new Scanner(System.in);
    while(true) {
	    System.out.println("Enter a number between 0 to 10");
	    int guess = sc.nextInt();
	    if(guess < rnum) {
		   System.out.println("Your guess is lesser");
	    }
	    else if(guess > rnum) {
		   System.out.println("Your guess is higher");
	    }
	    else {
		   System.out.println("Your guess is right");
		break;
	    }
    }
    System.out.println("GAME OVER");
    sc.close();
	}
}
