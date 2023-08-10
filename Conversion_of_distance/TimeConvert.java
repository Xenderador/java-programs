package Conversion_of_distance;

import java.util.Scanner;

public class TimeConvert {
    public void ConvertHours() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Time in Hours");
		double hr = sc.nextInt();
		System.out.println("Time in Minutes="+ (hr * 60));
		System.out.println("Time in Seconds="+ (hr * 3600));
	}
	public void ConvertMin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time in minutes");
		double min = sc.nextInt();
		System.out.println("Time in Hours="+ (min / 60));
		System.out.println("Time in seconds="+ (min * 60));
	}
	public void ConvertSec() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time in seconds");
		double min = sc.nextInt();
		System.out.println("Time in Hours="+ (min / 3600));
		System.out.println("Time in minutes="+ (min / 60));
	}
}
