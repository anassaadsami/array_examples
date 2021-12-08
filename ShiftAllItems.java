package Array;

import java.util.Arrays;

public class ShiftAllItems {

	public static void main(String[] args) {
//		
		int[] num1 = new int[] { 10, 20, 30, 40, 50, 60 };
                          //      1   2   3   4   5   6       length
		int x = num1[0];   // here we must code that as a separate variable cause inside the loop 
		for (int i = 0; i <num1.length-1; i++) {  // num1[0] will be 20 
			num1[i]	= num1[i+1];
		}
			num1[num1.length-1]=x;
			

		
		System.out.println(Arrays.toString(num1));

	}

}
