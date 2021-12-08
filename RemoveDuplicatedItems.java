package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatedItems {

	public static void main(String[] args) {
		int[] num = new int[] { 1, 1,9,0,8,9,0, 1, 3, 4, 4, 5, 1 };
		counter(num);
		


	}
	// remove duplicated items and return ArrayList with every single item in the original Array
	public static void counter(int[] a) {
		ArrayList<Integer> temp = new ArrayList<>();
		Arrays.sort(a);
		int count = 1;
		int i, j;
		for (i = 0, j = i + 1; j < a.length; j++, i++) {
			if (a[i] == a[j])
				count++;
			else {
				temp.add(a[i]);

			}
		}
		temp.add(a[i]);
		System.out.println(temp);
	}

}
