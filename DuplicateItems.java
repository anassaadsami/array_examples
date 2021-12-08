package Array;

import java.util.Arrays;

public class DuplicateItems {

	public static void main(String[] args) {

		int[] num = new int[] { 1, 1,9,0,8,9,0, 1, 3, 4, 4, 5, 1 };
		int[] num2 = new int[] { 1, 1,2, 3, 4, 1 };

//		System.out.println(Arrays.toString(removeDuplicate(num)));
//		System.out.println(Arrays.toString(removeDuplicate(num)));
		System.out.println(Arrays.toString(removeItem(num)));    // just for quick sol.
		int[] y = removeItem(num);
		for (int item : y) {
			System.out.print(item+"  ");
		}

	}
 // method remove duplicate items in (sorted)array and return another array 
	public static int[] removeDuplicate(int[] a) {
		Arrays.sort(a);
		int L = a.length;
		int i;
		int temp;
		int count=0 ;
		int[] newArray = new int[L - count];
		for (i = 0; i < L; i++) {
			for (int j = i + 1; j < L; j++) {
				
				if (a[i] == a[j]) {
					temp = a[j];
					a[j] = a[L - 1];
					a[L - 1] = a[j];
					L--;
					count++;
					
					
				}

			}
			newArray[i]=a[i];
		}
		return newArray ;
	}

	// method remove duplicate items from (sorted) array and return another array
	public static int[] removeItem(int[] a) {
		Arrays.sort(a); // must sorted array otherwise it will be wrong
		int j = 0;
		int[] temp = new int[a.length];
		for (int i = 0; i < a.length - 1; i++) { // to the item before last
			if (a[i] != a[i + 1]) { // just one for loop
				temp[j] = a[i]; // we can code temp[j++]= a[i] ite ok without j++
				j++;

			}
		}
		temp[j] = a[a.length - 1]; // the last item in temp array is the same last item in a array

		return temp;

	}

}
