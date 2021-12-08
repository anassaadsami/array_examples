package Array;

public class DuplicateValue {
	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 1, 4, 2, 1, 1 };
		int[] numbers1 = new int[] { 6, 2, 3, 45, 27};
		duplicate(numbers);
		duplicate(numbers, numbers1);

	}
// its not clear
	public static void duplicate(int[] num) {
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j] & (i != j)) {    // ????
					System.out.println("found "+num[j]);
					
		}
			}			
		}		
		}
	public static void duplicate(int[]num1,int[]num2) {
		boolean flag = false;
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if(num1[i]==num2[j]) {
					flag = true;
				}
				
			}
		}
		if (flag)
			System.out.println("found");
		
	}
}