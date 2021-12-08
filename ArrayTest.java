package Array;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[]myList=new double[4];
		
		System.out.print("enter"+myList.length+"values:");
		for (int i = 0; i < myList.length; i++) {
			System.out.print(">");
			myList[i] = input.nextDouble();
}

	System.out.println("--------------");
	
	double total= 0;
	for(int i = 0 ; i < myList.length ; i++) {
		total+=myList[i];
	}
	System.out.println(total);
	System.out.println("---------------- ");
	
	double max = myList[0];
	for (int i = 1; i < myList.length; i++) {
		if(myList[i]>max)
			max=myList[i];
	}
	System.out.println(max);
	System.out.println("--------------");
	
	
	for (int i = 0; i < myList.length; i++) {
		myList[i]=Math.random()*100;
		System.out.println(myList[i]+"  ");
		
	}
	System.out.println("----------");
	int indexOfMax = 0;
	for (int i = 1; i < myList.length; i++) {
		if(myList[i]> max)
			max = myList[i];
			indexOfMax = i ;
		
		
	}
	System.out.println(indexOfMax);
	System.out.println("-----------");	
	
	char[]city= {'D','a','l','l','a','s'};
	System.out.println(city);

	input.close();
	}
	
	
}
