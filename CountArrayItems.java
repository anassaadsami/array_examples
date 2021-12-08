package Array;

public class CountArrayItems {

	public static void main(String[] args) {
		int[] num = { 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4,5,5,5,6,7};
		itemCounter(num);

	}
// method take sorted array and count the numbers of its all items (duplicated and single)
	public static void itemCounter(int [] a) {
		int count = 1;
		int i, j;
		for (i = 0, j = i + 1; i < a.length-1; i++, j++) {   // we can not code i < a.length 
			if (a[i] == a[j]) 
				count++;
				
			 else {
				System.out.println(a[i] + "   " + count);
				count = 1;
			}
		}
		System.out.println(a[i] + "   " + count);   // to print the (last) duplicated or 
													//single items in the end of array
	}
}
