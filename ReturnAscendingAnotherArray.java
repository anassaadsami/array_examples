package Array;

public class ReturnAscendingAnotherArray {

	public static void main(String[] args) {
		

	}
//	method takes an array and sort it ascending and return another array
	public static int[]sortArray2(int[]a){
		int[]mySortArray = new int[a.length];
		for(int i = 0 ; i < a.length ; i++ ) {
			mySortArray[i]=a[i];
		}
		for (int i = 0; i < mySortArray.length; i++) {
			for (int j = i+1; j < mySortArray.length; j++) {
				if(mySortArray[j] < mySortArray[i]) {
					int temp = mySortArray[i];
					mySortArray[i]=mySortArray[j];
					mySortArray[j]= temp;
				}
				
			}
		}
		
		return mySortArray;	
		}
	
	// ascending array and return another array (AWESOME)
		public static int[] ascending1(int[] a) {
			int[] b = new int[a.length];
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;

						b[i] = a[i]; // to initialize the new array in same time
					}
				}
			}
			return b;
	}
}

