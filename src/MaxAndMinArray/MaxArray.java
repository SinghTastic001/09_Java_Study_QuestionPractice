package MaxAndMinArray;

public class MaxArray {
	
	public static void main(String[] args) {
		
		int[] array = {10,100,300,500,1000,500,2000};
		int max = array[0];
		
		for(int i = 1; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		
		System.out.println(max);
	}

}
