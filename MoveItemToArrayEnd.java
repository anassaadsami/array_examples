package Array;

import java.util.Arrays;

public class MoveItemToArrayEnd {

	public static void main(String[] args) {
		int[] num = new int[] { 1, 4, 0, 3, 0, 5, 0, 2, 3 };
		int[] num2 = new int[] {8, 2, 0,4,0,3, 4, 1 ,6,7};
		int[] num1 = new int[] { 1, 1, 0, 1, 0, 1, 0, 1, 1 };

//		System.out.println(Arrays.toString(moveEvenOdd(num2)));
		System.out.println(Arrays.toString(moveEvenOdd1(num2)));
//		System.out.println(Arrays.toString(move2(num1)));

	}

	// move specific items to the end and beginning of another array and return it
	public static int[] move2(int[] a) {
		// {1,1,0,1,0,1,0,1,1}
		int x = 0;
		int L = a.length;
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				b[(L - 1)] = a[i]; // if we code a[i]=b[L-1] it will be wrong cause we will equal a[i] to zero
				L--;
			} else {
				b[x] = a[i]; // the same here
				x++;

			}
		}
		return b;
	}
// method to find the odd and even numbers and move them to the end and beginning of another array
	public static int[] moveEvenOdd(int[] a) {
		// {2,3,4,1};
		int x = 0;
		int L = a.length - 1;

		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) 
				b[L--] = a[i]; // if we code a[i]=b[L--] it will be wrong cause we will equal a[i] to zero

			 else 
				b[x++] = a[i]; // the same here

			

		}
		return b;
	}
	// move the odd and even numbers to the both ends of the same array
	public static int[]moveEvenOdd1(int[]a){
		int temp;							//{ 2, 3, 4, 1 ,6,7}
		int left = 0;
		int right = a.length-1 ;
		while(left < right) {
			while(a[left] %2 == 0 && left < right)
				left++;
			while(a[right] %2 == 1 && left < right)
				right--;
		
			if(left < right) {
				temp = a[left];
				a[left]=a[right];
				a[right]= temp;
				left++;
				right--;
			}
		}
		return a ;
		
		
}
}
