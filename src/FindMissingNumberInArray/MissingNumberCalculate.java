package FindMissingNumberInArray;

public class MissingNumberCalculate {
	
	public static void main(String[] args) {
		
		
//		values should in range
//		should not have duplicate values
//		no need to be in order form
		int[] array1 = {1,2,3,4,5,7};
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<array1.length; i++) {
			sum1 = sum1+array1[i];
		}
		
		for(int i = 1; i<=7; i++) {
			sum2 = sum2 + i;
		}
		int missingarray = sum2 - sum1;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println("missing arrray is "+missingarray);
	}

}
