package Array;


//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;

public class Main {
	String name ;
	int age ;
	
	public Main(String name , int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Main [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		
//	
//		String [] name = {"anas", "ali", "hiba"};
//		Arrays.sort(name);
//		System.out.println(name);    // -------> address of array 
//		System.out.println(name[0]); // ---------> anas
//		for (String item : name) {
//			System.out.print(item +" ");  // -------> all items
//		}
//		System.out.println("\n");
//		ArrayList<String> name2 = new ArrayList<String>(Arrays.asList("anas", "ali","hiba"));
//		Collections.sort(name2);
//	
//		System.out.println(name2);  // --------> all the items
//		System.out.println(name2.get(0));  // --------> anas
	//------------------------------------------	
		Main m1 = new Main("ahmed", 90);
		Main m2 = new Main("teim", 10);
		Main m3 = new Main("fofo", 15);
//		System.out.println("\n");
		Main [] boys = {m1,m2,m3};
		System.out.println(m1);   // ---------> address 
		System.out.println(boys[0]);   // ---------> address
		System.out.println(boys);   // ---------> address
		for (Main item : boys) {
			System.out.print(item+"  ");   //-----------address
			
		}
		System.out.println();
//		Arrays.sort(boys);
		for (Main item : boys) {
			System.out.println(item.toString());   //----------- // items
			
		}
//		System.out.println("\n");
//		ArrayList<Main> boys2 = new ArrayList<Main>(Arrays.asList(m1,m2,m3));
////		Collections.sort( boys2);
//		System.out.println(m1); //------------ address if without toString() in class
//		System.out.println(boys2);   // --------------address of all items if without toString() in class
//		System.out.println(boys2.get(0));   // --------------address if without toString() in class
//		for (int i = 0; i < boys2.size(); i++) {
//			System.out.print(boys2.get(i)+"  "); //------------address if without toString() in class
//		}
//		System.out.println();
//		for (int i = 0; i < boys2.size(); i++) {
//			System.out.print(boys2.get(i).toString()+" "); //------------//items
//		}
		
	}

}
