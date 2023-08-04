/*
 * Create a class as Student. Write a program in Java to display the names and
 * roll numbers of students. Create an array of 10 students and initialize the
 * array with user input. Handle ArrayIndexOutOfBoundsException, so that any
 * such problem doesn’t cause illegal termination of program. Read a character
 * from user and display the student names starting with given character.
 */

package Exceptions;

import java.util.Scanner;

class Student {
	String name;
	int rno;

	Student(String name, int rno) {
		this.name = name;
		this.rno = rno;
	}

	void display() {
		System.out.println("Name: " + name + "\nRoll Number: " + rno);
	}
}

public class exception {
    public static void amin(String[] args){
        String name;
		int rno;
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);

		Student st[] = new Student[5];
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Enter the name: ");
				name = s1.nextLine();
				System.out.println("Enter the roll number: ");
				rno = s2.nextInt();
				st[i] = new Student(name, rno);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		System.out.println("Enter the first character: ");
		char check = s1.next().charAt(0);
		try {
			for (int i = 0; i < 5; i++) {
				if (check == st[i].name.charAt(0)) {
					st[i].display();
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		s1.close();
		s2.close();
    }
}
