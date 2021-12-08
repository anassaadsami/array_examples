package Array;

import java.util.Arrays;

public class CountDupblicatItem {

	public static void main(String[] args) {
		int[]num= new int[] {1,2,3,1,2,5,1};

		System.out.println(Arrays.toString(num));  //[1 1 1 2 2 3]
		move(num);
		

	}
	// method count (just) the duplicated items in an array 
	public static void move(int[]a) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			int count= 1; 
			// we put count here cause the new item will be one again
			for ( int j = i+1; j < a.length-1; j++) {
				if(a[i]==a[j]) 
					count++;
				else 	
					break;
			}
			if(count>1)       // without this code it will counts all the numbers not just the duplicated
				System.out.println(a[i]+"  "+count);
				i+=count-1;   // we want to begin form the next item after ones
			
		}
	}
	
	// method count all the items in a Array 
		public static void coutItems(int[] a) {
			Arrays.sort(a);

			for (int i = 0; i < a.length; i++) {
				int count = 1;
				for (int j = i + 1; j < a.length - 1; j++) {
					if (a[i] == a[j])
						count++;
					else
						break;
				}
				System.out.println(a[i] + "   " + count);
				i += count - 1;
			}
		}

}
