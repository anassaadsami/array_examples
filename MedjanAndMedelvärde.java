package Array;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MedjanAndMedelvärde {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = false ;
		do {
		try {
			display(input, 5);
			flag = true ;
		} catch (InputMismatchException e) {
			input.nextLine();
			System.out.println("invalid input");
		}
		}while(!flag);
		
		input.close();
		
		
	}
	
	public static void display(Scanner input , int size) throws InputMismatchException{
		int [] numbers = new int [size];
		float total = 0;
	
		for (int i = 0; i < size ; i++) {
			System.out.print("enter your "+(i+1)+ " number: ");
			numbers[i]= input.nextInt();
			total += numbers[i];
			
		}
	
		System.out.println("the medelvärde of these numbers is: "+total/size);
		float midjan ;
		if(size %2 !=0)        // we check if the size (the number of items ) is odd 
			midjan = numbers[size/2];
		else                   // the number of items is even 
			midjan = (numbers[size/2]+numbers[(size/2)-1 ])/2 ;
		System.out.println("the medjan of these numbers is: "+ midjan  );
		
	}

}
