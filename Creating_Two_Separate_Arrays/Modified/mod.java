/*
  Write a java  program to create two separate arrays of integers. 
  Elements of both the arrays shall be read from keyboard input. 
  Program should display “Arrays are symmetrical” if both the arrays contain equal numbers of even and odd numbers.

  This the modified version which encludes encapsulation principles for better organization and readability.
 */

package Creating_Two_Separate_Arrays.Modified;

import java.util.Scanner;
import java.util.Arrays;

class Array {
    private int[] arr;
    private int ecount = 0;
    private int ocount = 0;

    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.printf("Enter %d elements into the array: ", n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
    }

    public void print() {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public void findCount() {
        ecount = (int) Arrays.stream(arr).filter(num -> num % 2 == 0).count();
        ocount = arr.length - ecount;
    }

    public boolean isSymmetrical(Array ob) {
        return ecount == ob.ecount && ocount == ob.ocount;
    }
}

public class mod {
    public static void main(String[] args) {
        Array ob1 = new Array();
        Array ob2 = new Array();

        System.out.println("Read array ob1");
        ob1.read();
        System.out.println("Read array ob2");
        ob2.read();

        System.out.println("ob1 array elements:");
        ob1.print();
        System.out.println("ob2 array elements:");
        ob2.print();

        ob1.findCount();
        ob2.findCount();

        if (ob1.isSymmetrical(ob2)) {
            System.out.println("Both arrays are symmetrical");
        } else {
            System.out.println("Arrays are not symmetrical");
        }
    }
}

