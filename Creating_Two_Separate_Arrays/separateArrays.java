/*
  Write a java  program to create two separate arrays of integers. 
  Elements of both the arrays shall be read from keyboard input. 
  Program should display “Arrays are symmetrical” if both the arrays contain equal numbers of even and odd numbers.
 */

package Creating_Two_Separate_Arrays;

import java.util.Scanner;

class Array{
	private int arr[];
	private int ecount = 0;
	private int ocount = 0;
	
	void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		arr=new int[n];
		System.out.println("Enter "+ n +" elements into the array");
		for(int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
        sc.nextLine();
	}
	
	void print() {
		for (int num:arr) {
			System.out.println(num);
		}
	}
	
	void findcount() {
		for (int num:arr) {
			if(num % 2 == 0) {
				ecount++;
			}
			else {
				ocount++;
			}
		}
	}
	
	void checksymmetry(Array ob) {
		if(ecount == ob.ecount && ocount == ob.ocount) {
			System.out.println("It is symmetrical");
		}
		else {
			System.out.println("It is asymmetrical");
		}
	}
}

public class separateArrays {
	public static void main(String[] args) {
		Array ob1 = new Array();
		Array ob2 = new Array();
		System.out.println("Read array ob1");
		ob1.read();
		System.out.println("Read array ob2");
		ob2.read();
		System.out.println("ob1 array elements");
		ob1.print();
		System.out.println("ob2 array elements");
		ob2.print();
		ob1.findcount();
		ob2.findcount();
		ob1.checksymmetry(ob2);
	}
}