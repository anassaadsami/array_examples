
package Array;

import java.util.Scanner;

public class minutes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		displayTime(input);
		
		
		input.close();
	}
	public static void displayTime(Scanner input) {
		System.out.println("enter minutes: ");
		int minutes = input.nextInt();

		System.out.println("years: "+minutes/(1440*365));  
		System.out.println("days: "+minutes%(1440*365)/1440);
		System.out.println("hours: "+(minutes%1440)/60);
		System.out.println("minutes: "+(minutes%1440)%60);
	}
	

}



