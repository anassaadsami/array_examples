package Array;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[]num=new int[] {1,2,3,4,5,6,1};

		
	findIndex1(num, 1);
		
		
	}
	// to return the index of an item in Array but it doest work well
	// cause it gives just the first match item 
	// we can do it in ArrayList
		public static int  findIndex (int[] my_array, int t) {
	        if (my_array == null) return -1;
	        int len = my_array.length;
	        int i = 0;
	        while (i < len) {
	            if (my_array[i] == t) return i;
	            else i=i+1;
	        }
	        return -1;
	    }
		// this show all index which match the x
		public static void findIndex1(int[]num,int x) {
			for (int i = 0; i < num.length; i++) {
				if(num[i]==x) 
					System.out.println(x+"found in index:"+i);
				
			}
		}
		
//		public static int[] findIndex2(int[] num, int x) {
//			int[] indexNo = new int[num.length];
//			for (int j = 0; j < indexNo.length; j++) {
//
//				for (int i = 0; i < num.length; i++) {
//					if (num[i] == x) {
//						indexNo[j] = i;
//
//					} else
//						indexNo[j] = 0;
//				}
//
//			}
//			return indexNo;
//			
//	}

}
