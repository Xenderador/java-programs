/*
   Develop a java application to implement distance converter (meter to KM, miles to KM and vice versa), 
   time converter (hours to minutes, seconds and vice versa) using packages.
 */

package Conversion_of_distance;

import java.util.Scanner;

public class distance_converter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DistanceConvert dc = new DistanceConvert();
		TimeConvert tc=new TimeConvert();
        
		dc.MeterToKM();
		dc.MileToKM();
		dc.KMToMeter();
		dc.KMToMiles();
		
		tc.ConvertHours();
		tc.ConvertMin();
		tc.ConvertSec();

		sc.close();
	}
}    