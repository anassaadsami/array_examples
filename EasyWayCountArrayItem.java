package Array;

import java.util.Arrays;
import java.util.Random;

public class EasyWayCountArrayItem {

	public static void main(String[] args) {
		check();

	}

	public static void check() {
		char[] x = new char[100];
		int i, j;
		int count = 0;
		String bokstav = "abcdefghijklmnopqrstuvwxyz";
		// 01234567890123456789012345
		for (i = 0; i < x.length; i++) {
			Random rand = new Random();
			char y = bokstav.charAt(rand.nextInt(26));
			x[i] += y;
		}
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));

		for (i = 0, j = i + 1; i < x.length - 1; i++, j++) {
			if (x[i] == x[j])
				count++;

			else {
				System.out.println(x[i] + "   " + count);
				count = 1;
			}

		}
		System.out.println(x[i] + "   " + count);

	}

}