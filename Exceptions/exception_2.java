/*
  Write a Java program to read n number of integers into an array. 
  Raise an appropriate Exception (ArithmeticException, InputMismatchException, 
  ArrayOutOfBoundsException) while performing following operations:
  a) Dividing each element by the smallest element in an array. 
  b) Reading elements from the keyboard 
  c) Accessing the element from the index specified by the keyboard entry.
  Concept of exception handling using multiple catch blocks to be used in this scenario.
 */

package Exceptions;

import java.util.*;

class MultiExcept {
	private int arr[];
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter "+ n +" elements");
		for(int i = 0;i < n; i++) {
			arr[i] = sc.nextInt();
		}
	}
	public void divide() {
		int small = arr[0];
		for(int num:arr) {
			if(num < small) {
				small = num;
			}
		}
		for(int num:arr) {
			System.out.println(num + "/" + small + "=" + num / small);
		}
	}
	
    public void getElement() {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the index to be accessed");
		int idx = sc.nextInt();
		System.out.println("Element at "+ idx +" is "+ arr[idx]);
        sc.close();
    }
}

public class exception_2{
	public static void main(String[] args) {
		MultiExcept ob1 = new MultiExcept();
		try {
			ob1.read();
			ob1.divide();
			ob1.getElement();
		}catch(InputMismatchException e) {
			System.out.println("Illegal Input");
		}catch(ArithmeticException e) {
			System.out.println("Smallest element is 0");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Illegal Index");
		}
	}
}