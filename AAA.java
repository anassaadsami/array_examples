package Array;

import java.util.Scanner;

public class AAA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// System.out.println(restOfdiv(input));
//		EvenOdd(input);
//		EvenOdd1(input);
//		checkLetter('a');
//		checkLetter1('o');
//		multi(5, 20);
//		displayLetter(97, 122);
//		displayLetter1(input ,'a', 'g');
//		pirmeNum(33);
		input.close();

	}

	// restvärde of division
	public static float restOfdiv(Scanner input) {
		System.out.println("enter the first num: ");
		float num1 = input.nextFloat();

		System.out.println("enter the second num: ");
		float num2 = input.nextFloat();

		float restOfDivision = num1 % num2;
		return restOfDivision;
	}

	// Even and odd
	public static void EvenOdd(Scanner input) {
		System.out.print("enter your number to check: ");
		int num = input.nextInt();
		if (num % 2 == 0)
			System.out.println(num + " is even number.");
		else
			System.out.println(num + " is odd number.");
	}

	// ternary
	public static void EvenOdd1(Scanner input) {
		System.out.print("enter your number to check: ");
		int num = input.nextInt();
		String x = (num % 2 == 0) ? (num + " is even number.") : (num + " is odd number.");
		System.out.println(x);

	}
	// vocal and consonant GOOD
	public static void checkLetter2(char ch) {
		boolean flag = false;
		String vocal = "aeiuoy";
		String y;
		String letter = Character.toString(ch); // convert char to String to can use String's method
		for (int i = 0; i < vocal.length(); i++) {
			y = Character.toString(vocal.charAt(i));
			if (y.equalsIgnoreCase(letter)) // convert the charAt(i)to String
				flag = true ;
		}
		if (!flag)
			System.out.println(ch + " is consonant letter.");

		else
			System.out.println(ch + " is vocal letter.");

	}


	// Vocal and consonant
	public static void checkLetter(char ch) {

		int count = 0;
		String vocal = "aeiuoy";
		String y;
		String letter = Character.toString(ch); // convert char to String to can use String's method
		for (int i = 0; i < vocal.length(); i++) {
			y = Character.toString(vocal.charAt(i));

			if (y.equalsIgnoreCase(letter)) // convert the charAt(i)to String
				count++;
		}
		if (count == 0)
			System.out.println(ch + " is consonant letter.");

		else
			System.out.println(ch + " is vocal letter.");

	}

	public static void checkLetter1(char ch) {
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'y':
			System.out.println(ch + " is vocal letter.");
			break;
		default:
			System.out.println(ch + " is consonant letter.");
		}

	}

	// Multiplication
	public static void multi(int n, int i) {
		for (int j = 1; j <= i; j++) {

			System.out.println(n + " * " + j + "= " + n * j);
		}

	}
	// a-----> z
	public static void displayLetter(int start , int end) {
		for (int i = start; i <= end; i++) {
			System.out.print((char)i +"  ");
			
		}
	}
	// Print any range of letters if any Case (AWESOME)
	public static void displayLetter1(Scanner input , char startChar , char endChar) {
		System.out.println("how do you want the letters:\n1 : SmallCase\n2 : UpperCase");
		int letters = input.nextInt();
		for (int i = (int)startChar ; i <= (int)endChar ; i++) {
			if(letters == 1)
			System.out.print((char)i +"  ");
			else 
				System.out.print((char)(i - 32)+"  ");	
			
		}
	}
	
	
	// Prime  
	public static void pirmeNum(int a) {
		boolean flag = true ;
		for (int i = 2; i <= a/2; i++) {
			if(a%i == 0) {
				flag = false ;
				break;
			} 
		}
		if(!flag)
		System.out.println(a +" is not prime");
		else
		System.out.println(a + " is prime.");
	}

}
