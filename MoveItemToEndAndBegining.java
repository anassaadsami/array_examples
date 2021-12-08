package Array;

import java.util.Arrays;

public class MoveItemToEndAndBegining {

	public static void main(String[] args) {
		int[] num = new int[] { 1, 1, 0, 1, 0, 1, 0, 1, 1 };
//		int[] num1 = new int[] { 1, 1, 1, 2, 2, 2};
//		System.out.println(Arrays.toString(move(num)));
		System.out.println(Arrays.toString(move(num)));

	}

	// move specific items to the end of the array and return the same array	
	public static int[] move(int[] a) {
		int L = a.length;			 // [1, 1, 2, 1, 2, 1]
		int z = 0;
		for (int i = 0; i < L; i++) {
			if (a[i] == 1) {
				a[L-1] = a[i];	
				L--;

			}
			else
				a[z++] = a[i];
									// the same if we code here z++	
		}

		return a;
	}
	
	// move specific items to the end and the beginning of another array and return it
	public static int[]move3(int[]a){
		int L = a.length;
		int count = 0;
		int[]b = new int[L];
		
		for (int i = 0,j = L-1 ; i < L; i++,j--) {
			if(a[i]==1) {
				b[j]=a[i];
				
				
			}else {
				b[count++]= a[i];
				
			}
				
		}
		return b;
	}
	
	
	public static int[]move4(int[]a){
		int L = a.length;
		int count = 0;
		
		int[]b = new int[L];
		
		for (int i = 0 ; i < L; i++) {
			if(a[i]==0) {
				b[L-1]=a[i];
				L--;
				
				
			}else 
				b[count++]= a[i];
				
			
				
		}
		return b;
	}
	

}
