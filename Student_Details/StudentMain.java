/*
  Create a Java class called Student with the following details as private instance variables within it. 

   USN
   Name
   Branch
   Phone

   Write a Java program to create n number Student objects and print the USN, Name, Branch, and 
   Phone of these objects with suitable headings.
 */

package Student_Details;

import java.util.Scanner;

class Student{
	private String USN;
	private String Name;
	private String branch;
	private long phone;
	
	Student(String u,String n,String b,long p) {
		USN = u;
		Name = n;
		branch = b;
		phone = p;
	}
	void print() {
		System.out.println("USN: "+ USN);
		System.out.println("Name "+ Name);
		System.out.println("Branch: "+ branch);
		System.out.println("Phone "+ phone);
	}
}

public class StudentMain {

	public static void main(String[] args) {
		//Student s1=new Student("ABC",25);
		//s1.print();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		Student st[] = new Student[n];
		System.out.println("Enter student details");
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter the details of student"+(i+1));
			System.out.println("Enter USN");
			String usn = sc.next();
			System.out.println("Enter name");
			String name  =sc.next();
			System.out.println("Enter branch");
			String branch = sc.next();
			System.out.println("Enter phone");
			long phone = sc.nextLong();
			st[i]=new Student(usn,name,branch,phone);
		}
		System.out.println("Student Details");
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Student"+(i+1));
			st[i].print();
		}
		sc.close();
	}
}