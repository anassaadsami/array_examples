package Array;

public class EqualityOfTwoArray {

	public static void main(String[] args) {
		String[] names = new String[] { "anas", "ali", "tania", "teim" };
		String[] names1 = new String[] { "anas", "ali", "tania", };
		String[] names2 = new String[] { "anas", "ali", "tania", "teim" };

		System.out.println(equal(names1, names2));
		System.out.println(equal(names2, names));
//		int[] num = new int[] { 1, 0, 5, 0, 2, 4 };

	}

	public static boolean equal(String[] a, String[] b) {
		boolean flag = false;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b[i])
					flag = true;
			}
		} else
			flag = false;
		return flag;
	}

}
