package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeInArray {

	public static void main(String[] args) {
		System.out.println(check());

	}
// method check all numbers between range in return all prime numbers in ArrayList
	public static ArrayList<Integer> check() {
		ArrayList<Integer> pirmeNum = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.print("start no:");
		int start = input.nextInt();
		System.out.print("end no:");
		int end = input.nextInt();
		int faktor;
		int[] num = new int[(end - start) + 1];    // if out range ex between 13----20 it will be 8 items not 7 and thats why 
		for (int i = 0, j = start; i < end - start + 1; i++, j++) {    // we put +1
			boolean isPrime = true;
			num[i] = j; // here by default the value from num[0] to num[start] is zero cause its int
						// items
			for (faktor = 2; faktor <= num[i] / 2; faktor++) {
				if (num[i] % faktor == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime)
				pirmeNum.add(num[i]);
			
				
			input.close();

		}
		return pirmeNum;

	}
}