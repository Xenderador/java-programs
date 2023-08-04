/* Write a java program on user defined exceptions. */

package User_Defined_Exceptions;

import java.util.Scanner;

// Custom exception class
class MinimumAccountBalance extends Exception {

    String message;

    public MinimumAccountBalance(String message) {
        this.message = message;
    }

    public String toString() {
        return message;
    }
}

public class Bank_Withdraw {
    static double current_balance = 100;
    public static void main(String[] args) throws MinimumAccountBalance{
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount for withdrawal");
        int n = scan.nextInt();
        scan.close();

        try {
            if (current_balance < n) {
                throw new MinimumAccountBalance(
                        "Insufficient funds ! your Current balance is " + current_balance);
            } else {
                System.out.println("Please Take The Money : " + n);
            }
        } catch (MinimumAccountBalance mab) {
            mab.printStackTrace();
        }
    }
}
