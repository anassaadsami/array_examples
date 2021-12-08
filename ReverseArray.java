package Array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[]numbers = new int[] {1,2,3,4,5,6,7,8};
		
		System.out.println(Arrays.toString(reverse(numbers)));
//		System.out.println(Arrays.toString(reverse2(numbers)));


	}
	// method reverse array and return the same array but reversed
	public static int[] reverseArray(int[]a) {
		int temp ;
		int L = a.length;
		
		for (int i = 0; i < L/2; i++) {  // we can code i<L it works also
				temp =a[i];
				a[i]=a[L-(i+1)];
				a[L-(i+1)]=temp;
			}
		return a ;
	}
	
	// method take array and return reversadArray (another array)
	public static int[]reverse(int[]num){
		int[]reversadArray = new int[num.length];
		for (int i = 0, j = reversadArray.length-1; i< num.length; j--, i++) {
			reversadArray[j]= num[i];
			
		}
		return reversadArray;
		 
	}
	// that is great way
	public static int[]reverse2(int[]array){
		int[]reversedArray = new int[array.length];
		for (int i = array.length-1 ; i>=0 ; i--) {
		reversedArray [(array.length-1)-i]= array[i];    // that is awesome by me
		
		}
		return reversedArray ;
	}


}
