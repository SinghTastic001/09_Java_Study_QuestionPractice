package Question;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] ar = {10,30,60,50,40,70,20,30};
		int[] ar_reverse = new int[ar.length];
		
		for(int i=0; i<ar.length; i++) {
			
			ar_reverse[i] = ar[ar.length-i-1];
			System.out.println(ar_reverse[i]);
			
		}
		
		
	}
}
