package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEx1 {
	String name ;
	int age ;
	
	

	public ArrayEx1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		int[] a = new int[] { 1, 3, 5, 6, 2, 4 };
		int[] b = new int[] { 1, 3, 5, 6, 2, 4 };
		int[] z = new int[] { 1, 3, 5, 6, 4, 2};
		int[] j = new int[] { 9, 8, 7, 6, 4, 2};
		String[] names = new String[] { "anas","ali","teim","fahad","teim"};
		String[] names2 = new String[] { "anas","ali","teim","fahad","teim"};
		String[] names3 = new String[] { "ali","anas","teim","fahad","teim"};
		
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList( 1, 3, 5, 6, 2, 4));
		ArrayList<Integer> num2 = new ArrayList<Integer>(Arrays.asList( 1, 3, 5, 6, 2, 4));
		ArrayList<String> name3 = new ArrayList<String>(Arrays.asList( "anas","ali","teim","fahad","teim"));
		ArrayList<String> name4 = new ArrayList<String>(Arrays.asList( "anas","ali","teim","fahad","teim"));

		ArrayEx1 x1 = new ArrayEx1("anas", 43);
		ArrayEx1 x2 = new ArrayEx1("ali", 41);
		ArrayEx1 x3 = new ArrayEx1("aya", 20);
		ArrayEx1 x4 = new ArrayEx1("teim", 15);
		ArrayEx1 [] g = {x1, x2, x3};
		ArrayEx1 [] h = {x1, x2 , x4};
		ArrayEx1 [] k = {x2, x1};
		ArrayEx1 [] l = {x1, x2};
		ArrayEx1 [] m = {x2, x1};
		ArrayEx1 [] n = {x2, x1};
		
		Arrays.fill(g,x1);
		for (ArrayEx1 item : g) {
			System.out.println(item);
			
		}
		
		
		Arrays.sort(a);   //		ascending(a);
		Arrays.sort(b);   //		ascending(a);
		Arrays.sort(j,1,3);
		System.out.println(Arrays.toString(j));
		
		if(a.equals(b))
		System.out.println("ok");    
		else
		System.out.println("not"); // -------> not
		
		System.out.println(a.equals(b)); // ----------> false
//		System.out.println(c.equals(d));  //-----------> false
		System.out.println(num.equals(num2)); // ----------> true    cause it's ArrayList
		
		System.out.println(names.equals(names2));  // ---------> false
		System.out.println(name3.equals(name4));  // ---------> true   cause it's ArrayList
		
		System.out.println("-----------------------------");
		System.out.println(Arrays.equals(b, a));
		System.out.println(Arrays.equals(names, names2));
		System.out.println(Arrays.equals(g, h));    // they have different objects
		System.out.println(Arrays.equals(k, l));   // the both array have the same objects but the have different index no
		System.out.println(Arrays.equals(m, n));   // the both array have the same in same index
		System.out.println("-----------------------------");
		System.out.println(Arrays.compare(a,b));
		System.out.println(Arrays.compare(a,z));
		System.out.println(Arrays.compare(names,names2));
		System.out.println(Arrays.compare(names,names3));
//		System.out.println(Arrays.compare(m,n));    // error cause we can not use compare method on array of objects without Comparator class 
		System.out.println("----------------------------");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		System.out.println("----------------------------");
		int[] a1 = new int[] { 1, 3, 5, 6, 2, 4 };
		char[] a2 = new char[] { 'a', 'b', 'c', 'd', 'e', 'f'};
		int[] b1 = new int[] { 1, 3, 5, 6, 2, 4 };
		String[] nam = new String[] { "anas","ali","teim","fahad","teim"};
		System.out.println("----------------------------");
		
		System.out.println(Arrays.binarySearch(nam, "anas"));
		System.out.println(Arrays.binarySearch(nam, "ali"));
		System.out.println(Arrays.binarySearch(nam, "fahad"));
		System.out.println(Arrays.binarySearch(a2, 'b'));
		System.out.println(Arrays.binarySearch(a2, 'f'));
//		Arrays.fill(a1,'65');
		
//		Arrays.fill(a1, 'h');
//		System.out.println(Arrays.toString(a1));
//		Arrays.fill(a2, '*');
//		System.out.println(a2);
//		Arrays.fill(nam, "k");
//		System.out.println(Arrays.toString(nam));
//		Arrays.fill(b, (char)42);
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.binarySearch(a, 5));
//		System.out.println(Arrays.binarySearch(names, "ali"));
//		Arrays.sort(g);
//		System.out.println(Arrays.toString(g));    // error cause it must implements Comparable or Comparator classes
//		System.out.println(Arrays.equals(name3, name4));
//		System.out.println(Arrays.compare(name3, name4));   // can not use Arrays in ArrayList
		
		
		
		
	
	}
	@Override
	public String toString() {
		return "ArrayEx1 [name=" + name + ", age=" + age + "]";
	}
		// add two Array
		public static int[] addTwoArray(int[] a, int[] b) {
			int[] c = new int[a.length + b.length];
			int p = a.length;
		
			for (int i = 0; i < a.length; i++) {
				c [i]= a[i];

			}
			for (int j = 0; j < b.length; j++) {
			c[p++] = b[j];

			}
			return c;

		}
	// Method find maxa in Array
		public static int findMax(int[]a) {	
			int max = a[0];   // this code can not be inside the loop
			for (int i = 1; i < a.length; i++) {
				if(a[i]> max) {
					max=a[i];
				}
			}
			return max;
		}

	// to sort an Array (ascending )
	public static int[]ascending(int[]a){
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				}
			}
			
		}
		return a;
	}
	// to calculate the average of sum of an Array
	public static double aveArray(int[]a) {
		int sum= 0;
		double ave =0;
		
		for (int item : a) {
			sum+=item;
			ave = sum/a.length;
		}
		return ave;
	}
	// check if the Array contains a specific value
	public static void containsIf(String [] names, String word) {
		boolean flag = false;
		int count = 0;
		for (String item : names) {
			if(item.equals(word)) {
				count++;
				flag = true;
			}	
		}	 
		if (flag)
			System.out.println(word+" found "+count+" times.");
		else
			System.out.println(word+" not found.");
		
	}
	// check if the Array contains a specific values
	static boolean check (int[]a , int x, int y) {
		for (int item : a) {
			boolean b = (item == x || item== y );    // any one of them
		
			if(b) 
				return true ;
				
		}
				return false;
		}
}