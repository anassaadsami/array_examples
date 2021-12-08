package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Examen {

	public static void main(String[] args) {
		int[] numbers = new int[] { 10, 9, 5, 4, 8, 1, 6, 0 };
//		System.out.println(Arrays.toString(ascending(numbers)));
//		System.out.println(Arrays.toString(ascending(numbers)));
		System.out.println(Arrays.toString(reverse(numbers)));

	}
	
	// method takes a parameter as a size of array and return the array.
		public static int[] createAnArray(Scanner input) {
		
			System.out.print("enter your array size: ");
			int size = input.nextInt();
			int[] numbers = new int [size];
			System.out.println("enter your items: ");
			for (int i = 0; i < size; i++) {
				System.out.print("item no "+(i+1)+":");
				numbers[i] = input.nextInt();
				
			}
		
			System.out.println("your array is "+Arrays.toString(numbers));
			return numbers;
		
		}
		
	// to return the factor of an integer
	public static int faktor(int a){
		int count = 1 ;
		for (int i = a; i > 0; i--) {
			count *= i ;
					
		}
		return count;
	
	}
	// to print the table of temperature
	public static void reverse(int i) {
		System.out.println("Inches       centemeters");
		//					  1234567890123456
		for (int j = 1; j <= 10; j++) {
			System.out.println("  "+j+"             "+(j*2.54));
			
		}
	}

	// ascending array and return the same array
	public static int[] ascending(int[] a) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	// ascending array and return another array (AWESOME)
	public static int[] ascending1(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

					b[i] = a[i]; // to initialize the new array in same time
				}
			}
		}
		return b;
	}

	// reverse an array and return the same array
	public static int[] reverse(int[] a) {
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) { // if i<= a.length/2 will be wrong if
			int temp = a[i];                                            // we have just (even) numbers in array
			a[i] = a[j];
			a[j] = temp;
		}
		return a;
	}
	
	// method reverse an array and return the same array 
		public static int[] reverse1(int[]a) {
			for (int i = 0; i < a.length/2; i++) {
				int temp = a[i];
				a[i]=a[a.length-1-i];
				a[a.length-1-i]=temp;
				
			}
		
			return a;
			
		}
	
	// method take sorted array and count the numbers of its all items (duplicated and single)
			public static void itemCounter(char[] a) {
				int count = 1;
				int i, j;
				for (i = 0, j = i + 1; j < a.length; i++, j++) {      // we can code i < a.lenght-1
					if (a[i] == a[j]) {
						count++;
						
					} else {
						System.out.println(a[i] + "              " + count);
						count = 1;
					}
				}
				System.out.println(a[i] + "              " + count);   // to print the (last) duplicated or 
															//single items int the end of array
			}

}
