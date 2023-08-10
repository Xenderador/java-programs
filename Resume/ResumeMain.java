/*
 Write a program to generate the resume. Create 2 Java classes Teacher (data: personal
 information, qualification, experience, achievements) and Student (data: personal information,
 result, discipline) which implements the java interface Resume with the method biodata().
*/

package Resume;

import java.util.*;

interface Resume {
	void biodata();
}
class Teacher implements Resume {
	private String name;
	private String dob;
	private String qualification;
	private int experience;
	private String achievements;
	
	public void biodata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter dob in dd-mm-yyyy");
		dob=sc.next();
		System.out.println("Enter Qualification");
		qualification=sc.next();
		System.out.println("Enter Experience in years");
		experience=sc.nextInt();
		System.out.println("Enter Achievements");
		achievements=sc.next();
	}
	
	public void putData() {
		System.out.println("Name: "+name);
		System.out.println("D.O.B: "+dob);
		System.out.println("Qualification: "+qualification);
		System.out.println("Experience: "+experience);
		System.out.println("Achievements: "+achievements);
	}	
}
class Student implements Resume {
	private String name;
	private String dob;
	private String result;
	private String discipline;
	public void biodata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter dob in dd-mm-yyyy");
		dob=sc.nextLine();
		System.out.println("Enter result");
		result=sc.nextLine();
		System.out.println("Enter discipline");
		discipline=sc.nextLine();
		sc.close();
	}
	public void putData() {
		System.out.println("Name: "+name);
		System.out.println("D.O.B: "+dob);
		System.out.println("Result: "+result);
		System.out.println("Discipline: "+discipline);
	}
}

public class ResumeMain {
	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.biodata();
		t1.putData();
		Student s1=new Student();
		s1.biodata();
		s1.putData();
	}
}
