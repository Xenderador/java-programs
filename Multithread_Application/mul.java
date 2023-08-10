/* 
  Write a Java program that implements a multithreaded application that has three threads. 
  First thread generates a random integer for every 1 second; 
  second thread computes the square of the number and prints; 
  third thread will print the value the cube of the number.
*/

package Multithread_Application;

import java.util.*;

class Square extends Thread{
	private int num;
	Square(int n){
		num = n;
	}
	public void printSquare() {
		System.out.println("Square of "+ num +" is "+ (num * num));
	}
	public void run() {
		printSquare();
	}
}

class Cube extends Thread{
	private int num;
	Cube(int n){
		num = n;
	}
	public void printCube() {
		System.out.println("Cube of "+ num +" is "+ (num * num * num));
	}
	public void run() {
		printCube();
	}
}
class RandInt extends Thread{
	public void printRandom() throws InterruptedException {
		Random rd = new Random();
		while(true) {
			int rnum = rd.nextInt(10);
			System.out.println("Random Number is"+ rnum);
			Thread.sleep(3000);
			Square s = new Square(rnum);
			Cube c = new Cube(rnum);
			s.start();
			c.start();
		}
	}
	public void run() {
		try {
		printRandom();
		}catch(InterruptedException e) {}
	}
}
public class mul {
	public static void main(String[] args) {
		RandInt ob1 = new RandInt();
		ob1.start();
	}

}