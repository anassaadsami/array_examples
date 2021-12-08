package Array;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] num = new int[] { 1, 2, 1, 3, 4, 4, 5, 5 };
		int[] num1 = new int[] { 0, 0, 1, 0, 4, 0, 5, 5, 23, 67, 45 ,5};
		System.out.println(Arrays.toString(removeDuplicate(num)));

//		System.out.println(Arrays.toString(moveZeros(num1)));

	}

	// method to remove duplicate items from an array and return new array with
	// unique item (different length)
	public static int[] removeDuplicate(int[] a) {

		int L = a.length;
		int count = 0;
		int i;
		int[] newArray = new int[L - count];
		for (i = 0; i < L; i++) {
			for (int j = i + 1; j < L; j++) {
				if (a[i] == a[j]) {
					a[j] = a[L - 1];
					count++;
					L--;
				}

				newArray[i] = a[i];
			}

		}
		return newArray;
	}

	// method to move specific items to the end of array (AWSOME BY ME)
	public static int[] moveZeros(int[] a) {
		int l = a.length;
		int temp;
		for (int i = 0; i < l; i++) {
			if (a[i] == 5) {
				temp = a[i];
				a[i] = a[l - 1];
				a[l - 1] = temp;
				l--;
			}

		}
		return a;
	}

}
