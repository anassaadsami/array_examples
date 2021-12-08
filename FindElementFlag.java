package Array;

public class FindElementFlag {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 3, 10,4, 5, 6, 7 };
		System.out.println(check(numbers, 10));
		

	}

	public static boolean check(int[] a, int num) {

		for (int item : a) {
			boolean flag = (item == num);

			if (flag)
				return true; // item not found
		}
		return false; // item found
	}

	
}