package EvenAndOddArrayPrint;

public class EqualityOfTwoArrays {
	
	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4,5,6,7,8,9};
		int[] array2 = {1,2,3,4,5,6,7,8,9};
		
		int arraycount1 = 0;
		int arraycount2 = 0;
		
		for(int i = 0; i<array1.length; i++) {
			arraycount1++;
		}
		System.out.println(arraycount1);
		
		for(int j = 0; j<array2.length; j++) {
			arraycount2++;
		}
		System.out.println(arraycount2);
		
		if(arraycount1==arraycount2) {
			System.out.println("both array are equal");
		}else {
			System.out.println("both array are not equal");
		}
	}

}
