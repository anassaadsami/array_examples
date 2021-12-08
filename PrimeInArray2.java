package Array;

import java.util.ArrayList;

public class PrimeInArray2 {

	public static void main(String[] args) {
		
		int[]num = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(checkPirmeNum(num));
		
	
		for (int numToCheck = 1; numToCheck <= 50; numToCheck++) {
			boolean isPrime = true;
			for (int faktor = 2; faktor <= numToCheck / 2; faktor++) { // IMPROTANT FAKTOR MUST NOT = 1
				// boolean isPrime = true; if we move this code here it will be wrong ????
				if (numToCheck % faktor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.println(numToCheck + " is prime num.");
			else
				System.out.println(numToCheck + " is not prime.");
		}

	}
	// method check all if there is a prime numbers in array and return them in ArrayList
	
	public static ArrayList<Integer> checkPirmeNum(int[]a) {
		ArrayList<Integer> pirmeNumbers = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			boolean isPirme = true;      // it must here the boolean variable 
			for (int faktor = 2; faktor <= a[i]/2; faktor++) {
				if(a[i] % faktor == 0) {
					isPirme = false ;
					break ;
					
			}
		}
			if(isPirme)
			pirmeNumbers.add(a[i]);
		
}
		return pirmeNumbers	;


}
	

	
}
