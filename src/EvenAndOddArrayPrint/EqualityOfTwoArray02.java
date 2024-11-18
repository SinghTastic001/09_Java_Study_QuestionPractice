package EvenAndOddArrayPrint;

import java.util.Arrays;

public class EqualityOfTwoArray02 {
	
	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4,5,6,5,6};
		int[] array2 = {1,2,3,4,5,6,7,5};
		
		boolean st = Arrays.equals(array1, array2);
		if(st==true) {
			System.out.println("both are equal arrays");
		}else {
			System.out.println("both are not arrays ");
		}
		
	}

}
