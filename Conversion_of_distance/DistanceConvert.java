package Conversion_of_distance;

import java.util.Scanner;

public class DistanceConvert {
    public void MeterToKM() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Distance in meters");
	   int mtr = sc.nextInt();
	   System.out.println("Distance in kilometers="+ (mtr / 1000));
    }
    public void MileToKM() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Distance in miles");
	   int mile = sc.nextInt();
	   System.out.println("Distance in kilometers="+ (mile * 1.6));
    }
    public void KMToMeter() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Distance in kilometers");
	   int km = sc.nextInt();
	   System.out.println("Distance in meters="+ (km * 1000));
    }
	public void KMToMiles() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Distance in kilometers");
		int km = sc.nextInt();
		System.out.println("Distance in miles="+ (km / 1.6));
	}
}	