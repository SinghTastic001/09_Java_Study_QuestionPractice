package MaxAndMinArray;

public class MinArray {

	public static void main(String[] args) {
		
		int[] array1 = {40,30,50,20,10,1000,5};
		int min = array1[0];
		
		for(int i=1; i<array1.length; i++) {
			if(array1[i]<min) {
				min = array1[i];
			}
		}
		System.out.println(min);
	}
}
